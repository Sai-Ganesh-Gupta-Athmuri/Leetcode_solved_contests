class Solution {
    public boolean doesAliceWin(String s) {
        int c = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            } 
        }
        if(map.size() == 0) return false;
        else return true;
    }
}

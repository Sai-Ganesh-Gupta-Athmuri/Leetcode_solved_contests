class Solution {
    public int maxOperations(String s) {
        ArrayList<Integer> a = new ArrayList<>();
        int j = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1') a.add(i);
        }
        // System.out.println(a);
        int c = 0;
        for(int i = 0;i<a.size()-1;i++){
            if(a.get(i+1) - a.get(i) != 1){
                a.set(i,a.get(i+1) - 1);
                c += (i+1);
            }
        }
        if(s.charAt(s.length() - 1) == '0') c+=a.size();
        return c;
    }
}

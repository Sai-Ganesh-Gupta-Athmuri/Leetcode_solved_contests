class Solution {
    public String lastNonEmptyString(String s) {
        int[] arr = new int[26];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            map.put(s.charAt(i),i);
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0;i<26;i++){
            if(arr[i] != 0) {
                min = Math.min(min,arr[i]);
                max = Math.max(max,arr[i]);
            }
        }
        // System.out.println(min+" "+max);
        if(min == 1 && max == 1) return s;
        ArrayList<Character> a = new ArrayList<>();
        for(int i = 0;i<26;i++){
            if(arr[i] == max) a.add((char)(i+97));
        }
        // for(char ch : a) System.out.println(ch);
        ArrayList<Integer> res = new ArrayList<>();
        for(Character i : map.keySet()){
            if(a.contains(i)) res.add(map.get(i));
        }
        // for(int i : res) System.out.println(i);
        Collections.sort(res);
        String str = "";
        for(int i : res) str+=s.charAt(i)+"";
        return str;
    }
}

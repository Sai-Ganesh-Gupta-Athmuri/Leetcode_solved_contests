class Solution {
    public int maximumLength(String s) {
        int res = 0;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            arr.get(s.charAt(i) - 'a').add(j - i);
            i = j - 1;
        }
        for (ArrayList<Integer> ele : arr) {
            if (ele.isEmpty()) continue;
            ele.sort(Integer::compareTo);
            int size = ele.size();
            res = Math.max(res, ele.get(size - 1) - 2);
            if (size > 1) {
                res = Math.max(res, Math.min(ele.get(size - 1) - 1, ele.get(size - 2)));  
            }
            if (size > 2) {
                res = Math.max(res, ele.get(size - 3));  
            }
        }
        if (res == 0) res = -1;
        return res;
    }
}

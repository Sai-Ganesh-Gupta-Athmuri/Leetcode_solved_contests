// You are given a string s that consists of lowercase English letters.

// A string is called special if it is made up of only a single character. For example, the string "abc" is not special, whereas the strings "ddd", "zz", and "f" are special.

// Return the length of the longest special substring of s which occurs at least thrice, or -1 if no special substring occurs at least thrice.

// A substring is a contiguous non-empty sequence of characters within a string.
 
// Constraints:

// 3 <= s.length <= 5 * 105
// s consists of only lowercase English letters.

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

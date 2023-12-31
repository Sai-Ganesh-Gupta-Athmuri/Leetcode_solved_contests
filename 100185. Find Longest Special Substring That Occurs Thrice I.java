// You are given a string s that consists of lowercase English letters.

// A string is called special if it is made up of only a single character. For example, the string "abc" is not special, whereas the strings "ddd", "zz", and "f" are special.

// Return the length of the longest special substring of s which occurs at least thrice, or -1 if no special substring occurs at least thrice.

// A substring is a contiguous non-empty sequence of characters within a string.

// Constraints:

// 3 <= s.length <= 50
// s consists of only lowercase English letters.

class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                String str = s.substring(i,j+1);
                boolean check = true;
                for(int k = 1;k<str.length();k++){
                    if(str.charAt(k) != str.charAt(k-1)){
                        check = false;
                        break;
                    } 
                }
                if(check && map.containsKey(str)){
                    int f = map.get(str);
                    map.put(str,f+1);
                }else if(check && !map.containsKey(str)){
                    map.put(str,1);
                }
            }
        }
        int max = -1;
        int c = 0;
        for(String key : map.keySet()){
            if(map.get(key) >= 3 && key.length()>max){
                max = key.length();
            }
        }
        return max;
    }
}

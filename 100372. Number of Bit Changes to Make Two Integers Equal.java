class Solution {
    public int minChanges(int n, int k) {
        StringBuilder a = new StringBuilder(Integer.toBinaryString(n));
        StringBuilder b = new StringBuilder(Integer.toBinaryString(k));
        while (a.length() < b.length()) {
            a.insert(0, '0');
        }
        while (b.length() < a.length()) {
            b.insert(0, '0');
        }
        String a1 = a.toString();
        String b1 = b.toString();
        int c = 0;
        String res = "";
        for(int i = 0;i<a1.length();i++){
            if(a1.charAt(i) == b1.charAt(i)) res += a1.charAt(i);
            else if(a1.charAt(i) == '1'){
                c++;
                res += "0";
            }else{
                res += a1.charAt(i);
            }
        }
        if(res.equals(b1)) return c;
        else return -1;
    }
}

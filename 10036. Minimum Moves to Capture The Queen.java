public class Solution {

    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        int ans = 2;
        int p = a, q = b;

        while (p <= 8) {
            if (p == c && b == d)
                break;
            if (p == e && b == f)
                return 1;
            p++;
        }

        p = a;
        q = b;
        while (p >= 0) {
            if (p == c && b == d)
                break;
            if (p == e && b == f)
                return 1;
            p--;
        }

        p = a;
        q = b;
        while (q <= 8) {
            if (a == c && q == d)
                break;
            if (a == e && q == f)
                return 1;
            q++;
        }

        p = a;
        q = b;
        while (q >= 0) {
            if (a == c && q == d)
                break;
            if (a == e && q == f)
                return 1;
            q--;
        }

        int x = c, y = d;
        while (x >= 0 && y >= 0) {
            if (x == a && y == b)
                break;
            if (x == e && y == f)
                return 1;
            x--;
            y--;
        }

        x = c;
        y = d;
        while (x >= 0 && y <= 8) {
            if (x == a && y == b)
                break;
            if (x == e && y == f)
                return 1;
            x--;
            y++;
        }

        x = c;
        y = d;
        while (x <= 8 && y >= 0) {
            if (x == a && y == b)
                break;
            if (x == e && y == f)
                return 1;
            x++;
            y--;
        }

        x = c;
        y = d;
        while (x <= 8 && y <= 8) {
            if (x == a && y == b)
                break;
            if (x == e && y == f)
                return 1;
            x++;
            y++;
        }

        return ans;
    }
}

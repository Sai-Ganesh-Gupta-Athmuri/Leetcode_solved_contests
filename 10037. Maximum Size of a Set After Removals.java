import java.util.*;

public class Solution {

    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        Set<Integer> st = new HashSet<>();

        for (int i : nums1) mp1.put(i, mp1.getOrDefault(i, 0) + 1);
        for (int i : nums2) mp2.put(i, mp2.getOrDefault(i, 0) + 1);

        int ans1 = 0, ans2 = 0;
        int cnt1 = 0, cnt2 = 0, ans = 0;

        for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (!mp2.containsKey(key)) {
                ans1 += 1;
                cnt1 += (value - 1);
                mp1.put(key, 0);
            } else {
                st.add(key);
                ans += 1;
            }
        }
        ans1 = Math.min(ans1, n / 2);

        for (Map.Entry<Integer, Integer> entry : mp2.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (!mp1.containsKey(key)) {
                ans2 += 1;
                cnt2 += (value - 1);
                mp2.put(key, 1);
            } else {
                st.add(key);
            }
        }
        ans2 = Math.min(ans2, m / 2);

        return Math.min(ans1 + ans2 + ans, n);
    }
}

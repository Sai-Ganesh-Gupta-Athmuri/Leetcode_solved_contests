class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        double min = 50.0;
        for(int i = 0;i<n;i++){
            double avg = (nums[i] + nums[n - i - 1])/2.0;
            if(avg < min) min = avg;
        }
        return min;
    }
}

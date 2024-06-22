class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length,c = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0 && i < n - 2){
                nums[i] = 1;
                nums[i+1] = nums[i+1] == 0 ? 1: 0;
                nums[i+2] = nums[i+2] == 0 ? 1: 0;
                c++;
            }
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 1) count++;
        }
        if(count == n) return c;
        else return -1;

    }
}

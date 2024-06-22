class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length,c = 0,zc = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0){
                nums[i] = 1;
                c++;
                zc++;
            }
            if(i != n-1) nums[i+1] = zc % 2 == 0 ? nums[i+1] : 1 - nums[i+1];
        }
        return c;
    }
}

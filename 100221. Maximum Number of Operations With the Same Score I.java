class Solution {
    public int maxOperations(int[] nums) {
        int n = nums.length;
        int c = 1;
        int sum = nums[0]+nums[1];
        for(int i = 2;i<n-1;i+=2){
            if(nums[i]+nums[i+1] == sum) c++;
            else break;
        }
        return c;
    }
}

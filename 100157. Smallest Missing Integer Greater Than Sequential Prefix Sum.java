class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums) arr.add(i);
        int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] - nums[i-1] == 1 ){
                sum += nums[i];
            }else{
break;}
        }
        System.out.println(sum);
        while(sum>0){
            if(arr.contains(sum)) sum++;
            else return sum;
        }
        return -1;
    }
}

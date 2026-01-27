class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,sum1=0,j=0;
        sum=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            sum1=sum1+nums[i];
        }
        int result=sum-sum1;
        return result;
    }

}
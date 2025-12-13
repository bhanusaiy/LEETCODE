class Solution {
    //bhan
    public int searchInsert(int[] nums, int target) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                  n=i;
            }
            else{
                if(nums[i]<target){
                    n=i+1;
                }
            }
        }
        return n;
    }
}

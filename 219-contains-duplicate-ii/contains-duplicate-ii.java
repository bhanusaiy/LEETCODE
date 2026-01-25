class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> intset=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
                intset.remove(nums[i-k-1]);
            }
            if(!intset.add(nums[i])){
                return true;
            }
        }
        return false;

    }
}
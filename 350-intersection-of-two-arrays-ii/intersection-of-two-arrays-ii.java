class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int j=0;
        for(int nums:nums1){
            if(map.containsKey(nums)){
                map.put(nums,map.get(nums)+1);
            }
            else{
                map.put(nums,1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                res[j]=nums2[i];
                j++;
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        return Arrays.copyOf(res, j);
    }
}
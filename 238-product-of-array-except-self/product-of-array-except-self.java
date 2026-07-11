class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        
        int n=nums.length;
        arr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            arr[i]=arr[i]*suffix;
            suffix=suffix*nums[i];
        }
        return arr;
    }
}
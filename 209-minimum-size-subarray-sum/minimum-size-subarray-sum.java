class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0, length = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                length = right - left + 1;
                minlen = Math.min(minlen, length);

                sum -= nums[left];
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
    }
}
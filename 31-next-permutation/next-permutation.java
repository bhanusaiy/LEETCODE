class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;

        
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        
        if (ind == -1) {
            int k = 0;
            int j = n - 1;

            while (k < j) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k++;
                j--;
            }
            return;
        }

       
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        
        int left = ind + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
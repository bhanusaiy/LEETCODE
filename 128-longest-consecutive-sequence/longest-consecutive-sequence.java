class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Check every number
        for (int num : set) {

            // Start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }
}

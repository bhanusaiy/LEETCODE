class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';

            freq[index]++;

            maxFreq = Math.max(maxFreq, freq[index]);

            int windowLength = right - left + 1;

            int replacements = windowLength - maxFreq;

            while (replacements > k) {

                int leftIndex = s.charAt(left) - 'A';

                freq[leftIndex]--;

                left++;

                windowLength = right - left + 1;

                replacements = windowLength - maxFreq;
            }

            maxLength = Math.max(maxLength, windowLength);
        }

        return maxLength;
    }
}
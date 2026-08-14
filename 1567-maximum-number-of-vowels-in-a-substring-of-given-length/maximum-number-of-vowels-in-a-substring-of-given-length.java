class Solution {
    public int maxVowels(String s, int k) {

        int maxlen = 0, left = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') {

                count++;
            }
            if (i - left + 1 > k) {
                if (s.charAt(left) == 'a' ||
                        s.charAt(left) == 'e' ||
                        s.charAt(left) == 'i' ||
                        s.charAt(left) == 'o' ||
                        s.charAt(left) == 'u') {

                    count--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, count);

        }

        return maxlen;
    }
}
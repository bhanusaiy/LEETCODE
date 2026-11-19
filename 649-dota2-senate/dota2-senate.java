class Solution {
    public String predictPartyVictory(String senate) {

        int n = senate.length();
        boolean[] banned = new boolean[n];

        int radiantCount = 0;
        int direCount = 0;

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiantCount++;
            } else {
                direCount++;
            }
        }

        while (radiantCount > 0 && direCount > 0) {

            for (int i = 0; i < n; i++) {

                if (banned[i]) {
                    continue;
                }

                char current = senate.charAt(i);

                // Find the next active opponent
                for (int j = 1; j < n; j++) {

                    int index = (i + j) % n;

                    if (!banned[index] &&
                        senate.charAt(index) != current) {

                        banned[index] = true;

                        if (current == 'R') {
                            direCount--;
                        } else {
                            radiantCount--;
                        }

                        break;
                    }
                }

                if (radiantCount == 0 || direCount == 0) {
                    break;
                }
            }
        }

        return radiantCount > 0 ? "Radiant" : "Dire";
    }
}
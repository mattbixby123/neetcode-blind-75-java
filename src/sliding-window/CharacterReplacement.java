// leetcode # 424 - longest repeating character replacement
// o(n) time o(1) space - sliding window
public class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l = 0, maxf = 0, maxLen = 0;

        for (int r = 0; r < s.length(); r++) {
            maxf = Math.max(maxf, ++count[s.charAt(r) - 'A']);

            if ((r-l+1) - maxf > k) {
                count[s.charAt(l++) - 'A']--;
            } else {
                maxLen = r - l + 1;
            }
        }
        return maxLen;
    }
}
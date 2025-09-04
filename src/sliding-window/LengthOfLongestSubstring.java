// leetcode # 3 - longest substring without repeating characters
// slilding window + hashmap
// O(n) time O(min(m,n)) space where n is the length of the string and m is the size of the charset
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            if (mp.containsKey(s.charAt(r))) {
                l = Math.max(l, mp.get(s.charAt(r)) + 1);
            }
            mp.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
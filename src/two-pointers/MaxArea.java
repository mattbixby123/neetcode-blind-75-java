// leetcode # 11 - container with most water
// two pointers
public class MaxArea {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int res = 0;

        while (l < r) {
            int current = Math.min(heights[l], heights[r]) * (r - l);
            res = Math.max(res, current);

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
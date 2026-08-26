class Solution {
    public int maxArea(int[] heights) {
        int max = Math.min(heights[0], heights[1]);
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int cur = (right - left) * Math.min(heights[left], heights[right]);

            if (cur > max) {
                max = cur;
            }

            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}

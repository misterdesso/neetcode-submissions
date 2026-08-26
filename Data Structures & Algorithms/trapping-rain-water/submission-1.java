class Solution {
    public int trap(int[] height) {
        int[] maxLeft = Arrays.copyOf(height, height.length);
        int[] maxRight = Arrays.copyOf(height, height.length);

        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);
        }

        int water = 0;
        for (int i = 1; i < height.length - 1; i++) {
            water += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }
        return water;
    }
}

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (height[left] <= leftMax) {
                    water += leftMax - height[left];
                } else {
                    leftMax = height[left];
                }
            } else {
                right--;
                if (height[right] <= rightMax) {
                    water += rightMax - height[right];
                } else {
                    rightMax = height[right];
                }
            }
        }
        return water;
    }
}

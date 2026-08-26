class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[left] + nums[right] > target) {
                    right--;
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    int addLeft = nums[left];
                    int addRight = nums[right];
                    temp.add(addLeft);
                    temp.add(addRight);
                    temp.add(nums[i]);
                    result.add(temp);

                    while (left < right && nums[left] == addLeft) {
                        left++;
                    }
                    while (left < right && nums[right] == addRight) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}

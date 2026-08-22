class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.keySet().contains(need)) {
                int[] result = {seen.get(need), i};
                return result;
            }
            seen.put(nums[i], i);
        }
        return null;
    }
}

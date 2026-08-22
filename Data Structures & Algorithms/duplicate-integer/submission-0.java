class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dedup = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            dedup.add(nums[i]);
        }
        if (dedup.size() != nums.length) {
            return true;
        } else {
            return false;
        }
    }
}
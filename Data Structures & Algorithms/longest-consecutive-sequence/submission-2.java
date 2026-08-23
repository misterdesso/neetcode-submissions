class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        Set<Integer> numSet = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toSet());

        List<Integer> starts = new ArrayList<>();
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                starts.add(num);
            }
        }

        int max = 1;
        for (int s : starts) {
            int i = 1;
            while (numSet.contains(s + i)) {
                i++;
            }
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

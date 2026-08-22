class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.merge(num, 1, Integer::sum);
        }

        List<Integer> ranking = new ArrayList<>(freq.keySet());
        ranking.sort((a, b) -> freq.get(b) - freq.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = ranking.get(i);
        }
        return result;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ref = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            ref.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(ref.values());
    }
}
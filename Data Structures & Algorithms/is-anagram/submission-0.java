class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            sList.add((Character) sArr[i]);
        }
        for (int i = 0; i < t.length(); i++) {
            tList.add((Character) tArr[i]);
        }

        Collections.sort(sList);
        Collections.sort(tList);

        if (sList.equals(tList)) {
            return true;
        } else {
            return false;
        }
    }
}

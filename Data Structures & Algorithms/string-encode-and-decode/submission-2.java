class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            sb.append(Integer.toString(strs.get(i).length()));
            sb.append("!");
            sb.append(strs.get(i));
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        char[] strArr = str.toCharArray();

        int i = 0;
        while (i < str.length()) {
            StringBuilder sbLen = new StringBuilder();
            int j = i;
            while (strArr[j] != '!') {
                sbLen.append(strArr[j]);
                j++;
            }
            int len = Integer.parseInt(sbLen.toString());

            i = j + 1;
            int k = 0;
            StringBuilder sbStr = new StringBuilder();
            while (k < len) {
                sbStr.append(str.charAt(i));
                k++;
                i++;
            }
            result.add(sbStr.toString());
        }
        return result;
    }
}

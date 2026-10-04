class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        try {
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    temp.push(c);
                } else if (c == ')') {
                    if (temp.pop() != '(') {
                        return false;
                    }
                } else if (c == ']') {
                    if (temp.pop() != '[') {
                        return false;
                    }
                } else if (c == '}') {
                    if (temp.pop() != '{') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } catch (EmptyStackException e) {
            return false;
        }
        if (temp.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

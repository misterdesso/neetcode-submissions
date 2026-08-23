class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] rows = new HashSet[9];
        Set<Integer>[] cols = new HashSet[9];
        Set<Integer>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                if (board[i][j] == '.') {
                    continue;
                }

                int cur = Integer.parseInt(Character.toString(board[i][j]));

                // row check
                if (!rows[i].add(cur)) {
                    return false;
                }
                // col check
                if (!cols[j].add(cur)) {
                    return false;
                }
                // box check
                int boxRow = i / 3;
                int boxCol = j / 3;
                int boxIndex = boxRow * 3 + boxCol;
                if (!boxes[boxIndex].add(cur)) {
                    return false;
                }
            }
        }
        return true;
    }
}

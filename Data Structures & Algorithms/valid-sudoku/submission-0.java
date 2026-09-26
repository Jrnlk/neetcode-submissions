class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            col[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int x = 0; x < 9; x++) {

            for (int y = 0; y < 9; y++) {

                char curr = board[x][y];
                if (curr == '.') {
                    continue;
                }

                if (!rows[x].contains(curr)) {
                    rows[x].add(curr);
                } else {
                    return false;
                }

                if (!col[y].contains(curr)) {
                    col[y].add(curr);
                } else {
                    return false;
                }

            }
        }

        for (int bx = 0; bx < 9; bx++) {
            for (int by = 0; by < 9; by++) {

                char curr = board[bx][by];

                if (curr == '.') {
                    continue;
                }

                int boxInd = (bx / 3) * 3 + (by/3);
                if (!boxes[boxInd].contains(curr)) {
                    boxes[boxInd].add(curr);
                } else {
                    return false;
                }

            }
        }



        return true;
    }
}

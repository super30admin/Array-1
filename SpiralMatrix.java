class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int dir = 0;

        while (top <= bottom && left <= right) {
            switch (dir) {
                case 0: // move right
                    for (int i = left; i <= right; i++) {
                        ans.add(matrix[top][i]);
                    }
                    top++;
                    break;
                case 1: // move down
                    for (int i = top; i <= bottom; i++) {
                        ans.add(matrix[i][right]);
                    }
                    right--;
                    break;
                case 2: // move left
                    for (int i = right; i >= left; i--) {
                        ans.add(matrix[bottom][i]);
                    }
                    bottom--;
                    break;
                case 3: // move right
                    for (int i = bottom; i >= top; i--) {
                        ans.add(matrix[i][left]);
                    }
                    left++;
                    break;
            }

            dir = (dir + 1) % 4;
        }
        return ans;
    }
}

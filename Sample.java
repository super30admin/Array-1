// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class Sample {
    // Time Complexity : O(n)
    // Space Complexity : O(1) since we return re[]
    // Did this code successfully run on Leetcode : yes
    public int[] productExceptSelf(int[] nums) {
        int [] re = new int[nums.length];
        re[0] = 1;
        int rProd = 1;


        for (int i = 1; i < nums.length; i++) {
            re[i] = nums[i - 1] * re[i-1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rProd = nums[i + 1] * rProd;
            re[i] = re[i] * rProd;

        }
        return re;
    }

    // Time Complexity : O(n * m)
    // Space Complexity : O(1) since we return ans
    // Did this code successfully run on Leetcode : yes

    public int[] findDiagonalOrder(int[][] mat) {
        int [] ans = new int[mat.length * mat[0].length];
        boolean direction = true;
        int sum = 0;
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < mat.length && j < mat[0].length) {
            ans[index++] = mat[i][j];
            if (direction) {
                if (j == mat[0].length - 1) {
                    i++;
                    direction = false;
                } else if (i == 0 ) {
                    j++;
                    direction = false;

                } else {
                    j++;
                    i--;
                }
            } else {
                if (i == mat.length - 1) {
                    j++;
                    direction = true;
                } else if (j == 0) {
                    direction = true;
                    i++;
                } else {
                    j--;
                    i++;
                }

            }
        }
        return ans;
    }

    // Time Complexity : O(n * m)
    // Space Complexity : O(1) since we return ans
    // Did this code successfully run on Leetcode : yes
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right =  matrix[0].length - 1;

        while (left <= right && top <= bottom ) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom && left <= right; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            for (int i = right; i >= left && top <= bottom; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top && left <= right; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;

    }

}
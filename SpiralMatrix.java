//Time Complexity : O(m*n), since we would traverse all element in the matrix, m is number of rows, n is number of columns in the given matrix
//Space Complexity : O(m*n), for the output array with all the elements in the spiral order, here m*n could also be written as N where N is total number of elements
//Did it run on leetcode : yes
//Approach:
//Spiral order could be seen as in recursively doing 4 steps, trace forward column wise, trace down row wise, trace back column wise, trace up row wise
//we keep track of the boundaries as they need to shrink
  
class Solution {
    public List <Integer> spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0)
            return ans;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) ans.add(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
}
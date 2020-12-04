/** Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
* Time complexity O(M*N). Space complexity O(1). Using direection variable determine if we are traversing upwards or downwards 
*/
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int m = matrix.length, n = matrix[0].length;
        int [] order = new int [m*n];
        int dir = 1, index = 0;
        int i = 0, j = 0;
        while(index < m*n) {
            order[index] = matrix[i][j];
                if (dir == 1) {
                    if (j == n-1) {
                        dir = -1;
                        i++;
                    } 
                    else if (i == 0 ) {
                        dir = -1;
                        j++;
                    }
                    else {
                        i--;
                        j++;
                    }
                }
                else
                {
                    if (i == m-1) {
                        dir = +1;
                        j++;
                    } 
                    else if (j == 0 ) {
                        dir = +1;
                        i++;
                    }
                    else {
                        i++;
                        j--;
                    }
                }
            index ++;
            }
        return order;
        }
    }

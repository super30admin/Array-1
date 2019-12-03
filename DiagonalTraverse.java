//Time Complexity: O(mn)
//Space Complexity: O(1)
// Description of approach: take a direction variable and reverse the traversing direction at each of the 4 boundaries of the matrix
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0){
            return new int[0];
        }
        int m =matrix.length, n = matrix[0].length;
        int[] result = new int[m*n];
        int i=0,r=0,c=0;
        int dir = 1;
        
        while(i< m*n){
            result[i] = matrix[r][c];
            if(dir == 1){
                 if(c==n-1){
                     r++; //reached right bound
                     dir = -1;
                 }
                else if(r==0){
                    c++; //reached upper bound
                    dir = -1;
                }
                else{
                    r--;//traverse diagonally for normal matrix elements
                    c++;
                }
            }
            
            else{
                if(r == m-1){
                    c++;
                    dir = 1;
                }
                else if(c ==0){
                    r++;
                    dir = 1;
                }
                else{
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }
}
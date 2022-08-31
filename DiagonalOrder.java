//TC: O(n) where n is the number of elements in the matrix
//SC: O(n)
//Program ran on leetcode successfully.
public class DiagonalOrder {
        public int[] findDiagonalOrder(int[][] mat) {
            
            if (mat == null){
                return new int[] {};
            }
            
            int numRows = mat.length;
            int numCols = mat[0].length;
            
            if (numRows == 0){
                return new int[] {};
            }
    
            int[] res = new int[numRows * numCols];
            int i = 0, j = 0;
            boolean Up = true;
    
            for(int k = 0; k < res.length; k++){
                res[k] = mat[i][j];
                
                if(Up){
                    if(j == numCols - 1)
                    {
                        Up = false;
                        i++;
                    }
                    else if(i==0)
                    {
                        j++;
                        Up = false;
    
                    }
                    else
                    {
                        i--;
                        j++;
                    }
    
                }
                else{
                    if(i == numRows - 1)
                    {
                        Up = true;
                        j++;
                    }
                    else if(j == 0)
                    {
                        Up = true;
                        i++;
                    }
                    else
                    {
                        i++;
                        j--;
                    }
                }
            }
            return res;
        }
}

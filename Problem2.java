/**
 * Time complexity - O(n^2)
 * Space complexity - O(1)
 * All test cases passed
 */
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        /**
         Travel in up direction
         Change the direction
         Maintain one variable for direction
         direction = 1 means upward and direction = -1 means downward
         if index goes out of bound change the direction
         When going up, index will go from i,j to i-1,j+1
         When going down, index will go from i,j i+1,j-1
         **/
        if(matrix==null||matrix.length==0)
            return new int[]{};

        int dir = 1;
        int i=0;
        int j=0;
        int row = matrix.length;
        int column = matrix[0].length;
        int[] result = new int[row*column];
        int k=0;

        if(column==1){
            for(int m=0; m<row; m++)
            {
                result[m]=matrix[m][0];
            }
            return result;
        }


        while(k<result.length)
        {
            result[k] = matrix[i][j];
            if(dir==1)
            {
                if(j==column-1)
                {
                    dir=-1;
                    i++;
                }

                else if(i==0)
                {
                    dir=-1;
                    j++;
                }

                else
                {
                    i--;
                    j++;
                }

            }
            else
            {
                if(i==row-1)
                {
                    dir=1;
                    j++;
                }

                else if(j==0)
                {
                    dir=1;
                    i++;
                }

                else
                {
                    i++;
                    j--;
                }

            }
            k++;
        }

        return result;
    }
}
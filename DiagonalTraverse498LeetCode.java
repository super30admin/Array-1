//Time Complexity:O(m*n) m,n = row and column of a matrix
//Space Complexity: O(1)
//it runs successfully on leetcode
// I dont face any problems


public class DiagonalTraverse498LeetCode {

    public static final int UP = 0;
    public static final int DOWN = 1;

    public int[] findDiagonalOrder(int[][] matrix) {

        int m = matrix.length;                  //row length
        int n = matrix[0].length;               //column length

        int direction = UP;
        int[] result = new int[m*n];            //output array
        int index = 0;                          //output array index

        int i=0;
        int j=0;

        while(index<result.length){

            result[index] = matrix[i][j];     //adding element to the output
            index++;

            if(direction == UP){                //checking the flow

                if(j == n-1){                   //handles the column edge case
                    i++;
                    direction = DOWN;
                }
                else if(i == 0){               // handles the row edge case
                    j++;
                    direction = DOWN;
                }
                else{
                    i--;
                    j++;
                }

            }
            else{

                if(i == m-1){               //handles the row edge case
                    j++;
                    direction = UP;
                }
                else if(j == 0){            //handles the column edge case
                    i++;
                    direction = UP;
                }
                else{
                    i++;
                    j--;
                }

            }

        }

        return result;

    }
}

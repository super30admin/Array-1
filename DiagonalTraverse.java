/* Time complexity: O(MN)
Space complexity: O(1)
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int count = 0; //keep track of number of elements visited
        int[] results = new int[mat.length*mat[0].length];
        int dir = 1; //lets start with up direction
        int i=0; int j=0; //lets start with 1st index
        int upperLimit = 0;
        int lowerLimit = mat.length-1;
        int leftLimit = 0;
        int rightLimit = mat[0].length-1;
        while(count<mat.length*mat[0].length)
        {
            if(dir==1) //Move upwards
            {
                while(i>=upperLimit && j<=rightLimit)
                {
                    results[count] = mat[i][j];
                    count++;
                    i--; //move one row up
                    j++; //move one column right
                }
                if(j>rightLimit) //in a [3*3] matrix, if we are at [0,3], we need to move one row below and keep the coloumn same
                {
                    j--; 
                    i++; 
                }
                i++; //just to negate the last decrement done in while loop before we came out of it
//note: We did not negate the last increment in j done in while loop because we want to move to the next column
                dir = -1;
            }
            else //Move downwards
            {
                while(i<=lowerLimit && j>=leftLimit)
                {
                    results[count] = mat[i][j];
                    count++;
                    i++; //move one row down
                    j--; //move one column left
                }
                if(i>lowerLimit) //in [3*3] matrix, if we are at [3,0], we need to move one column right and keep the row the same
                {
                    i--;
                    j++;
                }
                j++; //just to negate the last decrement done in while loop before we came out of it
//note: We did not negate the last increment in i done in while loop because we want to move to the row below
                dir = 1;
            }
        }
        return results;
    }
}
// Time Complexity :O(mn)
// Space Complexity :O(1) no auxilary space used
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
{
    //When going up there are two edge cases to handle,
        // 1)when you are at the first row ,then col++ and change direction to down
        // Then you are at the last column of the first row ,row++ and change direction to down
    //other wise normal traverse to up is row-- & col ++
    
    //When you are traversing down you need to handle two edge cases
        //1)When are at column zero,you have to increment row & change direction
        //When you are the last row, column ++ and direction Up
    //otherwise normal traverse to down is row ++, col--
    
    if(mat == null || mat.length==0)
        return new int[0];

    //Solving this problem with two scenarios- Going up and going down
    //Going up represented as 1 and going down represented as -1

    int dir = 1;
    int m = mat.length, n = mat[0].length;
    int row = 0, col = 0, i=0;

    //Return the 1D array
    int[] result = new int[m*n];

    while(i < m*n){
        //Going up
        result[i] = mat[row][col];//Updating results with the matrix values
        if(dir == 1){
            //Going in upward direction ,handling when end of column is hit
            if(col == n-1){
                row ++;
                dir = -1;
            }
            //When going in upward direction, the immediate column exist for the downward turn,
            else if(row == 0){
                col++;
                dir = -1;
            }
            //Normal diagonal traverse to up
            else{
                row --;
                col ++;
            }
        }
        //going down
        //Going down and hitting the end of row
        else {
            if(row == m-1){
                col ++;
                dir =1;
            }
            //When at column 0
            else if (col == 0){
                row++;
                dir = 1;
            }
            //normal traverse down
            else{
                row ++;
                col --;
            }
        }
        i++;
    }
    return result;
        
    }

    public static void main(String args[]){
        int[][] arr = {{1,2,3},{4,5,6}};
        int []result = printout(arr);

       System.out.println(Arrays.toString(result));

    }
}
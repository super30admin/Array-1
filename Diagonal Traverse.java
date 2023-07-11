// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*Here, we need to traverse in upward and downward direction diagonally. For moving in upward direction, we need to change the direction in two cases, when we have reached the first row and when we have reached the last column
 * when we have reached the last column, we we need to move to the next row. When we have reached the first row, we need to move to the next column, and in both the cases we need to change the direction to downward.
 * Similarly,when we have to move in downward direction, we need to check if we have reached the last row and if we have reached the first column. If we have reached the last row, then we have to change the direction to upwards and
 * increment the column and decrement the row. If we have reached the first column, then we have to change the direction and increment the row. 
 */

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
int m=mat.length;
int n=mat[0].length;
int r=0,c=0;
boolean flag=true;
int [] result=new int[m*n];

for(int idx=0;idx<result.length;idx++)
{
//idx is the index of the result array
result[idx]=mat[r][c];

    //Upward
    if(flag)
    {
        if(c==n-1) // if we have reached the last column
        {
            flag=false; //change the direction to downwards
            r++;        //move to the next row
        }
        else if(r==0) // if we have reached the first row
        {
            flag=false; //change the direction to downwards
            c++;        //move to the next column
        }
        else
        {
         //if no base conditions are true, we move to the row above(since we are moving upwards) and next column
            r--; 
            c++;
        }
    }
    //Downward
    else
    {
        if(r==m-1) // if we have reached the last row
        {
            flag=true; //change the direction to upwards
            c++;        //move to the next column
        }
        else if(c==0) // if we have reached the first column
        {
            flag=true; //change the direction to downwards
            r++;        //move to the next row
        }
        else
        {
         //if no base conditions are true, we move to the row below(since we are moving downwards) and previous column
            r++; 
            c--;
        }

    }

}

   return result;     
    }
}


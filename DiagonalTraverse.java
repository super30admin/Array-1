// Time Complexity : There is one while loop that runs through the size of the input - O(MxN) || All other comparison operations take constant time. || So total Asymtotic Time Complexity - O(MxN) 
// Space Complexity : Since, there are no auxillary arrays used in the code - O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

import java.util.*;
import java.lang.String;
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[]{};  //edge case where input is null or empty
        int m = matrix.length;    //length of rows
        int n = matrix[0].length; //length of columns
        int[] result = new int[m*n];   
        int r = 0, c = 0, i = 0; 
        int direction = 1;      //if going up = 1 else going down=-1
        while(i < m*n)
        {   
            result[i] = matrix[r][c];  //print the current element at ith index
            if(direction == 1) //going upwards 
            {  
                if(c == n - 1)
                {   //check if pointer is at last column
                    r++;
                    direction = -1;   //change direction then
                }
                
                else if(r == 0){  //check if pointer is at row 1
                    c++;
                    direction = -1; //change direction then
                }
                else { //row is not 0 and column is not last
                    r--;  
                    c++;
                }
            }
           else{ //direction = -1;    
               if(r == m - 1)   //similar checking conditions as above loop
               {      
                   c++;
                   direction = 1;
                   
               }
               else if(c == 0)
               {
                   r++;
                   direction = 1;
               }
               else{
                   r++;
                   c--;
               }
               
            } 
        i++;
        }
        return result; //return traversed array 

    }
}

//Main class

class Main
{
    public static void main(String[] args)
    {
    DiagonalTraverse obj = new DiagonalTraverse();
    int[][] input = {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                    };
    int[] result = obj.findDiagonalOrder(input);
    System.out.print("Diagonal Traverse Order of the given input array " + Arrays.deepToString(input) + " is " + Arrays.toString(result) + "\n"); //returns [1,2,4,7,5,3,6,8,9]
    }
}
//Question: 54. Spiral Matrix
//Time Complexity :O(m*n) as iterating through all elements denoted by m no. of rows * n no. of columns 
//Space Complexity : O(1) i.e. as no extra space is required as I have used arraylist which stores same no. of elements as array matrix 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*Step 1: check and return empty list if there are no elements in matrix. Initialize m and n as no. of rows and columns and initialize pointers as top, bottom, left, right
 * Step 2: Initialize index as 0. And declare and initialize new list in which we will store the result and return.
 * Step 3: we will keep iterating through rows and columns till the corresponding pointers like (top and bottom) or (left and right) crosses each other. Crossing means we have to stop
 * and no more have to iterate
 * Step 4: First iterate from top first element to last element in same row. Then change the top pointer to top++ and in same column iterate through 
 * last element and update the pointer right to right--.
 * Step 5: Iterate from right till left and update bottom--. Likewise iterate from bottom to top and update left++. 
 * Step 6: Keep storing all the rows and columns denoted value in the list untill no pointers cross each other as said in step 3. After the crossing of 
 * points come out of loop and return he result
 */

import java.util.*;

public class spiralMatrix {

	public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix == null) return new ArrayList<>();
        
        int m= matrix.length;
        int n= matrix[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        int index=0;
        List<Integer> result=new ArrayList<>();

        while(left<=right && top<=bottom)
        {
            //top row
            for(int i=left; i<=right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            
            //right col
            if(left<=right && top<=bottom){
            for(int j=top; j<=bottom; j++)
            {
                result.add(matrix[j][right]);
            }
            right--;}
            
            //bottom row
            if(left<=right && top<=bottom)
            {
                for(int k=right ;k>=left ; k--)
                {
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }
            //left column
            if(left<=right && top<=bottom)
            {
                for(int l=bottom ;l>=top ; l--)
                {
                    result.add(matrix[l][left]);
                }
                left++;
            }
        }
        return result;
    }
	public static void main(String[] args) {


		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		
		ArrayList<Integer> arr= new ArrayList<>();
		arr=(ArrayList<Integer>) spiralOrder(mat);
		
		for(int i:arr) {
		System.out.print(i+" ");}

	}

}

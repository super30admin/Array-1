//498. Diagonal Traverse
//Time Complexity :O(m*n) as iterating through all elements denoted by m no. of rows * n no. of columns 
//Space Complexity : O(1) i.e. as no extra space is required as I have used arraylist which stores same no. of elements as array matrix 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*Step 1: check and return empty array if there are no elements in matrix. Initialize m and n as no. of rows and columns and initialize pointers r and c as 0 for row and col.
 * Step 2: Initialize index as 0. And declare and initialize new array in which we will store the result and return.
 * Step 3: we will keep iterating through rows and columns till the index is less than last element's index.
 * Step 4: First iterate from element at 0th row and 0th column considering by default upward direction. Then from 1st element increment the column and update the direction as 
 * -1 for downward direction 
 * Step 5: Check for special conditions, such as col == n-1 means last column for each row's element because there we can't do col++. Same goes with last row elements.
 */

public class diagonalTraverse {

	public static int[] findDiagonalOrder(int[][] mat) {
        if(mat.length ==0 || mat == null) return new int[]{};
        
        
        int r=0,c=0;
        int m=mat.length;//rows
        int n= mat[0].length; //columns
        int[] result= new int[m*n];
        int index=0;
        int dir=1; //by default 1 : for upward and -1 for downward
        
        while(index < (m*n))
        {
            result[index] = mat[r][c];
            index++;
            
            if(dir == 1)
            {
                if(c==n-1){
                    dir=-1;
                    r++;
                }
                else if(r==0)
                {
                    c++; //increment the column
                    dir=-1; // make the direction downwards
                }
                else 
                {  //keep moving upward
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    dir=1;  // make the direction upwards
                    c++;
                }
                else if(c==0)
                {
                    r++; //increment the row
                    dir=1; // make the direction upwards
                }
                else 
                {  //keep moving downward
                    r++;
                    c--;
                }
            }
        }
        return result;
            
     }
	public static void main(String[] args) {
		int[][] mat= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int m=mat.length;//rows
        int n= mat[0].length; //columns
        int[] result= new int[m*n];
		result=findDiagonalOrder(mat);
		for(int i=0; i<(m*n);i++) {
		System.out.print(result[i]+" ");}
	}

}

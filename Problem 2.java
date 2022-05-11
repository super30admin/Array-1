class Solution {
            public int[] findDiagonalOrder(int[][] matrix) {
                int m=matrix.length; int n=matrix[0].length;  //taking length of rows and colums of matrix
                int [] result = new int[n*m]; //intialziing an array of size the number of elements in the matrix
                //null condition
                if(matrix==null)return new int[0];
                int r=0; int c=0; int dir=1; //defining variables for rows and colums and directions
                int i=0;  //for result array index
                while(i<m*n){  //while loop for number of elemnets times
                    result[i]=matrix[r][c];  //add all the elements of matrix into array
                    i++; //increase array index for each added element from matrix
                    if(dir==1){
                        if(r==0 && c!=n-1){  //this condition for element is in first row but not in last column
                            dir=-1; c++;}
                        else if(c==n-1){  //condition for elements in last column
                            dir=-1;r++;}
                        else{   //for all elemtns that doesnt satisfy the above conditions
                            r--;
                            c++;}
                    }
                    else{
                        if(c==0 && r!=m-1){  //this condition for element is in first column but not in last row
                            dir=1; r++;}
                        else if(r==m-1){ //condition for elements in last row
                            dir=1;c++;}
                        else{  //for all elemtns that doesnt satisfy the above conditions
                            c--;
                            r++;}
                    }
                }
                return result; //the above conditions satisfy all types of cases, so return result
            }
}
 

//time complexity : o(n)
//space complexity: o(1)
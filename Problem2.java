//Problem 498 : Diaognal Traverse
//Time complexity : O(m*n) m is number of rows , n is number of columns in the given maqtrix
//Space complexity : O(1) as we don't consider input and output array space in calculating space complexity
//Successfully solved on leetcode and faced no issues
//Approach : I start from the top-left of the matrix and move diagonally up-right, collecting elements as I go. Whenever I reach the top row or the rightmost column, I change direction and start moving down-left instead. Similarly, if I hit the bottom row or the leftmost column while moving down-left, I switch back to moving up-right, and I keep doing this until I’ve visited every element.


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;  //number of rows
        int n = mat[0].length;  //number of columns
        int[] arr = new int[m*n]; //final output array
        int row=0 ;
        int column = 0;
        boolean flag = true;  //true means upwards , false means downwards
        for(int idx = 0; idx < arr.length ;idx ++){ //idx means index on arr
            arr[idx] = mat[row][column];
            if(flag == true){  //when there is breach towards upwards direction
               if(column==n-1){  //when we breach right boundary
                   flag = false;
                    row++;
                }
                else if(row==0){  //when we breach top boundary
                    flag = false;
                    column++;
                }
                else{   //when there is no breach
                    row--;
                    column++;
                }
            }
            else{   //when there is breach towards downward direction
                if(row == m-1){     //when we breach bottom boundary
                    flag = true;
                    column++;
                }
                else if(column==0){  //when we breach left boundary
                    flag = true;
                    row ++;
                }
                else{   //when there is no breach
                    row++;
                    column--;
                }

                


            }
        }
        return arr;



        
    }
}
/**
## Problem 2
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order 
as shown in the below image.
 
Time Complexity :   O (M*N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (498. Diagonal Traverse)
Any problem you faced while coding this :       No
 */

 // Logic: Calculate left elements product and right elements product and then multiply them
 class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null)
            return new int[]{};
        
        int n = mat[0].length;  // columns
        int m = mat.length;     // rows
        
        int[] res = new int[m*n];
        
        int r=0;
        int c=0;
        int dir =1;   // dir=1 -> up direction, dir=-1 -> down direction
        int idx = 0;
        
        while(idx < res.length){
            res[idx] = mat[r][c];
            idx++;

            // UP direction
            if(dir == 1){
                if(c==n-1){             // last column
                    r++;
                    dir = -1;
                }else if(r==0){         // first row
                    c++;
                    dir = -1;
                }else{                  // middle value
                    r--;
                    c++;
                }
            }
            // DOWN direction
            else {
                if(r==m-1){             // last row
                    c++;
                    dir = 1;
                }else if(c==0){         // first column
                    r++;
                    dir = 1;
                }else{                  // middle value
                    c--;
                    r++;
                }
            }
        }
        return res;
    }
    
    public static void main(String args[]) 
    { 
        FindDiagonalOrder obj = new FindDiagonalOrder();
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] res = obj.findDiagonalOrder(mat);

        // print result
        for(int num: res){
            System.out.print(num +" ");
        }
    }
}
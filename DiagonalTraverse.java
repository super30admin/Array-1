// Time Complexity :O(MN)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yess
// Three line explanation of solution in plain english- first we find for upward and then downward

class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int m= mat.length;
            int n= mat[0].length;
            int i=0;
            int j=0;
            int result[]=new int[m*n];
            boolean direction = true;
            for(int idx=0; idx<result.length; idx++){
                result[idx]= mat[i][j];

                if(direction){              //upward
                    if(i==0 && j!= n-1){
                        j++; direction=false;
                    }
                    else if(j==n-1){
                        i++; direction=false;
                    }
                    else{
                    i--;
                    j++;
                    }
                } 
                else{                       //downward
                    if(j==0 && i!= m-1){
                        i++; direction=true;
                    }
                    else if(i==m-1){
                        j++; direction=true;
                    }
                    else{
                    j--;
                    i++;
                    }
                }
            }   
        return result;
            
        }
}
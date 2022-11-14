/*
Tim Complexity --> 
O(m*n)

Space Complexity -->
O(m*n) for storing array
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        // ArrayList<Integer> arr = new ArrayList<>();
        
        int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[m*n];
        if(m==1 && n==1){
            arr[0] = mat[0][0];
            return arr;
        }//if
        
        int dir = 1; // This is for going upward direction
        int index = 0;
        int i=0;
        int j=0;
        
        while(index<m*n){
            arr[index]=mat[i][j];
            index++;
            if(dir==1){
                
                
                if(j==n-1){
                    i++;
                    dir=-1;
                    
                }
                else if(i==0){
                    j++;
                    dir=-1;
                }
                else{
                    i--;
                    j++;
                }
            }//dir ==1 upward direction
            
            else{
                if(i==m-1){
                    j++;
                    dir=1;
                }
                else if(j==0){
                    i++;
                    dir=1;
                }
                else{
                   i++;
                   j--;
                }
                
            }// downward direction
        }//while
        
        return arr;
        
        
    }// public
}
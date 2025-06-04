//Time Complexity : O(m*n)
//Space Complexity : O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n = mat[0].length;
        int[] arr = new int [m*n];
        int i=0;
        int j=0;
        boolean flag = true;
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = mat[i][j];
            if(flag){
                if(j == n-1){
                    flag = false;
                    i++;
                }else if(i==0){
                    flag = false;
                    j++;
                } else{
                    i--;
                    j++;
                }
            }else {
                if(i == m-1){
                  flag = true;
                  j++;
                }else if(j==0){
                    flag = true;
                    i++;
                } else{
                    j--;
                    i++;
                }

            }
        }
        return arr;        
    }
}

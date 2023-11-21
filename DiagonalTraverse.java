//Time Complexity: O(m*n)
//Space Complexity: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];

        int r = 0, c=0;
        boolean isUp = true;

        for(int i = 0;i< m*n;i++){
            result[i] = mat[r][c];

            if(isUp){
                if(c==n-1){
                    r++;
                    isUp= false;
                }
                else if(r==0){
                    c++;
                    isUp = false;
                }
                else {
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    c++;
                    isUp= true;
                }
                else if(c==0 && r!=m-1){
                    r++;
                    isUp = true;
                } 
                else{
                    c--;
                    r++;
                }
            }
            }
        return result;
    }
}
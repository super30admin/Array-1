#time complexity = O(m*n)
#space coplexity = O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] out = new int[mat.length*mat[0].length];
        int idx = 0; int i=0; int j=0;
        boolean flag = true;
        while(idx < mat.length*mat[0].length){
            out[idx] = mat[i][j];
            idx++;
            if(flag){
                if(j==mat[0].length-1){
                    flag = false;
                    i++;
                }
                else if(i==0){
                    flag = false;
                    j++;
                }else{
                    i--;j++;
                }
            }else{
                if(i==mat.length-1){
                    flag = true;
                    j++;
                }
                else if(j==0){
                    flag = true;
                    i++;
                }else{
                    j--;i++;
                }
            }
        }
        return out;
    }
}

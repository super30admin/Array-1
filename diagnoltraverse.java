//time complexity:O(mn)
//space complexity:O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int dir=0;
        int[] result=new int[mat.length*mat[0].length];
        int counter=0;
        int i=0;
        int j=0;
        while(counter<result.length){
            result[counter]=mat[i][j];
            if(dir==0){
                if(j==mat[0].length-1){
                    i++;dir=1;
                }else if(i==0){
                    j++;dir=1;
                }
                else{
                    i--;
                    j++;
                }
            }else{
                if(i==mat.length-1){
                    j++;
                    dir=0;
                }
                else if(j==0){
                    i++;
                    dir=0;
                }
                else{
                    j--;
                    i++;
                }
            }
            counter++;
        }
        return result;
    }
}

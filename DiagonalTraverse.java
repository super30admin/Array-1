// Time Complexity :O(mxn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english : We are traversing in matrix with direction true with upward and direction false with downward and handling the out edge cases


public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int col=mat[0].length;
        int row=mat.length;
        int[] result=new int[row*col];
        result[0]=mat[0][0];
        int index=0;
        int i=0; int j=0;
        boolean direction=true;
        while(index<col*row){
            result[index]=mat[i][j];
            index++;

            //Up
            if(direction){
                if(i==0&&j!=col-1){
                    j++;
                    direction=false;
                }
                else if(j==col-1){
                    i++;
                    direction=false;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(j==0 && i!=row-1){
                    i++;
                    direction=true;
                }
                else if(i==row-1){
                    j++;
                    direction=true;
                }
                else{
                    i++;
                    j--;
                }
            }

        }

        return result;
    }

}
Time complexity :O(nm)
Space complexity :O(1)
Run on leetcode : yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row=0;
        int col=0;
        int dir=1;
        int index=0;
        int[] result = new int[mat[0].length*mat.length];
        while(row<mat.length && col<mat[0].length){

            result[index]=mat[row][col];
            index=index+1;
            if(dir==1){
                if(row==0){
                    if(col!=mat[0].length-1){
                        col=col+1;
                        dir=-1;
                    }else{
                        row=row+1;
                        dir=-1;
                    }
                }else if(col==mat[0].length-1){
                    row=row+1;
                    dir=-1;
                }
                else{
                    row=row-1;
                    col=col+1;
                }
            }else{
                if(col==0){
                    if(row!=mat.length-1){
                        row=row+1;
                        dir=1;
                    }else{
                        col=col+1;
                        dir=1;
                    }

                }
                else if(row==mat.length-1){
                    col=col+1;
                    dir=1;
                }

                else{

                    row=row+1;
                    col=col-1;
                }
            }
        }
        return result;
    }
}
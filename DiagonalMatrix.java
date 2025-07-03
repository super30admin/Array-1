// TC- O(n)
// SC- O(1)

// We solve this with setting direction for each index and checking to increase or decrease row/col in loop.
class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat==null || mat.length==0){
            return new int[] {};        
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] answer = new int[m*n];
        int row=0;
        int col=0;
        int index=0;
        int dir=1; // 1- bottom to top and -1 top to bottom

        while(index<m*n){
            answer[index] = mat[row][col];
            index++;
            // logic for bottom to top
            if(dir==1){
                if(col==n-1){
                    dir=-1;
                    row++;
                }
                else if(row==0){
                    dir=-1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            // logic for top to bottom
            else{
                if(row==m-1){
                    dir=1;
                    col++;

                }
                else if(col==0){
                    dir=1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }                

            }
        }

        return answer;
    }
}
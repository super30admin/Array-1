public class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int rowLength = mat.length;
        int coulumnLength = mat[0].length;

        int r = 0, c= 0;
        boolean flag = true; // up direction

        int[] result = new int[rowLength * coulumnLength];

        for(int i =0 ; i< rowLength * coulumnLength; i++){

            result[i] = mat[r][c];

            if(flag){ //upward direction
                if( r == 0 && c != coulumnLength-1){
                    flag = false;
                    c++;
                }
                else if(c == coulumnLength-1){
                    flag = false;
                    r++;
                }
                else{
                    r--;
                    c++;
                }

            }
            else{ // downward direction
                if( c == 0 && r != rowLength-1){
                    flag = true;
                    r++;
                }
                else if(r == rowLength-1){
                    flag = true;
                    c++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}

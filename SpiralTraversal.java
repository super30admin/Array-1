public class SpiralTraversal {
    // TC is O(m*n)
    // SC is O(m*n)
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rlow = 0, rhigh = m-1;
        int clow = 0, chigh = n-1;
        List<Integer> arr = new ArrayList<>();
        while(rlow<=rhigh && clow<=chigh){
            for(int j=clow; j<=chigh;j++){
                arr.add(matrix[rlow][j]);
            }
            rlow++;
            if(rlow<=rhigh && clow<=chigh){
            for(int i=rlow; i<=rhigh;i++){
                arr.add(matrix[i][chigh]);
            }
            }
            chigh--;
            if(clow<=chigh && rlow<=rhigh){
            for(int j=chigh; j>=clow;j--){
                arr.add(matrix[rhigh][j]);
            }
            }
            rhigh--;
            if(rlow<=rhigh && clow<=chigh){
            for(int i=rhigh; i>=rlow;i--){
                arr.add(matrix[i][clow]);
            }
            }
            clow++;
            }
        return arr;
    }
}

/**
 *
 * Time Complexity - O(m*n) - m=rows n=cols
 * Space Complexity - O(m*n) - m=rows n=cols
 *
 */


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // base case
        if(matrix == null || matrix.length==0){
            return result;
        }
        int[] dR = {0,1,0,-1};
        int[] dC = {1,0,-1,0};
        int R = matrix.length, C = matrix[0].length;
        boolean[][] seen = new boolean[R][C];
        int r = 0, c=0, di=0;
        for(int i=0; i< R*C;i++){
            result.add(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + dR[di];
            int cc = c + dC[di];

            if(cr >=0 && cr < R && cc < C && cc>=0 && !seen[cr][cc]){
                r = cr;
                c = cc;
            }else{
                di = (di+1)%4;
                r += dR[di];
                c += dC[di];
            }
        }

        return result;
    }
}
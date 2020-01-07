package Day11;
//TC: O(m*n)
//SC: O(1)
public class DiagonalMatrix {

    public int[] findDiagonalOrder(int[][] matrix) {

        //Edge case
        if(matrix == null || matrix.length == 0) return new int[]{};

        int m = matrix.length;
        int n = matrix[0].length;

        int result[] = new int[m*n];

        int i = 0;
        int r = 0;
        int c = 0;
        int dir = 1;

        while(i < m * n){
            //first element in matrix is first element in the array
            result[i] = matrix[r][c];

            if( dir == 1){
                if(c == n-1){
                    r++;
                    dir = -1;
                }
                else if(r == 0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r == m-1){
                    c++;
                    dir = 1;
                }
                else if(c == 0){
                    r++;
                    dir = 1;
                }
                else{
                    r++;
                    c--;
                }
            }
            i++;
        }

        return result;
    }

    public static void main(String args[]){
        int [][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};

        DiagonalMatrix obj = new DiagonalMatrix();

        int res[] = new int[matrix.length];

        res = obj.findDiagonalOrder(matrix);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }

    }
}

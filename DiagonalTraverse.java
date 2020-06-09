/**
 * Time Complexity: O(m*n) where m = number of rows, n = number of columns
 * Space Complexity: O(1)
 */

public class DiagonalTraverse{
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int i,r,c,dir;
        i=r=c=0; dir = 1;
        while(i<m*n){
            result[i] = matrix[r][c];
            if(dir==1){
                if(c==n-1){
                    r++;
                    dir=-1;
                }
                else if(r==0){
                    c++;
                    dir = -1;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    c++;
                    dir=1;
                }
                else if(c==0){
                    r++;
                    dir=1;
                }
                else{
                    c--;
                    r++;
                }
            }i++;
        }
        return result;
    }

    public static void main(String args[]){
        DiagonalTraverse obj = new DiagonalTraverse();
        int[][] myArr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] result;
        result = obj.findDiagonalOrder(myArr);
        for(int x:result){
            System.out.print(x+",");
        }
    }
}
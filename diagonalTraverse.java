// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.Arrays;

class diagonalTraverse {
        public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) {
            return new int[] {};
        }

        int m=mat.length;
        int n=mat[0].length;
        int[] result = new int[m*n];
        int r=0,c=0;
        int index=0;
        int dir=1; //1 - up, -1 - down

        while(index< m*n){
            result[index]=mat[r][c];
            index++;
            if(dir==1){
                if(c==n-1){
                    dir=-1;
                    r++;
                }
                else if(r==0){
                    dir=-1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    dir=1;
                    c++;
                }
                else if(c==0){
                    dir=1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
    diagonalTraverse rs = new diagonalTraverse();
    int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {1, 2},
            {3, 4}
        };
    int[] result=rs.findDiagonalOrder(matrix1);
    int[] result2=rs.findDiagonalOrder(matrix2);

    System.out.println(Arrays.toString(result));  // ans = [1,2,3,4,5,6,7,8,9]
    System.out.println(Arrays.toString(result2));  // ans = [1,2,3,4]
}

}
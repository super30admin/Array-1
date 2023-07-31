import java.util.Arrays;
//TC=O(m*n)
//SC=O(1)
public class Problem498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int totalElements=m*n;
        int[] result=new int[totalElements];
        int counter=0;
        int i=0;
        int j=0;
        boolean dir=true;
        while(counter<totalElements){
            result[counter]=mat[i][j];
            counter++;
            if(dir){
                if(i==0 && j<n-1){
                    j++;
                    dir=false;
                }
                else if(j==n-1) {
                    i++;
                    dir=false;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(j==0 && i<m-1){
                    i++;
                    dir=true;
                }
                else if(i==m-1){
                    j++;
                    dir=true;
                }
                else{
                    i++;
                    j--;
                }
            }
        }

        return result;
    }

        public static void main(String[] args) {
        Problem498 problem=new Problem498();
        System.out.println(Arrays.toString(problem.findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})));
    }
}

import  java.util.*;
public class SpiralMatrix {
        /*
          TC:O(m*n) where m -> rows and n-> columns of matrix
          SC:O(1)
        */
        public List<Integer> spiralOrder(int[][] matrix) {
            if(matrix==null || matrix.length==0 || matrix[0].length==0) return new ArrayList<>();

            int m=matrix.length;
            int n=matrix[0].length;

            int left=0,top=0,right=n-1,bottom=m-1;
            List<Integer> result=new ArrayList<>();

            while(left<=right && top<=bottom){
                for(int j=left;j<=right;j++){
                    result.add(matrix[top][j]);
                }
                top++;

                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
                right--;

                if(left<=right && top<=bottom){

                    for(int j=right;j>=left;j--){
                        result.add(matrix[bottom][j]);
                    }
                    bottom--;

                    for(int i=bottom;i>=top;i--){
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return result;
        }
}
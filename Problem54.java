import java.util.ArrayList;
import java.util.List;
//TC=O(m*n)
//SC=O(1)

public class Problem54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int right=n-1;
        int bottom=m-1;
        int left=0;
        while(top<=bottom && left<=right){
            for(int t=left;t<=right;t++){
                result.add(matrix[top][t]);
            }
            top++;
            for(int r=top;r<=bottom;r++){
                result.add(matrix[r][right]);
            }
            right--;
            if (top <= bottom) {
                for(int b=right;b>=left;b--){
                    result.add(matrix[bottom][b]);
                }
                bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>=top;l--){
                    result.add(matrix[l][left]);
                }
                left++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Problem54 problem=new Problem54();
        System.out.println(problem.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}

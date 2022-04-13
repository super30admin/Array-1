import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class sprialMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int top =0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> res = new ArrayList<>();

        while(top <= bottom && left <= right){
            for(int i =left; i<= right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            if(top <= bottom && left <= right){
                for(int j=top; j<= bottom;j++){
                    res.add(matrix[j][right]);
                }
                right--;
            }

            if(top <= bottom && left <= right){
                for(int i= right; i >= left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(top <= bottom && left <= right){
                for(int j=bottom; j >= top;j--){
                    res.add(matrix[j][left]);
                }
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        sprialMatrix sm = new sprialMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(sm.spiralOrder(matrix).toArray()));
    }
}
import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    //TC will be O(m * n) where m*n is size of array
    //SC will be O(1), as traversing just once.

    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix == null || matrix.length == 0){
            return new ArrayList();
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int top=0;        //Variable to move in each corner
        int bottom= m-1;
        int left =0;
        int right = n-1;

        List<Integer> result = new ArrayList<>();

        while(top<=bottom && left<=right){
            //Add element left to right.

            for(int i=left;i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //Add elements top to bottom.
            for(int i=top; i<= bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            // Add elements right to left.
            if(top<=bottom){      //need to check again as top changed.
                for(int i =right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            //Add element from bottom to top.
            if(left<=right){      //need to check again as right changed
                for(int i=bottom ;i>= top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }


    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix obj = new SpiralMatrix();
        System.out.println(obj.spiralOrder(matrix));
    }
}
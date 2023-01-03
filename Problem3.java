public class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowLength = matrix.length;
        int coulumnLength = matrix[0].length;

        int r = 0, c= 0;
        int right = coulumnLength -1;
        int left = 0;
        int bottom = rowLength - 1;
        int top = 0;

        List<Integer> list = new ArrayList<>();

        // 4 directions: right, left, top, bottom

        while(top <= bottom && left <= right){

            for(int j=left; j<= right; j++){
                list.add(matrix[top][j]);
            }
            top++;

            if(top <= bottom && left <= right){
                for(int i=top; i<= bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }


            if(top <= bottom && left <= right){
                for(int j=right; j >= left; j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }


            if(top <= bottom && left <= right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }

        return list;

    }
}

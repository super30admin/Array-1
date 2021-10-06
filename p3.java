class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arraylist = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = m -1;
        int top = 0;
        int bottom = n - 1;

        while(top <= bottom && left <= right){

            for(int x = left; x <= right; x++){
                arraylist.add(matrix[top][x]);
            } top++;
            for(int x = top; x <= bottom; x++){
                arraylist.add(matrix[x][right]);
            } right--;

            if(top <= bottom && left <= right){


                for(int x = right; x >= left; x--){
                    arraylist.add(matrix[bottom][x]);
                } bottom--;
                for(int x = bottom; x >= top; x--){
                    arraylist.add(matrix[x][left]);
                } left++;
            }
        } return arraylist;
    }
}
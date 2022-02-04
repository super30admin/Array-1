class Solution
{
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix.length-1;
        int top = 0;
        int bottom = matrix[0].length-1;

        List<Integer> result = new ArrayList<>();

        int row = 0;
        int col = 0;

        while(top <= bottom && left <= right)
        {
            System.out.println("top : "+ top + " left " + left + " bot " +
                               bottom + " right " + right + " entered");

            //start from each corner element
            row = left;
            col = top;

            //traverse right until bottom boundary
            while(col <= bottom){
                result.add(matrix[row][col++]);
            }
            left++;//increased for next time
            row++;// now for next iteration
            col--;//coming within the bounds as last one would take out of bounds

            //check if already done break
            if(top > bottom || left > right) break;

            //traverse down until right boundary
            while(row <= right){
                result.add(matrix[row++][col]);
            }
            row--;
            col--;
            bottom--;
            if(top > bottom || left > right) break;


            //traverse left until top
            while(col >= top){
                result.add(matrix[row][col--]);
            }
            right--;
            col++;
            row--;
            if(top > bottom || left > right) break;

            //traverse top until left hits
            while(row >= left){
                result.add(matrix[row--][col]);
            }
            row++;
            top++;
            col++;
            System.out.println("pass completed");
        }

        return result;
    }
}

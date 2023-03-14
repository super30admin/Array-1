/**
Time Complexity - O(M * N) where M * N is the size of the matrix.
Space Complexity - O(M * N) where M * N is the size of the matrix.
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0)
            return null;

        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        List<Integer> list = new ArrayList<Integer>();
        int row = 0, col = -1;

        while(true) {
            for(int i = 0; i < colLen; i++)
                list.add(matrix[row][++col]);
            if(--rowLen == 0) break;

            for(int j = 0; j < rowLen; j++)
                list.add(matrix[++row][col]);
            if(--colLen == 0) break;

            for(int i = 0; i < colLen; i++)
                list.add(matrix[row][--col]);
            if(--rowLen == 0) break;

            for(int j = 0; j < rowLen; j++)
                list.add(matrix[--row][col]);
            if(--colLen == 0) break;
        }

        return list;
    }
}

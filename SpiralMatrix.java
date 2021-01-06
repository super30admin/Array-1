/*
TC: O(mn)
SC: O(N)
thought process: take 4 pointers at each edges of matrix and add elements in spiral order.
 */

class SpiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int m = matrix.length, n = matrix[0].length;

        int t = 0, b = m-1;
        int l = 0, r = n-1;


        while(t <= b && l <= r){
            //row constant
            for (int i = l; i <= r; i++){
                list.add(matrix[t][i]);
            }
            t++;//t = 1
            //col constant
            for (int i = t; i <= b; i++){
                list.add(matrix[i][r]);
            }
            r--;
            if (l > r || t > b) break;
            //row constant
            for (int i = r; i >= l; i--){
                list.add(matrix[b][i]);
            }
            b--;
            //col constant
            for (int i = b; i>= t; i--){
                list.add(matrix[i][l]);
            }
            l++;
        }

        return list;
    }
}
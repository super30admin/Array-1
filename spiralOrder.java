// Time Complexity: As we are only traversing whole matrix once and limiting row and column for each addition time complexity is O(m*n)
// Space Complexity: We used only constants to maintain the boundaries for spiral O(1)
// Did you complete the code on leet code: Yes
// Any problems faced: using Array instead of ArrayList confused me with the indices to chose.

// Write your approach here
// Idea here is to simulate the exact problem statement by making bounaries for start and end of rows traversed and start and end of columns traversed.
// each time we complete traversing a box we make box smaller by changing boundaries for start row and start column with +1 and end row and end column with -1.
// when we perform these operation till mn-1'th element, we return the result
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int rowStartLimit = 0;
        int rowEndLimit = m-1;
        int columnStartLimit = 0;
        int columnEndLimit = n-1;
        
        while(res.size()<m*n) {
            for(int j=columnStartLimit; j<=columnEndLimit; j++) {
                res.add(matrix[rowStartLimit][j]);
            }
            for(int i=rowStartLimit+1; i<= rowEndLimit; i++) {
                res.add(matrix[i][columnEndLimit]);
            }
            if(rowEndLimit!=rowStartLimit){
                for(int j=columnEndLimit-1; j>=columnStartLimit; j--) {
                    res.add(matrix[rowEndLimit][j]);
                }
            }
            if(columnEndLimit!=columnStartLimit){
                for(int i=rowEndLimit-1; i> rowStartLimit; i--) {
                    res.add(matrix[i][columnStartLimit]);
                }
            }
            columnStartLimit++;
            columnEndLimit--;
            rowStartLimit++;
            rowEndLimit--;
        }
        return res;
    }
}
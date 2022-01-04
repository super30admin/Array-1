class Solution {
    // Time Complexity : O(mn), where m is the no of rows and n is the no of cols of the matrix
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int r1 = 0;
            int r2 = matrix.length-1;
            int c1 = 0;
            int c2 = matrix[0].length-1;
            List<Integer> res = new ArrayList<>();

            while(r1 <= r2 && c1 <= c2) {
                for(int i = c1; i <= c2; i++) {
                    res.add(matrix[r1][i]);
                }
                r1++;

                for(int i = r1; i <= r2; i++){
                    res.add(matrix[i][c2]);
                }
                c2--;

                if(r1 <= r2) {
                    for(int i = c2; i >=c1; i--) {
                        res.add(matrix[r2][i]);
                    }
                    r2--;
                }

                if(c1 <= c2) {
                    for(int i = r2; i >= r1; i--){
                        res.add(matrix[i][c1]);
                    }
                    c1++;
                }
            }
            return res;
        }
    }
}
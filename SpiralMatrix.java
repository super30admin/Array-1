// Time Complexity: O(n)
// Space Complexity: O(1) - if result list is not considered in space complexity
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0) {
            return res;
        }
        int r1 = 0, c1 = 0;
        int r2 = matrix.length-1, c2 = matrix[0].length-1;

        while (r1 <=r2  && c1 <= c2) {
            for(int c = c1; c<=c2; c++) {
                res.add(matrix[r1][c]);
            }

            for(int r=r1+1; r<=r2; r++) {
                res.add(matrix[r][c2]);
            }

            if(r1<r2 && c1<c2) {
                for(int c= c2-1; c>=c1; c--) {
                    res.add(matrix[r2][c]);
                }

                for(int r=r2-1; r> r1; r--) {
                    res.add(matrix[r][c1]);
                }
            }

            r1++;
            r2--;
            c1++;
            c2--;
        }

        return res;

    }
}
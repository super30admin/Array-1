// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: Maintain 4 pointers to mark the 4 corners of the matrix. Print the first
// spiral and reduce the pointers, repeat until all elements are printed. Print the first row from l to r, inc t. Print right most column
//from t to b and dec r. Similarly print bottom row from r to l and dec b. Lastly print first column, from b to t and inc l pointer
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = n-1, t = 0, b = m-1;
        while(l<=r && t<=b){
            //top row
            for(int j=l;j<=r;j++){
                res.add(matrix[t][j]);
            }
            t++;
            //right column
            if(l<=r && t<=b){
                for(int i=t;i<=b;i++){
                    res.add(matrix[i][r]);
                }
                r--;
            }
            
            //bottom row
            if(l<=r && t<=b){
                for(int j=r;j>=l;j--){
                    res.add(matrix[b][j]);
                }
                b--;
            }

            //left column
            if(l<=r && t<=b){
                for(int i=b;i>=t;i--){
                    res.add(matrix[i][l]);
                }
                l++;
            }
        }
        return res;
    }
}
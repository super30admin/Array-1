// Time Complexity : O(m*n)
// Space Complexity : O(1) not considering out space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// set the indices to traver the four directions
// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int L, R, T, B;
        L = 0;
        T = 0;
        R = mat[0].length;
        B = mat.length;

        int i = 0, j = 0;
        int size = R-- * B--;
        List<Integer> ans = new ArrayList<>();

        while (true) {
            // right
            i = T;
            for (j = L; j <= R; j++)
                ans.add(mat[i][j]);
            T++;
            if (ans.size() == size)
                return ans;

            // down
            j = R;
            for (i = T; i <= B; i++)
                ans.add(mat[i][j]);
            R--;
            if (ans.size() == size)
                return ans;

            // left
            i = B;
            for (j = R; j >= L; j--)
                ans.add(mat[i][j]);
            B--;
            if (ans.size() == size)
                return ans;

            // up
            j = L;
            for (i = B; i >= T; i--)
                ans.add(mat[i][j]);
            L++;
            if (ans.size() == size)
                return ans;

        }

    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int rs = 0, re = m-1, cs = 0, ce =n-1;
        while(ans.size() !=m*n){
            for(int j = cs; j<=ce; ++j){
                ans.add(matrix[rs][j]);
            }
            ++rs;
            for(int i = rs; i<=re; ++i){
                ans.add(matrix[i][ce]);
            }
            --ce;
            if(rs<=re){
            for(int j = ce; j>=cs; --j){
                ans.add(matrix[re][j]);
            }
            --re;
            }
            if(cs<=ce){
            for(int i = re; i>=rs; --i){
                ans.add(matrix[i][cs]);
            }
            ++cs;
        }}
        return ans;
    }
}
//tc=O(n)
//sc=O(1)

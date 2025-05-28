//check boundaries and keep shrinking the them after reaching the end
//Time Complexity: O(n^2)
//Space Complexity: O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int l=0;
        int r=matrix[0].length-1;
        int t=0;
        int b=matrix.length-1;

        while(l<=r && t<=b) {
            for(int i=l;i<=r;i++) {
                list.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++) {
                list.add(matrix[i][r]);
            }
            r--;
            if(t<=b) {
                for(int i=r;i>=l;i--)
            {
                list.add(matrix[b][i]);
            }
            b--;
            }
            if(l<=r) {
                for(int i=b;i>=t;i--)
            {
                list.add(matrix[i][l]);
            }
            l++;
            }
        }
        return list;
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes



class Probelm2 {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
            return new int[0];
        int n = mat.length;
        int m = mat[0].length;

        int[] result = new int[m*n];
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<>();

        for(int d = 0; d < n + m -1; d++){
            intermediate.clear();
            int r = d < m ? 0 : d - m + 1;
            int c = d < m ? d : m -1;

            while( r< n && c > -1){
                intermediate.add(mat[r][c]);
                r++;
                c--;
            }
            if(d % 2 == 0)
                Collections.reverse(intermediate);

            for(int i =0; i < intermediate.size(); i++){
                result[k++] = intermediate.get(i);
            }
        }
        return result;
    }
}

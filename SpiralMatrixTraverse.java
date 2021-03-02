// TC - O(m X n)
// SC - O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Sanity check, return empty array list if matrix is null
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        // Store num of rows is m and num of cols in n
        int m = matrix.length;
        int n = matrix[0].length;
        // Initializing ptrs 
        // l --> left, r --> right, t --> top, b --> bottom
        int l = 0, r = n-1, t = 0, b = m-1;
        // Terminating loop when l <= r and t <= b
        while(l<=r && t <= b){
            // left --> right
            // Iterate through l to r and add each element of t,i to list 
            for(int i=l; i<=r; i++){
                result.add(matrix[t][i]);
            }
            // Increment t as next time when we go from t to b or from b to t, elements are not repeated
            t++;
            
            // top --> bottom
            for(int i=t; i<=b; i++){
                result.add(matrix[i][r]);
            }
            r--;
            
            // bottom --> top
            if(t <= b){
                for(int i=r; i>=l; i--){
                    result.add(matrix[b][i]);
                }   
            }
            b--;
            
            if(l <= r){
                for(int i=b; i>=t; i--){
                    result.add(matrix[i][l]);
                }   
            }
            l++;
            
        }
        // return result
        return result;
    }
}
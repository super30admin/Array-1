Time Complexity: O(mn). m rows, n columns
Space Complexity: Constant
Ran successfully on leetcode?: yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new ArrayList<Integer>();
        
        int m = matrix.length, n = matrix[0].length;
        int rmin = 0, rmax = m - 1, cmin = 0, cmax = n - 1;
        List<Integer> list = new ArrayList<>();
        
        while(rmin <= rmax && cmin <= cmax){
            
            for(int i = cmin; i <= cmax; i++){
                list.add(matrix[rmin][i]);
            }
            rmin++;
            
            for(int i = rmin; i <= rmax; i++){
                list.add(matrix[i][cmax]);
            }
            cmax--;
            
            if(rmin <= rmax){
                for(int i = cmax; i >= cmin; i--){
                    list.add(matrix[rmax][i]);
                }
                rmax--;
            }
            
            if(cmin <= cmax){
                for(int i = rmax; i >= rmin; i--){
                    list.add(matrix[i][cmin]);
                }
                cmin++;   
            }
        }
        
        return list;
    }
}

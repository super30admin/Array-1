// Time Complexity : O(mn)
// Space Complexity : O(mn)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> r = new LinkedList<>();
        
        int x1 = 0;
        int y1 = 0;
        int x2 = matrix.length-1;
        int y2 = matrix[0].length-1;
        
        while(true){
            
            if(x1 > x2) break;
            // h left to right
            r.addAll(h(matrix, y1, y2, x1, true));
            x1++;
            
            if(y1 > y2) break;
            // v top to bottom
            r.addAll(v(matrix, x1, x2, y2, true));
            y2--;
            
            if(x1 > x2) break;
            // h right to left
            r.addAll(h(matrix, y1, y2, x2, false));
            x2--;
            
            if(y1 > y2) break;
            // v bottom to top
            r.addAll(v(matrix, x1, x2, y1, false));
            y1++;
            
        }
        
        return r;
        
    }
    
    public List<Integer> h(int[][] matrix, int y1, int y2, int x, boolean dir){
         List<Integer> res = new LinkedList<>();
        if(y1 > y2) return res;
        
        if(dir){
            for(int y = y1; y <= y2; y++){
                res.add(matrix[x][y]);
            }
        } else {
            for(int y = y2; y >= y1; y--){
                res.add(matrix[x][y]);
            }
        }
        
        return res;
    }
    
    public List<Integer> v(int[][] matrix, int x1, int x2, int y, boolean dir){
        List<Integer> res = new LinkedList<>();
        if(x1 > x2) return res;
        
        if(dir){
            for(int x = x1; x <= x2; x++){
                res.add(matrix[x][y]);
            }
        } else {
            for(int x = x2; x >= x1; x--){
                res.add(matrix[x][y]);
            }
        }
        
        return res;
    }

}

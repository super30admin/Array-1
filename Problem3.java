//time o(mn)
//space o(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        int len = 0;
        
        while(len<matrix.length*matrix[0].length){
            //traversing right
            if(len<matrix.length*matrix[0].length) {
                for(int i=left; i<=right; i++) {
                    res.add(matrix[top][i]);
                    len+=1;
                }
                 top=top+1;
            }
            // System.out.println("1 " + len);
            //traversing down
            if(len<matrix.length*matrix[0].length) {
                for(int i=top; i<=bottom; i++) {
                    res.add(matrix[i][right]);
                    len+=1;
                }
                right=right-1;
            }
            // System.out.println("2 " + len);
            // traversing left
            if(len<matrix.length*matrix[0].length) {
                for(int i=right;i>=left; i--) {
                    res.add(matrix[bottom][i]);
                    len+=1;
                }
                bottom=bottom-1;
            }
            // System.out.println("3 " + len);
            //traversing top
             if(len<matrix.length*matrix[0].length) {
                for(int i=bottom;i>=top;i--) {
                    res.add(matrix[i][left]);
                    len+=1;
                }
                left=left+1;   
             }
             // System.out.println("4 " + len);
            
        }
        return res;
        
    }
}
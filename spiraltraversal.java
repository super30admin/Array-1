//Time Complexity: O(N^2)
//Space Complexity:O(1)
//In this problem, Four boundary conditions are being checked. When The index is less than right, it is iterated till it reaches right, then, the up is incremented and then it is moved along right till it reaches down. After that right is decremented, and the iterated till left. Then it is iterated till top along left and down is decremented. Once it reaches up, left is incremented and the process is repeated until up becomes greater than down or left becomes greater than right.
// This problem got executed and accepted in leetcode.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>out=new ArrayList<Integer>();
        if(matrix.length==0){
            return out;
        }
        
        
        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(up<=down&&left<=right){
            for(int i=left;i<=right;i++){
                out.add(matrix[up][i]);
            }
            up++;
            for(int i=up;i<=down;i++){
                out.add(matrix[i][right]);
            }
            right--;
            if(up<=down){
                for(int i=right;i>=left;i--){
                    out.add(matrix[down][i]);
            }
            
            }
            down--;
            if(left<=right){
                for(int i=down;i>=up;i--){
                    out.add(matrix[i][left]);
            }
            
            }
            left++;
            
            
        }
        return out;
    }
}
//Tc: O(mn) iterating through 2D array
//SC: O(1) list considered is output. SO no auxillary space 
//leetcode : successful

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length ==0)
            return list;
        int m = matrix.length;
        int n = matrix[0].length;
        int top=0,bottom =m-1;
        int left =0, right = n-1;
        while(top <= bottom && left <=right){
            if(top <= bottom && left <=bottom){
            for(int i= left; i<= right;i++){
                list.add(matrix[top][i]);
            
            }
            top++;
            }
            if(top <= bottom && left <=right){
            for(int i= top; i<= bottom;i++){
                list.add(matrix[i][right]);
            }
            
            right--;
            }
            if (top <= bottom && left <=right){
            for(int i = right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if (top <= bottom && left <=right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
        return list;
    }
}
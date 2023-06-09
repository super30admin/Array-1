/*Time Complexity : O(m*n) where m is the rows and n is the cols of the input array
 
 * Space Complexity : O(1) 
*/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        List <Integer> output=new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                output.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                output.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
            for(int i=right;i>=left;i--){
                output.add(matrix[bottom][i]);
            }
            bottom--;}

            if(left<=right){
            for(int i=bottom;i>=top;i--){
                output.add(matrix[i][left]);
            }
            left++;
            }
        }

        return output;
    }
}
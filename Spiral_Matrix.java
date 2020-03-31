// Time Complexity : O(n) where n is the number of elements
// Space Complexity :O(n) where n is the number of elements
// Did this code successfully run on Leetcode : Yes, but failed for another test case
// Three line explanation of solution in plain english : Had difficulty in starting the solution, so I referenced a solution

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {       
        List<Integer> result = new ArrayList<Integer>();
        if(matrix.length == 0||matrix[0].length == 0){
            return result;
        }
        
        int left = -1;
        int right = matrix[0].length;
        int up = -1;
        int down = matrix.length;
        //parameter for switch cases 
        int direction = 1;
        int i=0,j=0;
        
        while(i>up && i<down && j>left && j<right){
            result.add(matrix[i][j]);
            switch(direction){
            case 1:
            if(j+1<right){
                j++;
            }
            else{
                direction = 2;
                up++;
                i++;
            }
            break;
            case 2:
            if(i+1<down){
                i++;
            }
            else{
                direction = 3;
                right--;
                j--;
                
            }
            break;
            case 3:
            if(j-1>left){
                j--;
            }
            else{
                direction = 4;
                down--;
                i--;
            }
            break;
            case 4:
            if(i-1>up){
                i--;
            }
            else{
                direction = 4;
                left++;
                j++;
            }
            break;
            
            default:
            break;
            }
            
        }
        return result;
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int count = 0;
        int total = row*col;
        
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row-1;
        int endingCol = col-1;
        
        while(count < total){
           
            //print starting row :
            for(int index = startingCol; count<total && index<=endingCol; index++){
                ans.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;
            
            //print ending column :
            for(int index= startingRow; count<total && index<=endingRow; index++){
                ans.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;
            
            //print ending Row :
            for(int index=endingCol; count<total && index>=startingCol; index--){
                ans.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;
            
            //print starting col :
            for(int index=endingRow; count<total && index>=startingRow; index--){
                ans.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        
        return ans;
    }
}
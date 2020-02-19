// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
start from top row 0th column and go till last col print all numbers
right : lastcol and row from row+1 to lastrow
bottom : from lastCol to 1st col in the lastRow
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //base case
        if(matrix.length ==0 || matrix[0].length== 0)
            return new ArrayList<>();
        
        List<Integer>  list = new ArrayList<>();
        //row and colums
        int total= (matrix.length)*(matrix[0].length);
        int lastRow = matrix.length-1 , lastCol = matrix[0].length-1;
        int row =0, col=0;
        
        //iterate till your cur row goes beyond lastRows 
        //and cur col goes beyond lastCol
        while(row <= lastRow && col<= lastCol){
            //first row
            for(int i=col; i<=lastCol; i++)
                if(list.size() <total)
                    list.add(matrix[row][i]);
            
            //we are done printing 1st row. 
            row++;
            
            //print last column
            for(int i=row; i<=lastRow; i++)
                if(list.size() <total)
                    list.add(matrix[i][lastCol]);
            
            //we are done printing last column. 
            lastCol--;
            
            //print last row
            for(int i=lastCol; i>=col; i--)
                if(list.size() <total)
                    list.add(matrix[lastRow][i]);
            
            //done printing lastrow
            lastRow--;
            
            //print 1st column
             for(int i=lastRow; i>=row; i--)
                 if(list.size() <total)
                    list.add(matrix[i][col]);
            
            col++;
        }
        return list;
    }
}

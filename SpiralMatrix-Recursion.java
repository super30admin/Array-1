//Problem 28 : Recursive - Spiral Matrix
// Time Complexity : O(n*m), where n & m are rows and columns
// Space Complexity : (O(n*m)) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach 


import java.util.*;

class Solution28Recursive {
    List<Integer> list;
    public List<Integer> spiralOrder(int[][] matrix) {
       
        list = new ArrayList<>();
        
        if(matrix==null || matrix.length==0){
            return list;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        for(int i=0;i<=matrix.length-1;i++){
           getBoundary(matrix,i,i,rows-(i+1),cols-(i+1),visited,i);
        }
        
        return list;
    }
    
    private void getBoundary(int[][] matrix,int row, int col,int lastRow, int lastCol,boolean[][] visited, int startIndex){
        
        //base
        if(row<0 || col<0 || lastRow<0 || lastCol<0 || col>=matrix[0].length){
            return;
        }
        
        if(visited[row][col]){
            return;
        }
        
        list.add(matrix[row][col]);
        visited[row][col] = true;
        
        //logic
        //move towards bottom
        if(col>=lastCol && row<lastRow){
             getBoundary(matrix,row+1,lastCol,lastRow,lastCol,visited,startIndex);
             return;
        }
        
        //move towards top
        if(row> startIndex && row<=lastRow && col==startIndex){
            getBoundary(matrix,row-1,col,lastRow,lastCol,visited,startIndex);
            return;
        }
        
        //move towards left
        if(row>=lastRow && col>startIndex && lastRow>startIndex){
            getBoundary(matrix,lastRow,col-1,lastRow,lastCol,visited,startIndex);
            return;
        }
        
        //move towards right
        getBoundary(matrix,row,col+1,lastRow,lastCol,visited,startIndex);
       
    }
    
}
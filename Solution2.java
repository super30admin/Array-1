// Time Complexity : O(MN)
// Space Complexity : :O(MN)
// Did this code successfully run on Leetcode : Y
// Three line explanation of solution in plain english
//1) Add elements 2) adjust boundary & continue dfs

// Your code here along with comments explaining your approach
class Solution {

    int R;
    int C;
    int r=0;
    int c=0;
    List<Integer> result;
    public List<Integer> spiralOrder(int[][] matrix) {
        result = new LinkedList<>();
        R = matrix.length;
        if(R==0)
            return new LinkedList<Integer>();

        C = matrix[0].length;

        if(C==0)
            return new LinkedList<Integer>();

        while(r<R && c<C){
            dfsTop(r,c,matrix); //Top Row
            r++;
            dfsRight(r,C-1,matrix); //Right Column
            C--;
            if(r<R) //check for overlapping
                dfsBottom(R-1,C-1,matrix); //Bottom Row
            R--;
            if(c<C)
                dfsLeft(R-1,c,matrix); //Left Column
            c++;
        }

        return result;
    }

    public void dfsTop(int i, int j, int[][] matrix){
        if(i<r || j<c || i>=R || j>=C)
            return;

        result.add(matrix[i][j]);

        dfsTop(i,j+1,matrix);
    }

    public void dfsRight(int i, int j, int[][] matrix){
        if(i<r || j<c || i>=R || j>=C)
            return;

        result.add(matrix[i][j]);

        dfsRight(i+1,j,matrix);
    }

    public void dfsBottom(int i, int j, int[][] matrix){
        if(i<r || j<c || i>=R || j>=C)
            return;

        result.add(matrix[i][j]);

        dfsBottom(i,j-1,matrix);
    }

    public void dfsLeft(int i, int j, int[][] matrix){
        if(i<r || j<c || i>=R || j>=C)
            return;

        result.add(matrix[i][j]);

        dfsLeft(i-1,j,matrix);
    }
}
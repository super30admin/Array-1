// Time Complexity :O(N)
// Space Complexity :O(1) no extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//In Diagonal Traversal we take 2 direction upwards dir = 1 and downwards dir = -1;
// For upward direction 3 conditions
// For downward direction 3 conditions

// Your code here along with comments explaining your approach
public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] mat) {

       if(mat.length == 0 || mat == null){
           return new int[]{};
       }

       int m = mat.length;
       int n = mat[0].length;
       int elements = m * n;
       int[] answer = new int[elements];

       int dir = 1;
       int row = 0;
       int col = 0;

       for(int i = 0; i < elements; i++){

           answer[i] = mat[row][col];

           if(dir == 1){
              if(col == n - 1){
                  dir = -1;
                  row++;
              }else if(row == 0){
                  dir = -1;
                  col++;
              }else{
                  row--;
                  col++;
              }
           }else{
               if(row == m - 1){
                   dir = 1;
                   col++;
               }else if(col == 0){
                   dir = 1;
                   row++;
               }else{
                   row++;
                   col--;
               }
           }
       }

       return answer;
    }

    public static void main(String[] args) {

        int[] answer = findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

        for(int n: answer){
            System.out.println(n);
        }
    }
}

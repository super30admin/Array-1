// space complexity - o(1)
    //time - o(m*n)
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
    //Approach : USe For loop( not a fan of this question, this question doesn't teach any logic ,
    //just test how well you can write for loops, no knowlege of daat structure or algorithms required , question should be removed from syllabus)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

     List<Integer> res = new ArrayList<>();

     int n = matrix.length;
     int m = matrix[0].length;

     int count = 0;

     int topLeft = 0;
     int topRight = m-1;
     int bottomRight =  n-1;
     int bottomLeft = 0 ;

      while(count < m*n){


        for(int i= topLeft;  count < m*n && i<= topRight; i++){
           res.add(matrix[topLeft][i]);
            count++;
        }
        topLeft++;

        for(int i = topLeft; count < m*n && i<= bottomRight; i++){
            res.add(matrix[i][topRight]);
            count++;
        }
        topRight--;

        for(int i = topRight; count < m*n &&i>= bottomLeft; i--){
            res.add(matrix[bottomRight][i]);
            count++;
        }
        bottomRight--;

        for(int i = bottomRight; count < m*n &&i>= topLeft; i--){
            res.add(matrix[i][bottomLeft]);
            count++;
        }
        bottomLeft++;

      }

      return res;
    }
}

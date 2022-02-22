// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int down = 0,up=1,right=2, left=3; 
        int direction = right;
        int rightLimit = n-1;
        int downLimit = m-1;
        int leftLimit = 0;
        int upLimit = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(upLimit<=downLimit && rightLimit>=leftLimit){ //Moving right
            for( j=leftLimit;j<=rightLimit;j++){
                a.add(matrix[upLimit][j]);
            }
            upLimit++;                  //After done with the first row, incrementing the row for next round.
            for( i=upLimit;i<=downLimit;i++){ //Moving Down 
                a.add(matrix[i][rightLimit]);
            }
            rightLimit--; //Moving the right column for the next round.
            if(upLimit<=downLimit && rightLimit>=leftLimit){ //Moving Left
            for( j=rightLimit;j>=leftLimit;j--){ 
                a.add(matrix[downLimit][j]);
            }
            downLimit--; //Moving the last row
            for( i = downLimit;i>=upLimit;i--){ //Moving Up
                a.add(matrix[i][leftLimit]);
            }
            leftLimit++; //Moving left column
            }
    }
         return a;
}
}

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Break the approach into two halves, one where the we traverse upwards throught the
//2d matrix and one where we traverse downwards. Modify i and j values according to the
//traversal and store each element into an array
class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {

        int n = mat[0].length;
        int m = mat.length;
        int[] arr = new int[m*n];
        String dir = "up";
        int counter = 1;
        int i=0,j=0;
        arr[0] = mat[0][0];
        while(i<m && j<n){
            if(dir.equals("up")){
                if(i==0 && j != n-1){
                    j++;
                    dir = "down";
                } else if(j== n-1){
                    i++;
                    dir = "down";
                } else {
                    i--;
                    j++;
                }
            }
            else if(dir.equals("down")){
                if(j==0 && i != m-1){
                    i++;
                    dir ="up";
                } else if(i == m-1){
                    j++;
                    dir ="up";
                } else {
                    i++;
                    j--;
                }
            }
            if(i<m && j<n){
                arr[counter] = mat[i][j];
                counter++;
            }
        }
        return arr;

    }
}

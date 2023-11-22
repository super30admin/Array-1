// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Take r and c as pointers to access different parts of the array.
//check the direction as isFlag
//check row and coloumn based on direction and boundries increment or decrement it.

public class Problem2 {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        boolean isFlag = true;
        for(int i = 0; i < m*n ; i++){
            result[i] = mat[r][c];
            if(isFlag){
                if( r == 0 && c != n-1){
                    c++;
                    isFlag = false;
                }else if(c == n-1){
                    r++;
                    isFlag = false;
                }else{
                  r--;
                  c++;
                }
            }
            else{
                if( c == 0 && r != m-1){
                    r++;
                    isFlag = true;
                }else if(r == m-1){
                    c++;
                    isFlag = true;
                }else{
                  r++;
                  c--;
                }
                
            }
        }
        return result;
    }

    public static void main(String[] arg) {
        int[][] nums = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int[] result = findDiagonalOrder(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

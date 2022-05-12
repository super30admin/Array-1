// Time Complexity : O(N) where n is the number of elements
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach

public class DiagMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int n = r*c;
        int[] result = new int[n];

        int i=0, j=0, count = 0;;

        int mode=0; // mode 0 going up, mode 1 going down

        while(true){
            if(count == n){
                break;
            }
            result[count++] = mat[i][j];
            if(mode == 0){
                if(i == 0){
                    if(j >= c-1){
                        i++;
                    }
                    else{
                        j++;
                    }
                    mode = 1;
                }
                else if(j >= c-1){
                    i++;
                    mode = 1;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(j==0){
                    if(i>=r-1){
                        j++;
                    }
                    else{
                        i++;
                    }
                    mode =0;
                }
                else if(i >= r-1){
                    j++;
                    mode = 0;
                }
                else{
                    j--;
                    i++;
                }
            }
        }

        return result;
    }
}

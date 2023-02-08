/*
Diagonal Traverse of a Matrix
approach: top and down directions
time: O(mxn)
space: O(1)
 */
public class Problem2 {
    static int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length, columns = mat[0].length;
        int r=0, c=0;
        int dir=1;
        int dp[] = new int[rows*columns];
        int index = 0;
        while (index < dp.length) {
            dp[index] = mat[r][c];
            if (dir==1) {
                if (r==0 && c!=columns-1) {
                    c++;
                    dir=0;
                } else if (c==columns-1) {
                    r++;
                    dir=0;
                }
                else {
                    c++;r--;
                }
            }
            else {
                if ( c==0 && r!=rows-1) {

                    r++;
                    dir=1;
                } else if (r==rows-1) {
                    c++;
                    dir=1;
                }
                else {
                    r++;c--;
                }
            }
            index++;

        }
        return dp;
    }

    public static void main(String[] args) {
        System.out.println(findDiagonalOrder(new int[][]{{2,5},{8,4},{0,-1}}).toString());
    }
}

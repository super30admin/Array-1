// Time Complexity:           O(m*n)
// Space Complexity:          O(1)
// where m is number of rows of array, n is number of columns of array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

package src;

public class DiagonalTraverser {
    public static void main(String[] args) {
        DiagonalTraverser dt = new DiagonalTraverser();
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = dt.findDiagonalOrder(nums);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }

    public int[] findDiagonalOrder(int[][] mat) {

        boolean up = true;
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m*n];

        int i=0, j=0;
        int index=0;

        while(index < ans.length)
        {
            ans[index] = mat[i][j];
            index++;

            if(up)                                              // UP direction
            {
                if(j==n-1)                                      // last column
                {
                    i++;                                        // then increase row only
                    up = false;
                }
                else if(i==0)                                   // first row
                {
                    j++;                                        // then increase column only
                    up = false;
                }
                else                                            // else decrease row, increase column
                {
                    i--;
                    j++;
                }
            }
            else                                                // not UP direction
            {
                if(i==m-1)                                      // last row
                {
                    j++;                                        // then increase column only
                    up = true;
                }
                else if(j==0)                                   // first column
                {
                    i++;                                        // then increase row only
                    up = true;
                }
                else                                            // else increase row, decrease column
                {
                    i++;
                    j--;
                }
            }
        }

        return ans;
    }

}

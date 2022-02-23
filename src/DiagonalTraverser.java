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

            if(up)
            {
                if(j==n-1)
                {
                    i++;
                    up = false;
                }
                else if(i==0)
                {
                    j++;
                    up = false;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                if(i==m-1)
                {
                    j++;
                    up = true;
                }
                else if(j==0)
                {
                    i++;
                    up = true;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }

        return ans;
    }

}

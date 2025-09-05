public class Solution {
    public IList<int> SpiralOrder(int[][] matrix) {
        int m = matrix.Length;
        int n = matrix[0].Length;
        int[] result = new int[m*n];
        var direction = "R";
        int r=0;
        int c=0;
        for(var i=0;i<m*n;i++)
        {
            result[i] = matrix[r][c];
            Console.WriteLine(result[i]);
            matrix[r][c]=-10;
            if(direction == "R")
            {
                c++;
                if(c==n || (c<n && matrix[r][c]==-10))
                {
                    direction = "D";
                    r++;
                    c--;
                }
            }
            else if(direction == "D")
            {
                r++;
                if(r==m || (r<m && matrix[r][c]==-10))
                {
                    direction="L";
                    c--;
                    r--;
                }
            }
            else if(direction == "L")
            {
                c--;
                if(c==-1 || (c>=0 && matrix[r][c]==-10))
                {
                    direction="U";
                    r--;
                    c++;
                }
            }
            else
            {
                r--;
                if(r==-1 || (r>=0 && matrix[r][c]==-10))
                {
                    direction="R";
                    c++;
                    r++;

                }
            }


        }
        return result;
    }
}
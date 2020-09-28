// Time Complexity : O(rows*columns)
// Space Complexity : O(rows*columns)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix.length == 0 || matrix == null)
        {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int columns = matrix[0].length;
        int r = 0, c = 0, d = 1;

        while(result.size()!=rows*columns)
        {
            result.add(matrix[r][c]);
            int next_r = r-d, next_c = c+d;

            boolean outbound = (next_r<0 || next_c<0 || next_r == rows || next_c == columns);

            if(outbound)
            {
                if(d == 1)
                {
                    if(next_c == columns)
                    {
                        r++;
                    }
                    else
                    {
                        c++;
                    }
                }
                else
                {
                    if(next_r == rows)
                    {
                        c++;
                    }
                    else
                    {
                        r++;
                    }
                }
                d = -d;
            }
            else
            {
                r = next_r;
                c = next_c;
            }
        }

        int[] resultArray = result.stream().mapToInt(i->i).toArray();

        return resultArray;
    }
}

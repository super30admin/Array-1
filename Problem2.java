// Time Complexity :O(rc) where r is # of rows and c is # of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 

// Just followed the pattern and keeping track of direction


class Problem2 {
    public static int[] findDiagonalOrder(int[][] matrix) {
        
        //ege cases
        if(matrix==null || matrix.length==0) return new int[0];
        int R = matrix.length;
        int C = matrix[0].length;
        int dir =1;
        int r=0;
        int c=0;
        int [] result= new int[R*C];
        int k =0;
        while(k<(R*C))
        {
            result[k++] = matrix[r][c];
            //up
            if(dir==1)
            {
                if(c==C-1)
                {
                    r++;
                    dir=-1;
                }
                else if(r==0)
                {
                    c++;
                    dir=-1;
                }
                else{
                    r--;
                    c++;
                }
            }
            //down
            else{
                
                 if(r==R-1)
                {
                    c++;
                    dir=1;
                }
                else if(c==0)
                {
                    r++;
                    dir=1;
                }
                else{
                    r++;
                    c--;
                }
                
            }
        }
        return result;
        
    }
    public static void main(String[] args)
    {
       int[] result= findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
       for(int i = 0;i<result.length;i++)
       {
           System.out.print(result[i]);
       }

    }
}
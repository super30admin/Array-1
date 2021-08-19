public class DiagonalTraverse {
        public int[] findDiagonalOrder(int[][] mat) {
            //base check
            if (mat==null || mat.length==0)
            {
                return new int[] {};
    
            }
            //rows
            int m = mat.length;
            //columns
            int n = mat[0].length;
            //output array, size is same as the size of the matrix
            int[] result = new int[m*n];
            //i is the index for the result array
            int i=0, r=0, c=0;
            //two directions: upward(bottom to top) =1 and downward(top to bottom)= -1
            int dir = 1; //goin upward
            while (i<m*n)
            {
                result[i]=mat[r][c];
                if (dir==1)
                {
                    if(c==n-1)
                    {
                        dir=-1;
                        r++;
                    }
                    else if (r==0)
                    {
                        dir=-1;
                        c++;
                    }
                    else
                    {
                        r--;
                        c++;
                    }
    
                }
                else//dir=-1
                {
                    if(r==m-1)
                    {
                        dir=1;
                        c++;
                    }
                    else if(c==0)
                    {
                        r++;
                        dir=1;
                    }
                    else
                    {
                        r++;
                        c--;
                    }
                }
                i++;
            }
            return result;
        }
    }

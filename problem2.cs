int[] DaigonalTraversal(int[][] matrix)
    {
        
        var direction = true;
        int m = matrix.Length;
        int n = matrix[0].Length;
        int[] result = new int[m*n];
        int r=0;
        int c=0;
        for(var i=0;i<m*n;i++)
        {
            result[i] = matrix[r][c];
                if(direction)
                {
                    if(r==0&&c!=n-1)
                    {
                        c++;
                        direction = false;
                    }
                    else if(c==n-1)
                    {
                        r++;
                        direction = false;
                    }
                    else
                    {
                        r--;
                        c++;
                    }
                }
                else
                {
                    if(c==0&&r!=m-1)
                    {
                        r++;
                        direction = true;
                    }
                    else if(r==m-1)
                    {
                        c++;
                        direction = true;
                    }
                    else
                    {
                        r++;
                        c--;
                    }
                }
                
        }
        return result;
    }
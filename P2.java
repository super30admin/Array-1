//time- o(m*n)
//space- o(1)
//passed in leetcode- yes
//issues faced? - no

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int dir = 1; //initial direction is up
        
        int m = mat.length;
        int n= mat[0].length;
        System.out.println(m);
        System.out.println(n);
        int[] res= new int[m*n];
        System.out.println(res.length);
        
        int i=0, j=0, k=0;
        
        while(k<m*n)//unitll space left to add to the result array
        {
             res[k++] = mat[i][j];//add to the result array
            
            if(dir==1)//up
            {
                if(j==n-1)//reached top right end
                {
                    i++;  dir=-1; 
                    
                }
                else if(i==0)
                {
                    j++; dir=-1;
                }
                else
                {
                    i--; j++; 
                }
            }
            else{//down
               
                    if(i==m-1)//reached bottom left end
                    {
                        j++;  dir=1; 

                    }
                    else if(j==0)
                    {
                        i++; dir=1;
                    }
                    else
                    {
                        i++; j--; 
                        
                    }
                }
            }
        
        
        return res;
        
        
    }
}
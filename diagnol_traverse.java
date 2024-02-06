//SC: O(1)
//TC: O(n)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int i=1;
        int r=0,c=0;
        int dir=1;
        int [] array=new int[row*col];
        array[0]=mat[0][0];
        while(i<row*col)
        {
        if(dir==1)
{
    if(c==col-1)
    {
        dir=0;
        r++;
    }
else if(r==0&&c<col)
{
    dir=0;
    c++;
}
    else
    {
        r--;
        c++;
    }
}
else
{
    if(r==row-1)
    {
        dir=1;
        c++;
    }
    else if(c==0&&r<row-1)
    {
dir=1;
r++;
    }
    else
    {
        r++;
        c--;
    }
}
array[i]=mat[r][c];
i++;
        }
        
       
        return array;
        
    }
}
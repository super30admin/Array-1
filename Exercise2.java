class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0)return new int[0];
        int m = matrix[0].length;
        int n = matrix.length;
        int [] result = new int[n*m];
        int r=0,c=0;
        boolean flag = true;
        for(int i=0;i<result.length;i++)
        {
            result[i]=matrix[r][c];
            if(flag)
            {   if(c+1>=matrix[0].length){r++;flag=false;}
                else if(r-1<0){c++;flag=false;}
                else{c++;r--;}
            }
            else
            {
                if(r+1>=matrix.length){c++;flag=true;}
                else if(c-1<0){r++;flag=true;}
                else{c--;r++;}
            }
        }
        return result;
    }
}
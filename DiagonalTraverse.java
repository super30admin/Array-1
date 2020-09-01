//Time Complexity- O(n*m)
//Space Complexity=O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null||
          matrix.length==0||
          matrix[0].length==0)
        {
            return new int[0];
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int index=0;
        int i=0;
        int j=0;
        int[] outputArray=new int[m*n];
        boolean moveUpward=true;
        while(index<m*n)
        {
            outputArray[index]=matrix[i][j];
            index++;
            if(moveUpward)
            {
                if(j==n-1)
                {
                    moveUpward=false;
                    i++;
                }
                else if(i==0)
                {
                    moveUpward=false;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            else
            {
                if(i==m-1)
                {
                    moveUpward=true;
                    j++;
                }
                else if(j==0)
                {
                    moveUpward=true;
                    i++;
                }
                else
                {
                    j--;
                    i++;
                }
            }
        }
        return outputArray;
        
    }
}
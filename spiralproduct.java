class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        
        if(matrix==null || matrix.length==0)    return result;
        int m=matrix.length; int n=matrix[0].length;
        int left=0; int right=n-1;
        int top=0; int bottom=m-1;
        while(right>=left && bottom>=top)
        {
            //first row
            if(right>=left && bottom>=top){
            for(int j=left;j<=right;j++)
            {
                result.add(matrix[top][j]);
            }
            top++;
            }
            if(right>=left && bottom>=top)
            {
            for(int j=top;j<=bottom;j++)
            {
                result.add(matrix[j][right]);
            }
            right--;
            }
            if(right>=left && bottom>=top)
            {
            for(int j=right;j>=left;j--)
            {
                result.add(matrix[bottom][j]);
            }
            bottom--;
            }
            if(right>=left && bottom>=top)
            {
            for(int j=bottom;j>=top;j--)
            {
                result.add(matrix[j][left]);
            }
            left++;
            }
        }
        return result;
    }
}

//Time complecity T(n)= O(m*n)
//space O(1)
//Time Complexity- O(n*m)
//Space Complexity=O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||
          matrix.length==0||
          matrix[0].length==0)
        {
            return new ArrayList<Integer>();
        }
        int top=0;
        int left=0;
        int bottom=matrix.length-1;
        int right= matrix[0].length-1;
        ArrayList<Integer>outputList=new ArrayList();
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                outputList.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                outputList.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    outputList.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {                
                for(int i=bottom;i>=top;i--)
                {
                    outputList.add(matrix[i][left]);
                }
                left++;
            }
        }
        return outputList;

    }
}
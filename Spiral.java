
//time and space complexity: O(n)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;int bottom=m-1; int right=n-1;int left=0;//initialize 4 pointers 
        
        while(left<=right&& top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);//iterate through the first row 
                //and add them to the result arraylist
            }
            top++; //increment top to move to the next row
            for(int j=top;j<=bottom;j++)
            {
                result.add(matrix[j][right]);// add the elements in the right 
                //most column in to result
            }
            right--;//decrement right to put the pointer in the second last column
            if(top<=bottom)
            {
                for(int k=right;k>=left;k--)
                {
                    result.add(matrix[bottom][k]);//iterate through the bottom row and 
                    // store the elements in the result
                }
            
            }
            bottom--;
            if(left<=right)
            {
                for(int l=bottom;l>=top;l--)
                {
                    result.add(matrix[l][left]);//iterate through the first column bottom up
                }
                left++;
            }
        }
        return result;
    }
}

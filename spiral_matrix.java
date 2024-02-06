//SC: O(1)
//TC: O(n)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int dir=1;
        int top=0;
        int bot=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        int i=1;
        int r=0;
        int c=0;
        List<Integer> result=new ArrayList<>();
        result.add(matrix[0][0]);
        while(i<matrix.length*matrix[0].length)
        {
            if(dir==1)
            {
                if(c==right)
                {
                    dir=2;
                    top++;
                    r++;
                }
                else
                {
                    c++;
                }
            }
            else if(dir==2)
            {
                if(r==bot)
                {
                    dir=3;
                    right--;
                    c--;
                }
                else
                {
                    r++;
                }
            }
            else if(dir==3)
            {
                if(c==left)
                {
                    dir=4;
                    bot--;
                    r--;
                }
                else
                {
                    c--;
                }
            }
            else
            {
                if(r==top)
                {
                    dir=1;
                    left++;
                    c++;
                }
                else
                {
                    r--;
                }
            }
            
result.add(matrix[r][c]);
            i++;
        }
     return result;   
    }
}
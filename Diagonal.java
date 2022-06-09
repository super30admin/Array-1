// Time Complexity :o(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
//In this program, we have to take care of all the egde cases. We have taken a variable for direction and we start from
//index (0,0). Initially the direction is 1 so we have to go upwards and we simply traverse the matrix. 

public class Diagonal {

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int result[] = (findDiagonalOrder(mat)); 

        for(int i = 0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m*n];
        int dir = 1;
        int i = 0;int j = 0;int index = 0;
        
        if(mat == null || mat.length == 0)
        {
            return new int[0];
        }
        
        while(index < m*n)
        {
            result[index] = mat[i][j];
            index++;
            
            if(dir == 1)
            {
                if(j == n-1)
                {
                    i++;
                    dir = -1;
                }
                
                else if(i == 0)
                {
                    j++;
                    dir = -1;
                }
                
                else
                {
                    i--;
                    j++;
                }
            }
            
            else
            {
                if(i == m-1)
                {
                    j++;
                    dir = 1;
                }
                
                else if(j == 0)
                {
                    i++;
                    dir = 1;
                }
                
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }    
}

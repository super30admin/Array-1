// added conditions to traverse the 2d array and handle the edge cases
//Time Complexity: O(mxn)
//Space Complexity: O(1) // no additional memory needed 

public class ElementsDiagonal {

    public static void main(String[] args){
        int mat[][] = {{0, 1, 2, 3},{4, 5, 6, 7},{8, 9, 10, 11}};
        int result[] = findDiagonalOrder(mat);

        for (int i = 0; i < result.length; i++)
        {
            System.out.println("result[ " + i + "] = " + result[i]);
        }

    }
    
    public static int[] findDiagonalOrder(int[][] mat) {

        boolean dir = true;
        int i = 0;
        int j = 0;

        int idx = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];

        while(idx < m*n){
            result[idx] = mat[i][j];
            idx++;

            //upward
            if(dir)
            {
                if(i==0 && j!=n-1)
                {
                    j++;
                    dir=false;
                }
                else if(j==n-1)
                {
                    i++;
                    dir = false;
                }else
                {
                    i--; j++;
                }
            }
            else
            {
                 if(j==0 && i!=m-1)
                {
                    i++;
                    dir=true;
                }
                else if(i==m-1)
                {
                    j++;
                    dir = true;
                }else
                {
                    j--; i++;
                }
            }

        }
        
    return result;
    }

}

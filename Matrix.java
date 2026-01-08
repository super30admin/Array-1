// Time Complexity : O (m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//traverse left to right,top to bottome, right to left, bottom to top
//update boundaries and do boundary check everytime
// Your code here along with comments explaining your approach
class Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        int lB = 0;
        int rB = matrix[0].length-1;
        int uB = 0;
        int loB = matrix.length-1;
        int counter = 0;
        int totalLen = matrix.length * matrix[0].length;

        while(counter < totalLen)
        {
            //left to right
            if(uB <= loB) {
                for(int i = lB; i <= rB; i++)
                {
                    list.add(matrix[uB][i]);
                    counter++;
                }
                uB++;
            }

            //top to bottom
            if(lB <= rB) {
                for(int i = uB; i <= loB; i++)
                {
                    list.add(matrix[i][rB]);
                    counter++;
                }
                rB--;
            }

            //right to left
            if(uB <= loB) {
                for(int i = rB; i >= lB; i--)
                {
                    list.add(matrix[loB][i]);
                    counter++;
                }
                loB--;
            }

            //bottom to top
            if(lB <= rB) {
                for(int i = loB; i >= uB; i--)
                {
                    list.add(matrix[i][lB]);
                    counter++;
                }
                lB++;
            }
        }
        return list;
    }
}
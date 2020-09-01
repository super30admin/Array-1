//Time Complexity: O(m*n)
//Space Complexity: O(1)
//Did it run on leetcode: Yes
//Problems faced any: No


public class Problem26 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length == 0)
            return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;

        int[] result =  new int[m*n];

        //flag is to keep track of direction as in if we are going up or down
        int flag = 0;

        //index for the result matrix
        int k = 0;
        //indices for the input matrix
        int i = 0;
        int j = 0;

        while(k < result.length){
            result[k] = matrix[i][j];
            k++;
            //upwards
            if(flag==0){
                //we will check the edge cases where we need to change the direction
                if(j == n-1){
                    i = i+1;
                    flag = 1;
                }else if(i == 0){
                    j = j+1;
                    flag = 1;
                }else{
                    i = i-1;
                    j = j+1;
                }
            }else{
                if(i == m-1){
                    j = j+1;
                    flag = 0;
                }else if(j == 0){
                    i = i+1;
                    flag = 0;
                }else{
                    i = i+1;
                    j = j-1;
                }
            }
        }

        return result;

    }
}

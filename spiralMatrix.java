//T.C: O(m*n) m: no of rows,n: no of columns.
//S.c: O(1) No extra data structure is used.

/*Approach: I will have four pointers to define boundaries for my matrix and travers over it.
accordingly i will update my pointers.
*/



public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0,left = 0;
        int bottom = matrix.length , right = matrix[0].length ;
        List<Integer> result = new ArrayList<>();

        while(left < right && top < bottom){

            for(int i = left; i< right; i++){
                result.add(matrix[top][i]);
                System.out.println(matrix[top][i]);
            }
            top +=1;
           System.out.println("after top row");

            for(int i = top;i< bottom; i++){
                result.add(matrix[i][right - 1]);
            }
            System.out.println("after right row");
            right -= 1;

            if(!(left < right && top < bottom)){
                    break;
            }

            for(int i = right - 1; i > left - 1; i--){
                result.add(matrix[bottom - 1][i]);
                System.out.println(matrix[bottom - 1][i]);
            }
            bottom -=1;
             System.out.println("after bottom row");

            for(int i = bottom - 1; i > top - 1; i--){
                result.add(matrix[i][left]);
                System.out.println(matrix[i][left]);
            }
            left += 1;
            System.out.println("after left row");
        }
    return result; 
    }
} {
    
}

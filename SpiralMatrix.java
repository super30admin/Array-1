/*

Thought Process: Fix left, right, top & bottom. Loop through row till right, then col till bottom, then row till left and col till top

Keep on incrementing / decrementing the respective directions

T.C -> O(N)
S.C -> O(1)

Mistakes Comiited -> Missed checking condtions for last 2 for loops. Also, made right = m-1 and bottom = n-1

*/
import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0 || matrix == null) return result;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while(left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int j=top; j<=bottom; j++){
                result.add(matrix[j][right]);
            }
            right--;
            if(left <= right && top <= bottom){
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right && top <= bottom){
                for(int j=bottom; j>=top; j--){
                    result.add(matrix[j][left]);
                }
                left++;
            }
        }
        
        return result;
    }
}
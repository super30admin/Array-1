//Time Complexity : O(m*n) m->rows, n->cols
//Space Complexity : O(1)
/*Approach
-taking 4 boundaries left, right, bottom, top(top & bottom in rows and left & right in column)
-while going from left to right col will increase but row will be top ,incrementing top after it
-while going from top to bottom row will increase but col will be right, decrementing right after it
-while going from right to left col will decrease but row will be bottom, decrementing bottom after it
-while going from bottom to top row will decrease but col will be left, incrementing left after it

modifying pointers at the end so that same number is not considered again
terminating condition will be crossover of pointers either left & right or top & bottom
 */
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiral(int[][] A){
        if(A == null || A.length == 0){return new ArrayList<>();}
        int m = A.length, n = A[0].length;
        List<Integer> result = new ArrayList<>();
        int l=0,r=n-1,b=m-1,t=0;

        while(l<=r && t<=b){
            for(int j = l; j <= r; j++){//right
                result.add(A[t][j]);
            }
            t++;
            
            for(int j = t; j <= b;j++){//down
                result.add(A[j][r]);
            }
            r--;
            if(l<=r){
            for(int j = r; j >= l;j--){//left
                result.add(A[b][j]);
            }
            }
            b--;
            if(t<=b){
            for(int j = b; j >=t;j--){//up
                result.add(A[j][l]);
            }
            }
            l++;
        }
        return result;
    }
    public static void main(String args[]){
        int [][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> result = spiral(A);
        System.out.print(result);   
        
     } 
  
}
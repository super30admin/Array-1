import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Array {
    //time complexity: N
    // space complexity : 1
    // did it run on leetcode : yes
    // any doubts : no 
    //https://leetcode.com/problems/product-of-array-except-self/
    //238. Product of Array Except Self
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0]=1;
        int rpro = nums[0];
        for(int i =1;i<nums.length;i++){
            result[i]=rpro;
            rpro = rpro*nums[i];
        }
        int reverserpro = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            result[i]= result[i] * reverserpro;
            reverserpro = reverserpro * nums[i];
        }
        return result;
    }
    // time complexity: M*n
    // space complexity : 1
    // did it run on leetcode : yes
    // any doubts : no 
    //https://leetcode.com/problems/diagonal-traverse/
    //498. Diagonal Traverse
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int dir = 1;
        int i =0;
        int j =0;
        int index = 0;
       while(index < result.length){
            result[index] = mat[i][j];
            index ++;
            if(dir == 1){
                if(j==n-1){
                    i++;
                    dir = -1;
                }else if(i==0){
                    j++;
                    dir = -1;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i==m-1){
                    j++;
                    dir=1;
                }else if(j==0){
                    i++;
                    dir = 1;
                }else{
                    j--;
                    i++;
                }
            }
       }
       return result;
    }
    //time complexity: M*N
    // space complexity : 1
    // did it run on leetcode : yes
    // any doubts : no 
    //https://leetcode.com/problems/spiral-matrix/
    //54. Spiral Matrix
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result =  new ArrayList<>();
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        while(top<=bottom && left <= right){
            if(top<=bottom && left <= right){
                for(Integer i =left;i<=right;i++){
                    result.add(matrix[top][i]);
                    
                }
                top ++;
            }
            if(top<=bottom && left <= right){
                for(int j = top;j<=bottom;j++){
                    result.add(matrix[j][right]);
                   
                }
                right--;
            }
            if(top<=bottom && left <= right){
                for(int k = right;k>=left;k--){
                    result.add(matrix[bottom][k]);
                }
                bottom --;
            }
            
            if(top<=bottom && left <= right){
                for(int p = bottom;p>=top;p--){
                    result.add(matrix[p][left]);
                }
                left++;
            }
           
        }
        return result;
    }
}

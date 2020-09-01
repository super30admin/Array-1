//Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.Arrays;

public class MultiplyArray {
    // public static int[] Multiply(int[] nums){
    //     int j = 0;
    //     int[] res = new int[nums.length];
    //     Arrays.fill(res, 1);
    //     for(int i=0; i<nums.length && j<nums.length; i++){
    //         if(i != j){
    //             res[j] *= nums[i];
    //         }
    //         if(i == nums.length-1){
    //             i = -1;
    //             j++;
    //         }
    //     }
    //     return res;
    // }
    public static int[] Multiply(int[] nums) {
        int j = 1;
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        //compute for left->right
        for(int i=1; i<nums.length; i++){
            
            res[i] = res[i-1] * nums[i-1];
                    
        }
        //compute for right->left
        for(int i=nums.length-1; i>=0; i--){
            
            res[i] = res[i] * j;
            j *= nums[i];
        }
        
        
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1};
        int[] res = Multiply(arr);
        for(int r:res)
            System.out.println(r);
    }
}
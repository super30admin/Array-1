import java.util.Arrays;

/*
Time Complexity: O(n)
Space Complexity: O(1)
Code run on leetcode: Yes
Any difficulties: no

Solved after discussed in the class
 */
public class ArrayMultiplicationWithoutItself {

    public static int[] multiplicationWithoutItself(int[]nums){
        int []result = new int[nums.length];
        // product of all the element left to the array
        result[0] = 1;

        for(int i = 1; i<nums.length; i++){
            result[i] = nums[i-1]*result[i-1];
        }
        // product of all the elements right to the array
        int R = 1;

        for(int i = nums.length-1; i>=0; i--){
            result[i] = result[i]*R;
            R*=nums[i];
        }

        return result;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[]result = multiplicationWithoutItself(nums);
        System.out.print("[");
        for(int i =0; i<result.length; i++){
            System.out.print(result[i]+", ");
        }
        System.out.print("]");
    }

}

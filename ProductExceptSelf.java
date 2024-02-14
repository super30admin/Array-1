//Time Complexity = O(n) //Iterating entire nums array once.
//Space Complexity = O(1) // No Auxillary space considered. Input and output are not part of Space Complexity.
//(Written in problem too)
// Does it run on LeetCode successfully?: Didn't check on Leetcode
// Any difficulties: Miscalculated the running product.

/*
Multiple left to right > Store in Result
Multiple right to left > then multiply in result's that number stored in step-1 > then final output will be ready
*/

//One way is to multiple entire array and then divide by each number to get the result.
// ^^ This one is not permitted in problem here though. (This can be brute force)

//Another bruteforce is to nested iteration and multiply everything skipping self index.

import java.util.Arrays;
//import java.util.Map;
//import java.util.HashMap;

import java.util.Set;
import java.util.HashSet;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        int rp = 1;

        for(int i=1;i<n;i++){
            //Left to Right iteration
            rp = rp*nums[i-1];
            result[i] = rp;
        }
        System.out.println(Arrays.toString(result));

        rp =1; // This is must. This variable is must too.

        for(int i=n-2; i>=0; i--){
            //Right to Left Iteration
            rp = rp*nums[i+1];
            result[i] = result[i]*rp;
        }
        return result;
    }

    public static void main(String[] args){
        ProductExceptSelf obj = new ProductExceptSelf();
//        int[] nums = {1,2,3,4}; // [24,12,8,6]
        int[] nums = {7,2,3,4,5}; // [24,12,8,6]
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));

//        New learning of putting values in HashMap like this
//        Map<String, Integer> map = new HashMap<String, Integer>() {{put("Nirvan", 1); put("Nirvan1", 11); put("Nirvan111", 111);}};
//        System.out.println(map);

//        Set<Integer> set = new HashSet<Integer>(){{add(1);}};
//        System.out.println("set values are " + set.toString());
    }
}
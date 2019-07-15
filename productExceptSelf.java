// Time Complexity :O(n*n) --> beacuse of for loop
// Space Complexity :O(n)  ---> because of Hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

public class productExceptSelf {
    //optimised O(n)
    // take 2 arrays left and right , left[i] contains product of all elements left to i ,right -> all elements to right of i . Multiply these two.
    public static int[] product(int[] nums){
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        int [] result = new int[nums.length];
        left[0] = 1;right[nums.length-1]=1;
        for(int i = 1;i<nums.length;i++)
            left[i] = left[i-1]*nums[i-1];
        for(int i =nums.length-2;i>=0;i--)
            right[i] = right[i+1]*nums[i+1];
        for(int i = 0;i<nums.length;i++)
            result[i] = left[i]*right[i];
        return result;
    }

    //brute force : O(n*n)
    //take a new array ,Take a loop ,initialize result[i] =1. take a loop inside this  loop and if indices are different,
    // then multiply result[i] with itself and number in nums array .(result[i] = result[i]*nums[i];
    public static int[] product2(int[] nums){
        int result[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            result[i]=1;
            for(int j = 0;j<nums.length;j++){
                if(i!=j)
                    result[i]*=nums[j];
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4,5};
        int[] result = product(nums);
        for(int x:result)
            System.out.print(x+"  ");
    }
}

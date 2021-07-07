
import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums)
    {
        int len = nums.length;
        int[] left = new int[len];
        left[0] = 1;
        for(int i =1; i < len; i++)
        {   //nums: [4,1,3,2]
            //left: [1,4,4,12]
            //right: [6,6,2,1]
            left[i] = nums[i-1]*left[i-1];
        }
        int[] right = new int[len];
        right[len-1] =1;
        for(int i = len-2; i >=0; i--)
        {
            right[i] = nums[i+1]*right[i+1];
        }

        for(int i=0; i<len; i++)
        {
            right[i] = right[i]*left[i];
        }

        return right;
    }

}

class Main
{
    public static void main(String[] args) {
        int[] nums = {4,1,3,2};
        ProductExceptSelf p = new ProductExceptSelf();
        int[] arr = p.productExceptSelf(nums);

        System.out.println("New Array is: "+ Arrays.toString(arr));

    }
}


/*
approach: Here I am taking two arrays left and right.
for left array I will traverse from left to right keeping 0th element as 1.
same way for right , I will traverse from end to start, keeping end element as 1.
At last I will multiply ith element from left and right array anf that will be my result.
Time Complexity: O(2N) = O(N)
* Space:O(N) returning the left array as result, so, but right array will count in auxiliary space
 */
public class Exercise_1 {
    // time complexity - O(n)
    // space complexity - O(1)

    /** First store the left product in output array. Multiply the output array by rightProduct to get
        the product of array except itself.
     */
    private static int [] findProductOfArrayExceptItSelf(int [] nums){
        int n = nums.length;
        int [] output = new int[n];
        output[0] = 1;
        // store the left product in output array
        for(int i=1; i<n; i++){
            output[i] = output[i-1] * nums[i-1];
        }
        // now multiply the output array elements by right product
        int rightProduct = 1;
        for(int i=n-2; i>=0;i--){
            rightProduct*= nums[i+1];
            output[i] = rightProduct * output[i];
        }
        return output;
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String [] args){
        int [] nums = new int[]{1,2,3,4};
        int [] output = findProductOfArrayExceptItSelf(nums);
        System.out.println("output is: ");
        printArray(output);

        nums = new int[]{5,2};
        output = findProductOfArrayExceptItSelf(nums);
        System.out.println("output is: ");
        printArray(output);

        nums = new int[]{3,5,1,7,8,4};
        output = findProductOfArrayExceptItSelf(nums);
        System.out.println("output is: ");
        printArray(output);
    }
}
//1 2 3 4
// 1 1 2 6
// 24 12 4 1
// 24  12  8  6
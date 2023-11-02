// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// Prefix Product and Suffix Product

class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] prefix= new int[n];
        int[] suffix= new int [n];
        for(int i=0,j=n-1; i<n; i++,j--){
            int pre= i-1<0 ? 1 : prefix[i-1];
            int post= j+1>n-1 ? 1 : suffix[j+1];
            prefix[i]=pre*nums[i];
            suffix[j]=post*nums[j];
        }
        int[] output= new int[n];
        for(int i=0; i<n; i++){
            int preProduct= i-1<0 ? 1 : prefix[i-1];
            int postProduct= i+1>n-1 ? 1 : suffix[i+1];
            output[i]=preProduct*postProduct;
        }
        return output;
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Optimized solution using only nums and the output array




class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] prefix= new int[n];
        prefix[0]=1;
        for(int i=1; i<n; i++){
            int pre= prefix[i-1];
            prefix[i]=pre*nums[i-1];
        }
        int suffixProduct=1;
        for(int i=n-1; i>=0; i--){
            prefix[i]*= suffixProduct;
            suffixProduct*=nums[i];
        }
        return prefix;
    }
}

public class problem1 {
    static void printArr(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums= {-1,1,0,-3,3};
        Solution1 s1= new Solution1();
        Solution2 s2= new Solution2();
        int[] ans1= s1.productExceptSelf(nums);
        int[] ans2= s2.productExceptSelf(nums);
        printArr(ans1);
        printArr(ans2);
    }
}

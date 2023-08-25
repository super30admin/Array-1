import java.util.Arrays;
//TC=O(n)
//SC=O(1)

public class Problem238 {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=nums[i-1]*result[i-1];
        }
        int runningSum=1;
        for(int i= n-1;i>=0;i--){
            result[i]=result[i]*runningSum;
            runningSum=runningSum*nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Problem238 problem=new Problem238();
        System.out.println(Arrays.toString(problem.productExceptSelf(new int[]{1,2,3,4,5})));
    }
}

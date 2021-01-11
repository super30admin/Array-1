// time complexity : O(n)
// space complexity : O(n)
package ThirdWeek;

public class ProductofArrayExceptSelf {

public static int[] productExceptSelf(int nums[]){

    if(nums==null || nums.length == 0) return new int[0];

    int result[] = new int[nums.length];
    result[0] =1;
    int rp =1;

    for(int i=1;i<nums.length;i++){
        rp = rp*nums[i-1];
        result[i] = rp;
    }

    rp = 1;
    for(int i=nums.length-2;i>=0;i--){
        rp = rp * nums[i+1];
        result[i] = result[i]*rp;
    }

    return result;
}

public static void print(int result[])
    {
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }


    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4};
        print(productExceptSelf(nums));
    }

}

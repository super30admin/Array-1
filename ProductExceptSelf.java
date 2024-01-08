import java.util.Arrays;
//TC O(n) SC O(1)
public class ProductExceptSelf {
    public static void main(String[] args) {
      int[] re=  productExceptSelf(new int[]{5,2,3,4});
        int[] re2=  productExceptSelf2(new int[]{5,2,3,4});
        System.out.println(re2);
    }

    public static int[] productExceptSelf2(int[] nums) {

        if(nums==null || nums.length<0)return null;
        int[] op=new int[nums.length];
        op[0]=1;
        int rpro=1;
        for (int i=1;i<nums.length;i++){
            rpro=  rpro*nums[i-1];
            op[i]=rpro;
        }
        rpro=1;
        for(int i=nums.length-2;i>=0;i--){
            rpro=rpro*nums[i+1];
            op[i]=op[i]*rpro;
        }
        return op;


    }
//TC O(n) SC O(n)
    public static int[] productExceptSelf(int[] nums) {
            int[] rsumL=new int[nums.length];
            int[] rsumR=new int[nums.length];
            int[] result=new int[nums.length];


            int rsum1=1;
            int rsum2=1;
            for(int i=0;i<nums.length;i++){

                rsum1=rsum1*nums[i];
                rsumL[i]=rsum1;
            }

            for(int i=nums.length-1;i>=0;i--){
                rsum2=rsum2*nums[i];
                rsumR[i]=rsum2;
            }

            result[0]=rsumR[1];
            result[nums.length-1]=rsumL[nums.length-2];
            for(int i=1;i<nums.length-1;i++){

                result[i]=rsumL[i-1]*rsumR[i+1];
            }
            return result;
        }

}

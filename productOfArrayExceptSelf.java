public class productOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int[] results = new int[nums.length];
        int rProd = 1;
        //for product on left side of element
        results[0]=1;
        for(int i=1; i<nums.length; i++){
            rProd = rProd* nums[i-1];
            results[i]=rProd;
        }
        rProd=1;
        //calculating product on right side of element and multiplying
        // with previously calculated product of left side of element
        for(int i=nums.length-2;i>=0; i--){
            rProd=rProd*nums[i+1];
            results[i]= results[i]*rProd;
        }
        return results;
    }

    public static void main(String[] args){
        System.out.println("Product of array except itself: "+ productExceptSelf(new int[]{1,2,5}));
        System.out.println("Product of array except itself "+ productExceptSelf(new int[]{1,8,4,2}));
    }
}

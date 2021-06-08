//TC: O(N)
//SC: O(1)
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        int rightProd = 1;
        
        output[0] = nums[0];
        //Store the cumulative left side product of an element in output arrray;
        for(int i = 1; i < nums.length; i++) {
            output[i] = nums[i]*output[i-1];
        }
        //calculate right side product and store it in variable
        //multiply right side and left side product for each element and store in output
        for(int i = nums.length-1; i > 0; i--) {
            output[i] = rightProd * output[i-1];
            rightProd *= nums[i];
        }
        //edge case where first element does not have left product. only right product
        output[0] = rightProd;
        
        return output;
    }

    public static void main(String args[]){
        ProductExceptSelf obj = new ProductExceptSelf();
        int output[] = obj.productExceptSelf(new int[]{1,2,3,4});
        for(int op : output) {
            System.out.println(op+",");
        }
    }
}

/**
24,12,8,6 
 */
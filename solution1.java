// time complexity of O(n) 
//space constant or O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
public class solution1 {
    public int[] productExceptSelf(int[] nums) {

        if(nums == null || nums.length == 0)
            return new int[0];
        int temp = 1;
        int product = 1;
        int[] result = new int[nums.length] ;

        // calculating left product
        for(int i = 0; i< nums.length ; i++){
            product = product * temp ; 
            result[i] = product ;
            temp = nums[i] ;
        }
        // resetting the product and temp
        product = 1;
        temp = 1;
        // calculating right product
        for(int i = nums.length-1; i>= 0 ; i--){
            product = product * temp ; 
            result[i] = product * result[i] ;
            temp = nums[i] ;
        }
        return result ;
    }
} 
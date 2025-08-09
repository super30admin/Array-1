class Solution {
    public int[] productExceptSelf(int[] nums) {
        // product of left side & product from right side will provide product of all except self
        // calculate running prod from each side left & right

        int left = 1;
        int[] arr = new int[nums.length];

        for( int i = 0; i < nums.length ; i++ ){ // calculating running product from left side

            if( i - 1 < 0 ){
                left = 1;
            }
            else{
                left = left * nums[i-1];
            }
            arr[i] = left;
        }

        int right = 1;

        for( int i = nums.length - 1 ; i >= 0 ; i-- ){ // calculating running product from right side

            if( i + 1 > nums.length - 1 ){
                right = 1;
            }
            else{
                right = right * nums[i+1];
            }
            arr[i] = arr[i] * right;
        }

        return arr;


    }
}
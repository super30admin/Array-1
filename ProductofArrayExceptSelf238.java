/**
 T.C => O(n)
S.C => O(n)
Approach => In this approach we have traversed from left to right and stored all the resulting sum in one of the array. 
For the second pass we have traversed from right to left and also is being multiplied with elemets in result array.
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr1 = new int[nums.length];
        int rpLeft =1 ;
        arr1[0] =1;
        for(int i =1; i<nums.length; i++){
            arr1[i] = nums[i-1]*rpLeft;
            rpLeft = arr1[i];
        }
        int rpRight =1;
        for(int j= nums.length-2; j>=0 ; j--){
            rpRight = nums[j+1] * rpRight ;
            arr1[j]= rpRight * arr1[j];
        }
       return arr1; 
    }
}

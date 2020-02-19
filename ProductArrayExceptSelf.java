/*

In a brute force way I will iterate over the array and for each elemenet i will again iterate over all the elements and take product of all the elements ignoring the element for which i am iterating in the outer for loop.
-At every index we want product of all elements from its left and all elements from its right. 
-So I will create one left array which would contain product of all the elements to the left of i 
-right array which would contain product of all the elements to the right of i 
-and then in the result array for every index I wil take product of element at that index from the left subarray and from right subarray
Time - O(n)
Space - O(n)

//optimized approach
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prod = new int[len];
        int temp = nums[len-1];
        prod[0]=1;
        //left pass
        //Instead of taking two subarray We can optimized this by maintaining product of all the elements of to the left side of elements in one pass
        for(int i =1; i<len; i++)
            prod[i]= nums[i-1]*prod[i-1];
        
        //right pass
        //and in the second pass we can start from the right and multiply the intermidiate product by product of all elements from its right
        for(int j =len-2; j>=0; j--){
            prod[j] =prod[j]*temp;
            temp *= nums[j];
        }
        return prod;
    }
}
/*Time - O(n)
Space - O(1)*/


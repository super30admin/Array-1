import java.util.Arrays;
//Time Complexity - O(n)
//Space Complexity - O(1)
/*Initialize an array and keep a running product. Calculate RP by taking product of RP and the element before the current element
 of the original array and insert it into new array. Furthermore, calculate RP again in range array length to the first element and take
  product of the previous element of the original array. Multiply the rp with the current element of newly initialized array and then return the new array*/
public class ProductOfArray {
    //https://leetcode.com/problems/product-of-array-except-self
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
    //Below is brute force approach with TC O(n^2)
   /* public static int[] productExceptSelf(int[] nums) {
        int[] numsNew = new int[nums.length];
        numsNew[0]=1;
        for(int i=0; i<nums.length;i++){
            numsNew[i]=1;
            for(int j=0; j<nums.length;j++){
                if(i!=j){
                    System.out.println(i+""+j);

                    numsNew[i]=numsNew[i]*nums[j];
                }
            }
        }
        return numsNew;
    }
*/
    public static int[] productExceptSelf(int[] nums){
        int[] numsNew = new int[nums.length];
        int rp=1;
        numsNew[0]=rp;
        for (int i = 1; i < nums.length; i++) {

            rp = rp*nums[i-1];
            numsNew[i]=rp;
        }
        rp=1;
        for (int i = nums.length-2; i>=0  ; i--) {
            rp = rp*nums[i+1];
            numsNew[i]= rp*numsNew[i];
        }
        return numsNew;
    }

}

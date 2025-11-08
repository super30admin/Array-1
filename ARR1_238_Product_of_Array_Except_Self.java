/**** Method 1 ****/
//Time Complexity: O(n^2)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

// Brute Force: Start a loop and we will have two inner loops which find the product of idx = 0 to idx = i-1 and other idx = i+1 and idx = n-1, later store the product of both inner loops values in answer array.

/**** Method 2 ****/
//Time Complexity: O(n)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

// In this solution use two arrays prefix and suffix to store the product,initiate pro = 1 and starting with prefix array, we traverse the array from 0 to n-1 and store the product in the prefix array and then do pro*= arr[i]. Do the same with suffix array but we start from end. At the end we create a new result array which has the product of both pre[i]*suf[i] at it's ith value.

/**** Method 3 ****/
//Time Complexity: O(n)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

// Same as above method but we reduce the space here, rather than using two arrays, prefix and suffix, we only use one array which is prefix array and fill it first, later when traversing from n-1 to 0, we do the product arr[i] with pre[i] and store it in pre[i], later pro*=arr[i], at the end return prefix array.

public class ARR1_238_Product_of_Array_Except_Self {

  public static void main(String[] args) {}

  /**** Method 1 ****/
  public int[] productExceptSelf(int[] nums) {
    int arr[] = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int pro = 1;

      int idx = 0;
      while (idx < i) {
        pro *= nums[idx];
        idx++;
      }

      idx = i + 1;

      while (idx < nums.length) {
        pro *= nums[idx];
        idx++;
      }

      arr[i] = pro;
    }

    return arr;
  }

  /**** Method 2 ****/
  public int[] productExceptSelf1(int[] nums) {
    int ans[] = new int[nums.length];
    int pre[] = new int[nums.length];
    int suf[] = new int[nums.length];

    int pro = 1;
    for (int i = 0; i < nums.length; i++) {
      pre[i] = pro;
      pro *= nums[i];
    }

    pro = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      suf[i] = pro;
      pro *= nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      ans[i] = pre[i] * suf[i];
    }

    return ans;
  }

  /**** Method 3 ****/
  public int[] productExceptSelf2(int[] nums) {
    int ans[] = new int[nums.length];

    int pro = 1;
    for (int i = 0; i < nums.length; i++) {
      ans[i] = pro;
      pro *= nums[i];
    }

    pro = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      ans[i] = pro * ans[i];
      pro *= nums[i];
    }

    return ans;
  }
}

// TC: O(n)
// SC: O(1)
// Approach: Calculate running product from front and back and store the product in result array

public class ProductOfArrayExceptSelf {

  public int[] product(int[] nums) {

    int n = nums.length;
    int rproduct = 1;
    int[] result = new int[n];

    result[0] = 1;

    for (int i = 1; i < n; i++) {
      rproduct = rproduct * nums[i - 1];
      result[i] = rproduct;
    }

    rproduct = 1;

    for (int i = n - 2; i >= 0; i--) {
      rproduct = rproduct * nums[i + 1];
      result[i] = rproduct * result[i];
    }
    return result;
  }

  public static void main(String[] args) {
    ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
    int[] nums = new int[] { 1, 2, 3, 4 };

    System.out.println(p.product(nums));
  }
}
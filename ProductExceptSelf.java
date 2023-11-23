public class ProductExceptSelf {
  public int[] productExceptSelf(int[] nums) {

    int[] answer = new int[nums.length];
    int[] rt = new int[nums.length];
    int[] lt = new int[nums.length];
    lt[0] = 1;
    rt[nums.length - 1] = 1;
    int p = 1;
    for (int i = 1; (i < nums.length); i++) {
      p = p * nums[i - 1];
      lt[i] = p;
    }

    int q = 1;
    for (int i = nums.length - 2; (i >= 0); i--) {
      q = q * nums[i + 1];
      rt[i] = q;
    }

    for (int i = 0; (i < nums.length); i++) {
      answer[i] = lt[i] * rt[i];
    }

    return answer;
  }
}

// Time Complexity : O(n) + O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Main{
  public static void main(String []args){
    int []nums={1,2,3,4};
    int []ar=findProduct(nums);
    for(int i:ar){
      System.out.println(i);
    }
  }
  public static int[] findProduct(int []nums){
    int rp=1; int temp=1;
    int []result = new int[nums.length];
    for(int i=0; i<nums.length;i++){
      rp=rp*temp;
      result[i]=rp;
      temp=nums[i];
    }

    rp=1; temp=1;
    for(int i=nums.length-1; i>=0; i--){
      rp=rp*temp;
      result[i]=result[i]*rp;
      temp=nums[i];
    }
    return result;
  }
}
//T.C O(n)
//S.C O(1)
// Did this code successfully run on Leetcode : yes https://leetcode.com/problems/product-of-array-except-self/submissions/
// Any problem you faced while coding this : -

/*
Given an array of numbers, find the product of numbers except itself and return the resultant array
Sol: We use running sum method and traverse the array twice - from left to right and from right to left
Then multiply both pass values to get the result.
 */
public class ProductExceptItself {
    public int[] product(int[] in) {
        int[] res = new int[in.length];
        int rp = 1;//Running Product
        res[0] = 1;
        for(int i=1; i<in.length ;i++) {
            rp = rp*in[i-1];
            res[i] = rp;
        }
        rp = 1;
        for(int j = in.length-2;j>=0;j--){
            rp = rp * in[j+1];
            res[j] = res[j]*rp;
        }

        return res;
    }

    public static void main(String args[]){
        int[] in = new int[]{1,2,3,4,5};
        int[] res = new ProductExceptItself().product(in);
        for(int i : res)
            System.out.println(i);
    }
}

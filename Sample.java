// Time Complexity : O(n)
// Space Complexity : O(1) if we dont count result array
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english: denote an array for leftProduct of each number, then reverse traverse(n-2) multiply the current element by (current+1)element and right product of current+1 elemenet.

// Your code here along with comments explaining your approach

public int[] productExceptSelf(int[] nums) {
        //solution with 2 arrays for left and right product except self.
        // int n=nums.length;
        // int[] left = new int[n];
        // int[] right= new int[n];
        // left[0]=1;
        // right[n-1]=1;

        // for(int i=1;i<n;i++){
        //     left[i]=left[i-1]*nums[i-1];
        // }
        // for(int i=n-2;i>=0;i--){
        //     right[i]=right[i+1]*nums[i+1];
        // }

        // for(int i=0;i<n;i++){
        //     left[i]=left[i]*right[i];
        // }
        // return left;

        //space optimization.
        int n=nums.length;
        int[] left = new int[n]; //array for left product
        left[0]=1;

        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1]; //traversal for left product
        }
        int right=1;
        for(int i=n-2;i>=0;i--){
            left[i]=left[i]*right*nums[i+1]; //multiply left product with right product
            right=right*nums[i+1]; //update right product value
        }  

        return left; //return

        // int n=nums.length;
        // int[] res = new int[n];
        // res[0]=1;
        // int rp=1;
        // for(int i=1;i<n;i++){
        //     rp=rp*nums[i-1];
        //     res[i]=rp;
        // }
        // rp=1;
        // for(int i=n-2;i>=0;i--){
        //     rp=rp*nums[i+1];
        //     res[i]=res[i]*rp;
        // }
        // return res;
    }
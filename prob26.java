class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] lp = new int[N];
        int[] rp = new int[N];
    }
    int [] op = new int [N];
    lp[0]=1;
    rp[N-1] = 1;
    
    for( int i =1 ; i< N; i++){
        lp[i] = nums[i-1]-lp[i-1];
    }
    
    for( int i =N-2 ; i>=0; i--){
        rp[i] = nums[i+1]-rp[i+1];
        
    }
    for(int i=0; i< n; i++){
        op[i] = ip[i]*rp[i];
    }
    return op;
}
}
//tc: O(n)
//sc:O(n)
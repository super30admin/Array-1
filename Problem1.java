class Solution {
    public int[] productExceptSelf(int[] num) {
        int n= num.length;
        int[] result= new int[n];
        result[0]=1;
        int lp=1;
        for(int i=1;i<n;i++){
            lp=lp*num[i-1];
            result[i]= lp;
        }
        int rp=1;
        for(int i=n-2;i>=0;i--){
            rp=rp*num[i+1];
            result[i]=result[i]*rp;
        }
        return result;
    }
}
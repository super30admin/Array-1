class Solution {
public:
    vector<int> productExceptSelf(vector<int>& v) {
        int n = v.size();
        vector<int> prod_till(n,1);
        vector<int> prod_from(n,1);

        prod_till[0] = v[0];
        for(int i=1;i<n;i++)  prod_till[i] = prod_till[i-1] * v[i];

        prod_from[n-1] = v[n-1];
        for(int i=n-2;i>=0;i--)  prod_from[i] = v[i] * prod_from[i+1];

        vector<int> ret(n,1);
        ret[0] = prod_from[1];
        for(int i=1;i<n-1;i++)  ret[i] = prod_till[i-1] * prod_from[i+1];
        ret[n-1] = prod_till[n-2];
        
        return ret;
    }
};

class Solution {//tc:O(m*n),sc:O(1)
public: 
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.size()==0)
        return {};
        int m =matrix.size();
        int n= matrix[0].size();
        int l =0,r=n-1,t=0,b=m-1;//left,right,top ,bottom
        vector<int>result;
        while(l<=r && t<=b)
        {
            for(int i =l;i<=r;i++)
            result.push_back(matrix[t][i]);
            t++;
            for(int i =t;i<=b;i++)
            result.push_back(matrix[i][r]);
            r--;
            if(t<=b){ // to avoid duplicates
            for(int i =r;i>=l;i--)
            result.push_back(matrix[b][i]);
            b--;
            }
            if(l<=r){
            for(int i =b;i>=t;i--)
            result.push_back(matrix[i][l]);
            l++;
            }
        }
        return result;
    }
};
class Solution {
public:
  // tC-O(N*M)
    //SC-O(MIN(N,M))
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> result;
        int k=mat.size();
        int n=mat[0].size();
        map<int,vector<int>> m;
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++){
                m[i+j].push_back(mat[i][j]);
            }
        }
        vector<int>res;
        for( auto p:m){
            auto temp=p.second;
            if(p.first%2==0){
                reverse(temp.begin(),temp.end());
            }
            for(auto e:temp){
                res.push_back(e);
            }
        }
        return res;
    }
};
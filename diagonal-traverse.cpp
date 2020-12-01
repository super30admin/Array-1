//Time complexity - O(nm)
//Space complexity - O(nm)


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        
        vector<int> ret;
        int n = matrix.size();
        if(n==0) return ret;
        
        int m = matrix[0].size();
        if(m==0) return ret;
        
        unordered_map<int,vector<int>> mp;
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mp[i+j].push_back(matrix[i][j]);
            }
        }
        
        for(int i=0;i<m+n;i++){
           if(i%2 != 0){
               ret.insert(ret.end(),mp[i].begin(),mp[i].end());
           }else{
               ret.insert(ret.end(),mp[i].rbegin(),mp[i].rend());
           } 
        }
        
        return ret;
        
        
    }
};
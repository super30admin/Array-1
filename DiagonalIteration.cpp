//Time complexity: O(m*n)
//Space complexity O(1)
//Approach: we are trying to maintain a flag either 1 or -1
// 1: bottom to top -1: top to bottom
//we will always start from mat[0][0] and resultant array would be sized M*N
//everytime we hit row 0 

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
      
      int m=mat.size();
      int n=mat[0].size();
      int index=0;
      int dir=1;
      int r=0, c=0;
        vector<int> res(m*n);
        while(index<m*n)
        {
            res[index]=mat[r][c];
            index++;
            if(dir==1) //going bottom to top
            {
                if(c==n-1)
                {
                    dir=-1;
                    r++;
                }
                else if(r==0)
                {
                    dir=-1;
                    c++;
                }              
                else
                {
                    r--; c++;
                }
            }
            else //going top to bottom
            {
                if(r==m-1)
                {
                    dir=1;
                    c++;
                }
                else if(c==0)
                {
                    r++;
                    dir=1;
                }
                else
                {
                    r++; c--;
                }
            }
        }
            return res;
        

      
      
      
      /*  
        int n=mat.size();
        int m=mat[0].size();
        vector<int> ans;
        map<int, vector<int>> mp;
        
        for(int i=0;i<mat.size();i++)
        {
            for(int j=0;j<mat[0].size();j++)
            {
                mp[i+j].push_back(mat[i][j]);
            }
        }
        
        for(auto i: mp)
        {
            if(i.first%2==0)
                reverse(i.second.begin(), i.second.end());
        for(auto x: i.second)
            ans.push_back(x);
        }
        
        return ans;*/
    }
};
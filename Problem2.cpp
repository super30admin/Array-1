class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
       int m = matrix.size();
        int n=matrix[0].size(); 
        vector<int> result;
        if(matrix.size()==0) return result;
         int r = 0, c = 0;
        int i = 0;
        int dir = 1;
        
        while(i<m*n)
        {
            result.push_back(matrix[r][c]);
             if(dir == 1)
             { 
                if(c==n-1) 
                {
                    r++;
                    dir = -1;
                }
                 else if (r==0) 
            {  c++;
             dir = -1;
            } 
            else
            {
                r--;
                c++;
            }
        }
            else
            {
                if(r==m-1)
                {
                    c++;
                    dir=1;
                }
                else if(c==0)
                {
                    r++;
                    dir=1;
                }
                else
                {
                    r++;
                    c--;
                    
                }
            }
            
            i++;
        
    }
        return result;
    }
};
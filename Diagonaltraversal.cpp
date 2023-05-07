TC:O(m*n),SC:O(1)

// two movements bottom to top and top to bottom and tracking approach with variable dir=1 (bottom to top) dir=-1 for top to bottom ;
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {

        int m=mat.size();
        int n=mat[0].size();
        int r=0,c=0;
        int dir=1;
        int index=0;
        vector<int>ans;

// Becareful in the order of if ,else if conditions
        while(index<m*n)
        {
            ans.push_back(mat[r][c]);
            
            // up
            if(dir==1)
            {
                // while moving from bottom to top ROW decreases and COL increases 
                // as row dec it may reach at point row=0 and as col inc it may reach a condition c=n-1 at this point they direction need to be reversed
                if(c==n-1)
                {
                    dir=-1;
                    r++;
                }
                else if(r==0)
                {
                    dir=-1;
                    c++;     
                    // here we are incrementing col ,before that careful in checking the col condition before;
                }
                 
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                // it is reverse process of the above
                if(r==m-1)
                {
                    dir=1;
                    c++;

                }
                else if(c==0)
                {
                    dir=1;
                    r++;
                }
                else
                {
                r++;
                c--;
                }
            }
            index++;
        }

        return ans;
    }
};
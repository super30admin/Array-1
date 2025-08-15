class Solution {//time compleaxity o(m*n)and space complexity o(1)
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        if(mat.size()==0)
        return {};
        int m =mat.size();
        int n= mat[0].size();
        vector<int>result(n*m);
        bool dir =true;
        int r =0,c=0;
     
        for(int i=0;i<m*n;i++)
        {

           result[i] =mat[r][c];
        if(dir)//upward
        { 
            if(c==n-1)// hit top edge
            {
             dir =false;
             r++;
            }
            else if(r==0)// hit right edge
            {
              dir =false;
              c++;
            }
            else //normal
            {
                r--;
                c++;
            }  

        }
        else//downward
        {
          if(r==m-1) //hit bottom edge
          {
             dir =true;
             c++;
          }
          else if(c==0) //hit left edge
          {
            dir=true;
            r++;
          }
          else
          {
            r++;
            c--;
          }

        }
        
    }
    return result;
    }
};
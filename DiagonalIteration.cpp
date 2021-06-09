class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        
        
        int i=0;
        int m=mat.size();
        int n=mat[0].size();
        int col=0;
        int row=0;
        int dir=1;
        int s=m*n;
        
        vector<int> res(s);
        
        while(i<s)
        {
            res[i]=mat[row][col];
            if(dir==1)  //go upwards
            {
                if(col==n-1)
                {
                    row++;
                    dir=-1;
                }
                else if(row==0)
                {
                    dir=-1;
                    col++;
                }
                else
                {
                    row--;
                    col++;
                }
                
            }
            else if(dir==-1)  //go downwards
            {
                if(row==m-1)
                {
                    dir=1;
                    col++;
                    
                }
                else if(col==0)
                {
                    row++;
                    dir=1;
                }
                else
                {
                    col--;
                    row++;
                }
            }
            i++;  
        }
        return res;
    }
};

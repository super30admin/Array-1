//TC:  O(mxn)
//SC : O(1)
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {

        vector<int> res;
        int top_row=0;
        int first_col=0;
        int last_row=matrix.size()-1;
        int last_col=matrix[0].size()-1;
        int dir=1;
        int o=0;

        while(top_row<=last_row and first_col<=last_col)
        {
            
            if(dir==1)
            {
                for(int i=first_col; i<=last_col; i++)
            {
               res.push_back(matrix[top_row][i]);          
            } 
                 top_row++;
            }

           
            if(dir==2)
            {
               for(int j=top_row; j<= last_row; j++)
            {
                res.push_back(matrix[j][last_col]);
            }
            last_col--; 
            }

            
            if(dir==3)
            {
                for(int k=last_col; k>=first_col; k--)
            {
                res.push_back(matrix[last_row][k]);
            }
            last_row--;
            }

            if(dir==0)
            {
              for(int w=last_row; w>=top_row; w--)
            {
                res.push_back(matrix[w][first_col]);

            }
            first_col++;  
            }
            dir=(dir+1)%4;
            o++;
        }
        return res;
    }
};



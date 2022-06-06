//Time Complexity- O(m*n)
//Space Complexity- O(m*n)

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        vector<int> ans;
        if(matrix.size()==0){
            return ans;
        }
        
        int rowstart=0;
        int rowend=matrix.size()-1;
        int colstart=0;
        int colend=matrix[0].size()-1;
        
        while(rowstart<=rowend && colstart<=colend){
            
            for(int i=colstart;i<=colend;i++){
                ans.push_back(matrix[rowstart][i]);
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                ans.push_back(matrix[i][colend]);
            }
            colend--;
            
            if(rowstart<=rowend){
                for(int i=colend;i>=colstart;i--){
                    ans.push_back(matrix[rowend][i]);
                }
            }
            rowend--;
            
            if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    ans.push_back(matrix[i][colstart]);
                }
            }
            colstart++;
        }
        return ans;
    }
};
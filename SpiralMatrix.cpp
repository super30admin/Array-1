// Time Complexity - O(n) - Since we iterate over all the elements in matrix. 'n' is the total number of elements in the matrix
// Space Complexity - O(n), Since the size for vector 'answer' depends on the the number of elements in the matrix.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> answer;
        
        int topLim = 0;
        int bLim = matrix.size()-1;
        int rightLim = matrix[0].size() - 1;
        
        if(bLim == 0)
            return matrix[0];
        
        if(rightLim == 0){
            for(int i = 0; i <= bLim; i++){
                answer.push_back(matrix[i][0]);
            }
            return answer;
        }
        
        int leftLim = 0;
        int i=0, j=0;
        answer.push_back(matrix[i][j]);
        while(topLim <= bLim && rightLim >= leftLim){
                while(j < rightLim){
                    j++;
                    answer.push_back(matrix[i][j]);
                }
                topLim++;
            
                
                while(i < bLim){
                  
                    i++;
                    answer.push_back(matrix[i][j]);
                }
                rightLim--;
                
            
                if(topLim <= bLim && rightLim >= leftLim){
                while(j > leftLim){
                    
                    j--;
                    answer.push_back(matrix[i][j]);
                }
                bLim--;
                }
            
                if(topLim <= bLim && rightLim >= leftLim){
                while(i > topLim){
                    
                    i--;
                    answer.push_back(matrix[i][j]);
                }
                leftLim++;
                }
            }
        return answer;
    }
};

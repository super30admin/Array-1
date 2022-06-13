// Time Complexity - O(n) - Since we iterate over all the elements in 'mat'. 'n' is the total number of elements in the 'mat'.
// Space Complexity - O(n), Since the size for vector 'answer' depends on the the number of elements in the matrix.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> answer;
        
        int m = mat.size();
        int n = mat[0].size();
        
        int i = 0, j = 0;
        if(m == 1)
            return mat[0];
        if(n == 1){
            for(int i = 0; i < m; i++){
                answer.push_back(mat[i][0]);
            }
            return answer;
        }
        
        answer.push_back(mat[i][j]);
        while(i < m || j < n){
            
            if(i == 0 && j < n-1){
                j++;
                answer.push_back(mat[i][j]);
                while(j > 0 && i < m-1){
                    j--;
                    i++;
                    answer.push_back(mat[i][j]);
                }
            }
            
            else if(j == 0 && i < m-1){
                i++;
                answer.push_back(mat[i][j]);
                while(j < n-1 && i > 0){
                    i--;
                    j++;
                    answer.push_back(mat[i][j]);
                }
            }
            
            else if(j == n-1 && i < m-1){
                i++;
                answer.push_back(mat[i][j]);
                while(j > 0 && i < m-1){
                    j--;
                    i++;
                    answer.push_back(mat[i][j]);
                }
            }
            
            else if(i == m-1 && j < n-1){
                j++;
                answer.push_back(mat[i][j]);
                while(i > 0 && j < n-1){
                    j++;
                    i--;
                    answer.push_back(mat[i][j]);
                }
            }
            else
                break;
        }
        return answer;
    }
};

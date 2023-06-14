// Time Complexity: O(m*n)
// Space Compleixty: O(1)

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int p1 = 0; 
        int p2 = matrix[0].size()-1; 
        int p3 = matrix.size()-1; 
        int p4 = 0;

        vector<int> result; 

        while(p1 <= p3 && p2 >= p4) {

            // Left-to-Right Across 
            if(p1 <= p3 && p2 >= p4) {
                for(int j = p4; j <= p2; j++) {
                result.push_back(matrix[p1][j]);
                }
            }


            p1++;

            // Top-to-Bottom Right
            if(p1 <= p3 && p2 >= p4) {
                for(int j = p1; j <= p3; j++) {
                result.push_back(matrix[j][p2]);
                }  
            }
   

            p2--; 

            // Right-to-Left Bottom
            if(p1 <= p3 && p2 >= p4) {
                for(int j = p2; j >= p4; j--) {
                result.push_back(matrix[p3][j]);
                }
            }


            p3--;

            // Bottom-to-Top Left
            if(p1 <= p3 && p2 >= p4) {
                for(int j = p3; j >= p1; j--) {
                result.push_back(matrix[j][p4]);
                }
            }


            p4++;

        }

        // while(result.size() > matrix.size()*matrix[0].size()) {
        //     result.pop_back(); 
        // }

        return result; 
    }
};
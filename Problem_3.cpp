// Time Complexity : O(m*n), where m is number of rows and n is number of cols.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES 

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.size()==0){
            return {};
        }
        int c1 = 0;
        int c2 = matrix.at(0).size()-1;
        int r1 = 0;
        int r2 = matrix.size()-1;
        vector<int> result;
        while((c1<=c2) && (r1<=r2)){
            //right
            for(int i=c1; i<=c2; i++){
                   result.push_back(matrix.at(r1).at(i));
            }
            r1++;
            //down
            for(int i=r1; i<=r2; i++){
                result.push_back(matrix.at(i).at(c2));
            }
            c2--;
            //left
            if((c1<=c2) && (r1<=r2)){
                for(int i=c2; i>=c1; i--){
                    result.push_back(matrix.at(r2).at(i));
                }
            }
            r2--;
            //up
           if((c1<=c2) && (r1<=r2)){   
            for(int i=r2; i>=r1; i--){
                result.push_back(matrix.at(i).at(c1));
            }
          }
           c1++;
        }
        return result;
    }
};
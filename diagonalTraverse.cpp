// Time Complexity : O(NlogN)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
          vector<int> answer;
        map<int,vector<int>> m;
        int row=matrix.size();
        if(row==0)
            return answer;
        int col=matrix[0].size();
      
        //in this for loop we are traversing the matrix and adding the coordinated of the data (i+j) and push the data to the vector i+j is the key and the corresponding matrix value is the value
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                m[i+j].push_back(matrix[i][j]);
            }
        }
        
        for (auto x:m) {
            //if the key (i+j) coordinate sum is odd then there is no need to change 
            if (x.first%2==1) {
                for(auto a:x.second){
                    answer.push_back(a);
                }
            //if the key (i+j) coordinate sum is even then reverse the associated values and then push to the answer vector
            } else if (x.first%2==0) {
                reverse((x.second).begin(),(x.second).end());
                for(auto a:x.second){
                    answer.push_back(a);
                }
            }
        }
        return answer;
    }
};
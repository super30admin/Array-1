class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> answer;
        map<int, vector<int>> um;

        for (int i=0;i<mat.size();i++) {
            for (int j=0;j<mat[0].size();j++) {
                um[(i+j)].push_back(mat[i][j]);
            }
        }
        int dir = 0;
        for (auto itr: um) {
            if (dir%2 == 0) 
                reverse(itr.second.begin(), itr.second.end());
            for (auto x: itr.second) {
                answer.push_back(x);
            }
            dir++;
        }

        return answer;
    }
};

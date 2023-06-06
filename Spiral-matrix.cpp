class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector <int> ans;

        int row = matrix.size();
        int col = matrix[0].size();

        int count = 0;
        int total = row*col;


        int startingrow = 0;
        int startingcolum = 0;
        int endingrow = row-1;
        int endingcolum = col-1;


        while(count<total){

            for(int index = startingcolum; count<total && index<=endingcolum;index++){
                ans.push_back(matrix[startingrow][index]);
                count++;

            }
            startingrow++;

                 for(int index = startingrow ; count<total &&index<=endingrow;index++){
                ans.push_back(matrix[index][endingcolum]);
                count++;

            }
            endingcolum--;

            for(int index = endingcolum ; count<total && index>=startingcolum;index--){
                ans.push_back(matrix[endingrow][index]);
                count++;

            }
            endingrow--;

            for(int index = endingrow ;count<total && index>=startingrow;index--){
                ans.push_back(matrix[index][startingcolum]);
                count++;

            }
            startingcolum++;
        }

            return ans;
    }
};
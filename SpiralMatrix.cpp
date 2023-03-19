class Solution {
         // Time COmplexity : O(m*n)
        // Space Complexity : O(1) 
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> outputArray;
        int rows = matrix.size();
        int columns = matrix[0].size();
        int top = 0;
        int bottom = rows-1;
        int left =0;
        int right =  columns-1;
        int i=0;
        int j=0;
        // int count =0;
        while(outputArray.size()< rows*columns  ){
            for(j = left ;j<= right && outputArray.size()< rows*columns ;j++ ){
                outputArray.push_back(matrix[i][j]);
                cout<<matrix[i][j];
            }
            top++;
            j--;
            for(i = top ;i<= bottom && outputArray.size()< rows*columns ;i++ ){
                outputArray.push_back(matrix[i][j]);
                  cout<<matrix[i][j];
            }
            right--;
            i--;
             for(j = right ;j>= left && outputArray.size()< rows*columns ;j-- ){
                outputArray.push_back(matrix[i][j]);
                  cout<<matrix[i][j];
            }
            bottom--;
            j++;
            for(i = bottom ;i>= top && outputArray.size()< rows*columns ;i-- ){
                outputArray.push_back(matrix[i][j]);
                  cout<<matrix[i][j];
            }
            left++;
            i++;


        }
        return outputArray;
        
    }
};
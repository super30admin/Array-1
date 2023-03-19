class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {

        // Time COmplexity : O(m*n)
        // Space Complexity : O(1) 
        int numOfRows = mat.size();
        int numOfColumns = mat[0].size();
        int i=0;
        int j=0;
        long long int sizeofReturnArray = numOfRows*numOfColumns;
        vector<int> returnElements;
        int count=0;
        while(returnElements.size() < sizeofReturnArray){
            while(i>=0 && j<numOfColumns && i<numOfRows && j>=0){
               returnElements.push_back(mat[i][j]);
                i--;
                j++;
                count++;
            }
            cout<<"count"<<count;
            cout<<"j"<<j;
            if(i<0 && j<numOfColumns) i++;
            else if(i<0 || j>=numOfColumns) {i+=2;j--;}

             while(j>=0 && i<numOfRows && i>=0 && j<numOfColumns){
                returnElements.push_back(mat[i][j]);
                i++;
                j--;
                count++;
            }
             cout<<"count"<<count;
            cout<<"j"<<j;

            if(j<0 && i<numOfRows) j++;
            else if(j<0 || i>=numOfRows) {j+=2;i--;}

        }
    
        return returnElements;
        
    }
};
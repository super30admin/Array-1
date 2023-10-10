class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int sr=0,er=matrix.size()-1,sc=0,ec=matrix[0].size()-1;
        vector<int> results;
        while(sr<=er && sc<=ec){
            //printing the starting row
            for(int i=sc;i<=ec;i++){
                results.push_back(matrix[sr][i]);
            }
            sr++;
            //printing the last column
            for(int i=sr;i<=er;i++){
                results.push_back(matrix[i][ec]);
            }
            ec--;
            if(sr<=er){
                //printing the last row
            for(int i=ec;i>=sc;i--){
                results.push_back(matrix[er][i]);
            }
            er--;    
            }
            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                results.push_back(matrix[i][sc]);
            }
            sc++;    
            }
            
            

        }
        return results;
    }
};




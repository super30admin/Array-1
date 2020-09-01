// Time Complexity : O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach


class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        
        // return null if the input matrix is null
        if (m ==0){
            vector<int> result;
            return result;
        }
        int n = matrix[0].size();
        vector<int> result(m*n,0);

        //initializing the left, right, top & bottom
        int left= 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        int iteration = 0;
        
        // return null if the first row is null
    if (n ==0|| m ==0){
        return result;
    }
        
        
            while(top<=bottom && left<=right){ // checking for over flow to break the loops

                // left -> right
            
            for ( int i = left; i <= right; i++){
                 
                result[iteration] = matrix[top][i];
                iteration +=1;
            }
            top+=1;
          
          // top -> bottom
            for (int i = top; i <= bottom; i++){
                result [iteration] = matrix[i][right];
                iteration +=1;
            }
            right -=1;


            // right -> left also checking the top, bottom to skip over flow
           if (top<=bottom) {
            for (int i = right; i >= left; i--){
                result[iteration] = matrix[bottom][i];
                iteration +=1;
            }}
            bottom -=1;
             cout<<result[iteration-1];

             //bottom -> top also checking the over flow
            if (left <= right){
            for ( int i = bottom; i >= top;i--){
                result[iteration] = matrix[i][left];
                iteration+=1;
            
            }}
            left +=1; 
                
            cout<< left<< " " << right<< " "<< top <<" "<< bottom<<" "<< result[iteration-1]<< endl;   
                
            }
        
      return result;  
    }
};
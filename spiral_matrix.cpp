//spiral traversal of matrix
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.empty() || matrix.size() == 0) return{};

        int m = matrix.size();    // size of rows
        int n = matrix[0].size();  //size of columns

        vector<int> result(m*n);   //vector to store the elements in spiral order


        int index = 0;

        int top = 0, bottom = m-1, left = 0, right = n-1; // 4 pointers for 4 corner elements
        int direction = 0;    // 0 for right, 1 for down, 2 for left, 3 for up, counter clockwise

        while(top <= bottom && left <= right){
            if(direction == 0){                // to go on the right side
                for(int i = left; i <= right; i++){
                    result[index++] = matrix[top][i];
                }
                    top++;
                   // direction++;

            }else if(direction == 1){           // to go in the bottom direction
                for(int i = top; i <= bottom; i++){
                    result[index++] = matrix[i][right];
                }
                    right--;
                   // direction++;

            }else if(direction == 2){            // to go to the left
                for(int i = right; i>= left; i--){
                    result[index++] = matrix[bottom][i];
                }
                    bottom--;
                    //direction++;

            }else if(direction == 3){           //to go up/top
                for(int i = bottom; i >= top; i--){
                    result[index++] = matrix[i][left];
                }
                left++;
                //direction = 0;
            }
          direction = (direction + 1) % 4;       // since 4 mod 4 is 0, this works

        }

      return result;

    }
};

//Time complexity: O(mn)
//Space Complexity: O(1)

//diagonal traverse 
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        //edge case
        if(matrix.empty() || matrix.size()== 0) return{};

        int m = matrix.size();    // for row
        int n = matrix[0].size();  // for column

         vector<int> result(m*n);   //vector to store the elements in diagonal order

        result[0] = matrix[0][0]; // 1st element of result array is always [0][0] of the matrix

        int index = 1;
        int row = 0, column = 0;
        bool forward = false;    //true for forward direction

        while(row < m && column< n) {
            if(forward){
                if(row == m -1) column++;   // row traveral and checking boundary
                else
                    row++;

                forward = false;
                while(row >= 0 && column < n){   // to go forward
                    result[index++] = matrix[row--][column++];
                }
                row++;
                column--;

            }else{
                 if(column == n - 1) row ++;    //column traversal and checking boundary
                else
                    column++;
                forward = true;
                while(row < m && column >= 0){      // to go backward/downward
                    result[index++] = matrix[row++][column--];
                }

                row--;     //when you hit boundary conditions
                column++;
            }
        }

        return result;
    }
};

//Time Complexity: O(mn)
//Space Complexity: O(1)

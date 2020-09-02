
//  54_Spiral_Matrix

//  TC: O(N*M)
//  SC: O(1)

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
       /*
              L     R
       T -> [ 1, 2, 3 ]
            [ 4, 5, 6 ]
       B -> [ 7, 8, 9 ]
       */
        if(matrix.size()==0)
            return vector<int>();
        int N=matrix.size(), M=matrix[0].size();
        vector<int> output;
        // need 4 pointers
        int top=0, bottom=N-1, left=0, right=M-1;
        
        //break condition
        
        while(left<=right && top<=bottom){
            // 1.Top:    L->R  until left <= right
            // top++ to move to next row
             if(top<=bottom){                           //can or cannot add
                for(int i=left;i<=right;i++){
                    output.push_back(matrix[top][i]);
                }
                top++;
             }
            
            // 2. Right:  T -> B until top <= bottom
            // right--
            if(left<=right){                            //can or cannot add
                for(int i=top;i<=bottom;i++){
                    output.push_back(matrix[i][right]);
                }
                right--;
            }
            
            // 3. Bottom: R -> L until right >= left
            // bottom++
                if(top<=bottom){       //3*4 maatrix would fail without this condition
                    for(int i=right;i>=left;i--){
                        output.push_back(matrix[bottom][i]);
                    }
                    bottom--;
                }
                
            
            // 4. Left: B->T until bottom <= top
            // left++
             if(left<=right){              //1*3 maatrix would fail without this condition
                for(int i=bottom;i>=top;i--){
                    output.push_back(matrix[i][left]);
                }
                left++;
             }
        }
        return output;
    }
};
int main(int argc, const char * argv[]) {
    Solution s;
    vector<vector<int>> matrix={{1,2,3},{4,5,6},{7,8,9}};
    vector<int> output=s.spiralOrder(matrix);
    for(int i:output){
        cout<<i<<"\t";
    }
     cout<<endl;
    return 0;
}

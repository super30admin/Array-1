//  498_Diagonal_Traverse


#include <iostream>
#include <vector>

using namespace std;

//TC: O(N*M)
//SC: O(1)

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        // variable to maintain which direction to go - upwards -true, downwards-false;
        if(matrix.size()==0)
            return vector<int>();
        bool direction=true; //upwards
        int N=matrix.size(), M=matrix[0].size();
        vector<int> output(N*M);
        int i=0, j=0;
        int idx=0;  //to keep track of number of elements traversed
        
        while(idx<=N*M-1){
            output[idx]=matrix[i][j];
            idx++;
            //upwards
            if(direction){
                if(j==M-1){
                    i++;
                    direction=false;
                }
                else if(i==0){
                    direction=false;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            //downwards
            else{
                if(i==N-1){
                    j++;
                    direction=true;
                }
                else if(j==0){
                    i++;
                    direction=true;
                }
                else{
                    j--;
                    i++;
                }
            }
        }
        return output;
    }
};

int main(int argc, const char * argv[]) {
    Solution s;
    vector<vector<int>> matrix={{1,2,3},{4,5,6},{7,8,9}};
    vector<int> output=s.findDiagonalOrder(matrix);
    for(int i:output){
        cout<<i<<"\t";
    }
     cout<<endl;
    return 0;
}

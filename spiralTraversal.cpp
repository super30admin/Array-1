#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {

        int m = matrix.size();
        int n = matrix[0].size();

        vector<int> result;

        int top = 0;
        int bottom = m-1;

        int left =0;
        int right = n-1;
        

       


        while (top <= bottom && left <= right){

            for(int j=left;j<=right;j++){
                result.push_back(matrix[top][j]);


            }
            top++;

            
            for(int i =top;i<=bottom;i++){
                result.push_back(matrix[i][right]);
            }
            right--;

            if(left<=right)
            {
                for(int j=right;j>=left;j--){
                    result.push_back(matrix[bottom][j]);

                }
                bottom--;
            }

            if(top<=bottom)

            {for(int i = bottom;i>=top;i--){
                result.push_back(matrix[i][left]);
            }
            left++;}

        }

        return result;

        // for(int i=0;i<result.size();i++){
            


        //     result[i]=matrix[r][c];

        //     if(traverse){
        //         if(c==c2){
        //             r1++;
        //             r++;
        //             traverse=false;

        //         }
        //         else{
        //             c++;
        //         }

        //     }

        //     else{

        //         if()

        //     }

        // }
        
    }
};
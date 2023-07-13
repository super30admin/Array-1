#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {

        int m = mat.size();
        int n = mat[0].size();

        vector<int> result(m*n);
        bool flag=true;
        int r = 0;
        int c = 0;

        for(int i=0;i<result.size();i++){
            result[i]=mat[r][c];
            if(flag){
                if(r==0 && c!=(n-1)){
                    c=c+1;
                    flag = false;

                }
                else if(c==(n-1)){
                    r=r+1;
                    flag=false;


                }

                else{
                    r=r-1;
                    c=c+1;

                }
            }
            else{

                if(r==m-1){
                    c=c+1;
                    flag=true;
                }

                else if(c==0){
                    r=r+1;
                    flag=true;


                }
                else{
                    r=r+1;
                    c=c-1;
                }

            }

            

        }



        return result;





        
    }
};

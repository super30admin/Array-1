// Time Complexity : O(mxn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

/*
While traversing the matrix, the traversal is either going up or down at any particular
instance. So starting from 00, it starts going up and whenever it find the edge of the matrix
it changes the direction and vice versa. we first write the solution for going up, and for 
when it changes the direction, we write the solution for going down.
*/

// Your code here along with comments explaining your approach

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


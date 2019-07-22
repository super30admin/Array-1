//
// Created by shazm on 7/20/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

class Solution{
public:
    vector<int> prob(vector<vector<int>>& nums){
        vector<int> retVec;
        int i = 0;int j = 0; int top = 0; int targeti; int targetj;
        bool right = true; bool left = false; bool down = false; bool up = false;
        if(nums.size()>2){
            targeti = (nums.size()-2);
            targetj = (nums[0].size()-2);
        }else{
            targeti = 1; targetj = 0;
        }
        while((i!=targeti) || (j!=targetj)){
            retVec.push_back(nums[i][j]);
            if(right){
                if(j+1>=nums[0].size()){
                    i++; right=false; down = true; top+=1;
                }else{j++;}
            }else if(down){
                if(i+1>=nums.size()){
                   j--; down=false; left = true;
                }else{i++;}
            }else if(left){
                if(j-1<0){
                    i--; left = false; up = true;
                }else{j--;}
            }else if(up){
                if(i!=top){
                    i--;
                }else{j++; up = false; right = true;}
            }
            if((i==targeti) && (j==targetj)){
                retVec.push_back(nums[i][j]);
            }
            cout<<i<<" i "<<j<<" j\n";
        }
        return retVec;
    }

//    vector<int> recurr(vector<vector<int>>& vec, int start, int end, int base){
//
//    }
};

int main(){
    Solution s;
    vector<vector<int>> vec{{1,2,3,4},{4,5,6,7}};
    vector<int> vec2{4,5,6};
    for(int x : s.prob(vec)){
        cout<<x<<endl;
    }
    return 0;
}
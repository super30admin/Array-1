//
// Created by shazm on 7/20/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

class Solution{
public:
    vector<int> prob(vector<vector<int>> nums){
        vector<int> retVec;
        int i = 0; int j = 0; bool up = true;
        for(int x = 0; x<(nums.size()*nums[0].size()); x++){
            retVec.push_back(nums[i][j]);
//            cout<<i<<" i | "<<j<<" j\n";
            if((i-1<0 || j+1>=nums[0].size())&& up){
                if(j+1>=nums[0].size()){
                    i++;
                }else{
                    j++;
                }
                up = false;
            }else if((j-1<0 || i+1>=nums.size()) && !up){
//                cout<<"in \n";
                if(i+1>=nums.size()){
                    j++;
                }else{i++;}
                up = true;
            }else if(!up){
                i++;j--;
            }else{
                i--;j++;
            }
//            cout<<"done "<<i<<" i | "<<j<<" j\n";
        }
        return retVec;
    }
};

int main(){
    Solution s;
    vector<vector<int>> vec{{1,2,3},{4,5,6},{7,8,9}};
    vector<vector<int>> vec2{{2,5},{8,4},{0,-1}};
    for(int x : s.prob(vec2)){
        cout<<x<<endl;
    }
    return 0;
}
#include<iostream>
#include<vector>
#include<string>
#include<unordered_map>
#include <bits/stdc++.h>
#include<math.h>
#include<map>

using namespace std;

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat)
    {
        if(mat.size()==0)
        {
            vector<int> temp={0};
            return temp;
        }
        int m=mat.size();
        int n=mat[0].size();
        int size=m*n;
        vector<int> res (size,0);
        int r=0;
        int c=0;
        bool dir=true;
        int i=0;
        while(i<m*n)
        {
            res[i]=mat[r][c];

            if(dir==true)
            {
                if(c==n-1)
                {
                    r++;
                    dir=false;
                }
                else if(r==0)
                {
                    c++;
                    dir=false;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                if(r==m-1)
                {
                    c++;
                    dir=true;
                }
                else if(c==0)
                {
                    r++;
                    dir=true;
                }
                else
                {
                    r++;
                    c--;
                }

            }
            i++;
        }
        return res;
    }
};


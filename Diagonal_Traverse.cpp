Time Complexity-O(n*m)
Space Complexity-O(n+m-1)----->  *size of the vector which has n+m-1 deque's *
Did the code run on Leetcode? Yes

#include <iostream>
#include<vector>
#include<deque>
using namespace std;

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& matrix) {
        if(matrix.size()==0)
        {
            return {};
        }
        vector<int>m;
        int a=matrix.size();
        int b=matrix[0].size();
        vector<deque<int>>k(a+b-1);
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if((i+j)%2==0)
                {
                    k[i+j].push_front(matrix[i][j]);
                }
                else
                {
                    k[i+j].push_back(matrix[i][j]);
                }
            }
        }
        for(int i=0;i<k.size();i++)
        {
            for(int j=0;j<k[i].size();j++)
            {
                m.push_back(k[i][j]);
            }
        }
        return m;
    }
};

int main() {
	vector<vector<int>>m={
                           { 1, 2, 3 },
                           { 4, 5, 6 },
                           { 7, 8, 9 }
	                      };
	vector<int>res;
	Solution soln;
	res=soln.findDiagonalOrder(m);
	for(int i=0;i<res.size();i++)
	{
	    cout<<res[i]<<" ";
	}
	return 0;
}

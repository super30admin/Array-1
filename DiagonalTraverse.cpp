#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
Start from the 0th row and colum keep the direction true when moving up the diagonal
and make it false while the diagonal moves down, keep updating the rows and 
columns accordingly and return the array
*/
class Solution{
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        //TC: O(row*col) SC: O(1)
        int row=mat.size(), col=mat[0].size();
        vector<int> arr(row*col);
        int m=0, n=0;
        bool dir =true;
        for(int i=0;i<row*col;i++){
            arr[i]=mat[m][n];
            if(dir){
                if(n == col-1){
                    m++;
                    dir=false;
                }else if(m==0){
                    n++;
                    dir=false;
                }else{
                    m--; n++;
                }
            }else{
                if(m==row-1){
                    n++;
                    dir=true;
                }else if(n==0){
                    m++;
                    dir=true;
                }else{
                    m++; n--;
                }
            }
        }
        return arr;   
    }
};

#include<iostream>
using namespace std;

int main(){

    int n,m;
    cin>>n>>m;

    int arr[n][m];

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            arr[i][j]=rand()%10;
        }
    }
    cout<<endl;

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            cout<<arr[i][j]<<" ";;
        }
        cout<<endl;
    }
    cout<<endl;

    int rs=0,cs=0,re=n-1,ce=m-1;

    while(rs<=re && cs<=ce){
        for(int col=cs; col<=ce; col++){
            cout<<arr[rs][col]<<" ";
        }
        rs++;
        for(int row=rs; row<=re; row++){
            cout<<arr[row][ce]<<" ";
        }
        ce--;
        if(rs<=re){
        for(int col=ce; col>=cs; col--){
            cout<<arr[re][col]<<" ";
        }
        }
        re--;
        if(cs<=ce){
        for(int row=re; row>=rs; row--){
            cout<<arr[row][cs]<<" ";
        }
        }
        cs++;
    }

    return 0;
}
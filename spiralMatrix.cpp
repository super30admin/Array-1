// Time Complexity : O(mn) 
// Space Complexity : O(mn)   
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1. There are four directions to be executeed in a fixed order: right(row same, col inc), down(row inc, col same), left(row same, col dec), up(row dec, col same)
// 2. Next row and col is found using above direction if the calculated indices are valid else we change direction
// 3. Maintain visited arrow to not repeat the elements


class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int R = matrix.size();
        vector<int> spiral;
        cout<<R<<endl;
        if(!R)
            return spiral;
        int C = matrix[0].size();
        int r = 0, c= 0, di = 0;
        int dr[4] = {0,1,0,-1}; // row change directions
        int dc[4] = {1,0,-1,0}; //col change directions
        int visited [R][C];
        for(int i=0;i<R;i++)
            for(int j=0;j<C;j++)
                visited[i][j] = 0;
        int next_r = 0,next_c = 0;
        
        for(int i=0; i<R*C; i++){
            cout<<"r: "<<r<<" c: "<<c<<" ";
            cout<<matrix[r][c]<<endl;
            spiral.emplace_back(matrix[r][c]);
            visited[r][c] = 1;
            next_r = r+dr[di];
            next_c = c+dc[di];
            if(next_r>=0 && next_r<R && next_c>=0 && next_c<C && !visited[next_r][next_c]){
                r = next_r; c = next_c; // advance in same direction
            }
            else{ // change directions
                di = (di+1)%4; // since more than 4 turns reqd
                r+=dr[di];
                c+=dc[di];
            }
        }
        return spiral;
    }
};
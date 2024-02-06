class Solution {
public:
    vector<vector<int>> mat;
    vector<int> ret;
    int rows, cols;

    /*
    Let's just do DFS.
    Maintain the direction of traverse until we hit out of bound or already visited cell

    d = 0 ==> right
    d = 1 ==> down
    d = 2 ==> left
    d = 0 ==> up
    */
    int dr[4] = {0,1,0,-1};
    int dc[4] = {1,0,-1,0};
    void trav(int r, int c, int d){
      if(r<0 || r>=rows || c<0 || c>=cols)  return;
      if(mat[r][c]==-105)  return; //if visited

      ret.push_back(mat[r][c]);
      mat[r][c] = -105; //mark visited

      for(int i=0;i<4;i++)
        trav(r+dr[(d+i)%4],c+dc[(d+i)%4],(d+i)%4); //modding will round back to right in next of up
    }

    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        ret.clear();
        rows = matrix.size(), cols= matrix[0].size();
        this->mat = matrix;

        trav(0,0,0);
        return ret;
    }
};

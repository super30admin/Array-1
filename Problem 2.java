//Game of life.

//Time Complexity: O(N*M)
//Space Complexity: O(min(N,M))


class Solution {

    int n;
    int m;

    public void gameOfLife(int[][] board) {


        if(board == null || board.length ==0){
            return;
        }

        m = board.length;
        n = board[0].length;

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                int count = liveCount(board, i, j);

                if(board[i][j] == 1 && (count <2 || count >3)){
                    board[i][j] = 3;
                }

                if(board[i][j] == 0 && count == 3){
                    board[i][j] = 2;
                }
            }
        }

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                if(board[i][j] == 3){

                    board[i][j] = 0;
                }

                if(board[i][j] == 2){

                    board[i][j] = 1;
                }
            }
        }

    }

    private int liveCount(int[][] mat, int i, int j){
        int res =0;
        int[][] dirs={{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};

        for(int[] dir: dirs){
            int nr = i+dir[0];
            int nc = j+dir[1];

            if(nr>=0 && nr<m && nc>=0 && nc<n && (mat[nr][nc] == 1 || mat[nr][nc] == 3)){
                res++;
            }
        }

        return res;
    }
}
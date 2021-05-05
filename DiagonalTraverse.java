// Time Complexity :O(m*n), m=no. of rows, n=no. of columns
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
/*

*/
    class DiagonalTraverse {
        public int[] findDiagonalOrder(int[][] mat) {
            //storing row and column lengths
            int m = mat.length;
            int n = mat[0].length;

            //array to store result
            int[] res =  new int[m*n];

            //initializing direction, row and col
            int dir=1;
            int i=0;
            int r=0, c=0;
            //for all the elements in matrix
            while(i<res.length){
                //set result
                res[i] = mat[r][c];
                //increement result index
                i++;
                //if moving upwards
                if(dir==1){
                    //if on the left most column
                    if(c==n-1  && r<m-1){
                        //move down and change direction to downward
                        r=r+1;
                        dir =-1;
                    }
                    //if on the top most row
                    else if(r==0 && c<n-1){
                        //move right and change direction to downward
                        c=c+1;
                        dir=-1;
                    }
                    //move up and move right
                    else{
                        r=r-1;
                        c=c+1;
                    }
                }
                //if moving downwards
                else{
                    //if on the left most column
                    if(c==0  && r<m-1){
                        //move down and change direction to upward
                        r=r+1;
                        dir=1;
                    }
                    //if on the bottom most row
                    else if(r==m-1 && c<n-1){
                        //move right and change direction to upward
                        c=c+1;
                        dir=1;
                    }//move down and move left
                    else{
                        r=r+1;
                        c=c-1;
                    }
                }
            }
            return res;
        }
    }
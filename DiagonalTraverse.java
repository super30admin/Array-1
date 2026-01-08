// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// we start with r=c=0, with upward direction
//for up we decrese row, increse col, when out of boundary adjust row and column and make down
//for down increase row, decrese col, when out of boundary adjust row and column and make down
//have counetr to exit when all traversed
// Your code here along with comments explaining your approach
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] ans = new int[mat.length*mat[0].length];
        int counter = 0;
        //initial row, column
        int r = 0;
        int c = 0;
        //intial up
        boolean up = true;
        //boundary
        int rLen = mat.length-1;
        int cLen = mat[0].length-1;
        while(true)
        {
            if(up)
            {
                //when up add to ans, decrese row, increase col
                ans[counter] = mat[r][c];
                counter++;
                r--;
                c++;

                //boundary check, adjust r and col, make down
                //cental diagonal amy be up or down
                if(r<0 && c>cLen)
                {
                    c = cLen;
                    r = 1;
                    up = false;
                }
                else if(r<0)
                {
                    r = 0;
                    c = c;
                    up = false;
                }
                else if(c > cLen)
                {
                    r = r + 2;
                    c = cLen;
                    up = false;
                }
            }
            else
            {
                //down, incrase row, decrease col
                ans[counter] = mat[r][c];
                counter++;
                r++;
                c--;

                //boundary check, adjust
                //cental diagonal amy be up or down
                if(c<0 && r>rLen)
                {
                    r = rLen;
                    c = 1;
                    up = true;
                }
                else if(c<0)
                {
                    c = 0;
                    r = r;
                    up = true;
                }
                else if(r>rLen)
                {
                    r = rLen;
                    c = c + 2;
                    up = true;
                }

            }
            //if counter==mat len return
            if(counter==ans.length)
            {
                break;
            }
        }
        return ans;
    }
}
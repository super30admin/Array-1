// TC= O(m*n)
// SC= O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;  //rows
        int n= mat[0].length; //cols
        // System.out.println(n);

        int result[]= new int[m*n];
        int dir=1;              //up direction
        int r=0,c=0,idx=0;
        System.out.println(result.length);
        while(idx<result.length){
            System.out.println(idx);
            result[idx]= mat[r][c];
            idx++;

            //up
            if(dir==1){
                if(c==n-1){
                    r++;
                    dir=-1;
                }
                else if(r==0){
                    c++;
                    dir=-1;
                }
                else{
                    r--;c++;
                }
            }

            //down
            else{
                if(r==m-1){
                    c++;
                    dir=1;
                }
                else if(c==0){
                    r++;
                    dir=1;
                }
                else{
                    r++;
                    c--;
                }
            }

        }

        return result;
    }
}
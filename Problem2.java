class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int[] result= new int[m*n];
        int r=0;
        int c=0;
        boolean flag =true; //upward
        for(int i=0;i<result.length;i++){

            result[i]=mat[r][c];
            //get r and c
            if(flag){
                //up
                if(r==0 && c!=n-1){
                    //roof but not right
                    flag=false;
                    c++;
                }
                //right but not roof
                else if(c==n-1){
                    flag=false;
                    r++;

                }
                //basic top roght traversal
                else{
                    r--;
                    c++;
                }
            }
            else{
                //down
                if(c==0 && r!=m-1){
                    //bottom but not left
                    flag=true;
                    r++;
                }
                //left but not bottom
                else if(r==m-1){
                    flag=true;
                    c++;

                }
                //basic bottom left traversal
                else{
                    r++;
                    c--;
                }

            }

        }
        return result;   
    }
}
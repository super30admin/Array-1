public class Problem2 {


    public int[] findDiagonalOrder(int[][] mat) {

        int m= mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int dir = 1;
        //1 bottom to top
        //-1 top to bottom
        int ind=0;
        int r=0,c=0;
        while(ind < m*n){
            res[ind]= mat[r][c];
            ind++;
            if(dir ==1){
                if(c == n-1){
                    dir = -1;
                    r++;
                }else if(r==0){
                    dir = -1;
                    c++;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(r==m-1){
                    dir = 1;
                    c++;
                }else if(c ==0 ){
                    dir =1;
                    r++;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return res;

    }

}

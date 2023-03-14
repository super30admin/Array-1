import java.util.Arrays;

public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int r=0, c=0;
        boolean dir =true;
        int idx = 0;
        while(idx<m*n){
            res[idx] = mat[r][c];
            idx++;
            //if up is true, up case
            if(dir){
                if(r==0 && c!=n-1){
                    c++;
                    dir=false;
                } else if(c==n-1){
                    r++;
                    dir=false;
                } else{
                    r--;
                    c++;
                }
            } else{     //down case
                if(c==0 && r!=m-1){
                    r++;
                    dir=true;
                }else if(r==m-1){
                    c++;
                    dir=true;
                }else{
                    r++;
                    c--;
                }
            }
        }


        return res;
    }

    public static void main(String[] args) {
        FindDiagonalOrder obj = new FindDiagonalOrder();
        int[][] nums= new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int[] res = obj.findDiagonalOrder(nums);
        System.out.println("Res -- " + Arrays.toString(res));
    }
}

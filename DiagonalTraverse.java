import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {
    public static void main(String[] args) {
       int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       findDiagonalOrder(mat);

    }

        public static int[] findDiagonalOrder(int[][] mat) {
            List<Integer> re = new ArrayList<>();
            int row = mat.length;
            int col = mat[0].length;
            int r = 0;
            int c = 0;
            boolean up = true;
            while(r<row && c<col) {
                if (up) {
                    //ceiling row changes direction
                    //col++ row--
                    if (r == 0) {
                        re.add(mat[r][c]);
                        up = !up;
                    } else {
                        c++;
                        r--;
                        re.add(mat[r][c]);
                    }
                    System.out.println(re);
                }
                if(!up){
                    if (c == 0) {
                        re.add(mat[r][c]);
                        up = !up;
                    } else {
                        r++;
                        c--;
                        re.add(mat[r][c]);
                    }
                    System.out.println(re);
                }
            }
            return new int[0];
        }

}

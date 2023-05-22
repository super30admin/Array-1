import java.util.Arrays;

public class DiagonalTraverse {


        public int[] findDiagonalOrder(int[][] mat) {

            int m = mat.length;
            int n = mat[0].length;

            //null case
            if(mat == null || m == 0) return new int[]{};

            // create result array
            int[] result = new int[m*n];

            //
            int i =0;
            int r = 0,c = 0;
            boolean dir = true;

            // iterate till m*n elements covered
            while(i < m*n){

                // result to original matrix conversion
                result[i] = mat[r][c];

                if(dir==true){ // up

                    if(c == n-1){

                        dir = false;
                        r++;
                    }
                    //common mistake if r == 0 is checked before c== n-1
                    else if(r == 0){

                        dir = false;
                        c++;
                    }

                    else{

                        r--;
                        c++;
                    }
                }

                else{ //down

                    if(r == m-1){

                        dir = true;
                        c++;
                    }
                    //common mistake if c == 0 is checked before r == m-1
                    else if(c == 0){

                        dir = true;
                        r++;
                    }

                    else{

                        r++;
                        c--;
                    }
                }

                //iteration of index
                i++;


            }

            return result;
        }

        /* Time Complexity: O(m*n)
        Space Complexity: O(1) */

        public static void main(String[] args){

            DiagonalTraverse object = new DiagonalTraverse();

            int[][] array2DInput = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            int[] diagTraverse = object.findDiagonalOrder(array2DInput);

            System.out.println("Elements of array in diagonal order: " + Arrays.toString(diagTraverse));

        }
}

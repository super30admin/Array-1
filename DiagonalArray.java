public class DiagonalArray {
    public int[] findDiagonalOrder(int[][] mat){
        if(mat == null || mat.length==0){           //base cond to check if array is empty.
            return new int[]{};             //return empty array
        }
        int m = mat.length; //rows in 2D array.
        int n = mat[0].length; //columns in 2D array.
        int dir = 1;                //variable to store direction, as starting from bottom, will be 1 initially. 1 implies bottom to top
//                                        and -1 implies top to bottom.

        int[] result = new int[m * n];      //1D array to store result and return of size m * n
        int r= 0;           //variable to store current row.
        int c= 0;           //variable to store current column.
        int index =0;       //variable to store current index in result array.

        while(index < m*n){
            result[index]= mat[r][c];   //update value for current row and column in result matrix.
            index+=1;  //increment index

            if(dir==1){     //means bottom to top
                if(c== n-1){            //2nd last column
                    dir=-1;
                    r++;
                }
                else if(r==0){      //when reached the top time to change the direction and start traversing back
                    dir=-1;
                    c++;

                }
                else{           //general case while traversing bottom to top
                    c++;
                    r--;
                }
            }
            else{           //means top to bottom
                if(r == m-1){   //2nd last row
                    dir = 1;
                    c++;

                }
                else if(c==0){      //means reached the bottom time to change the direction and start traversing back.
                    dir= 1;
                    r++;
                }
                else{           //general case while traversing top to bottom
                    r++;
                    c--;
                }
            }
        }
        return result;      //return result
    }


    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        DiagonalArray obj = new DiagonalArray();

        int[] result= obj.findDiagonalOrder(mat);

        for (int num : result){
            System.out.println(num);
        }

    }
}

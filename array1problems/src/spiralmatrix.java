import java.util.ArrayList;
import java.util.List;

class spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }
        //initializing arraylist,n,m,top,right,left,bottm.
        List<Integer> output = new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;

        int top=0; int left=0; int right=m-1; int bottom =n-1;

        while(top<=bottom && left<=right){
            //1)Top row
            for(int x=left;x<=right;x++){
                output.add(matrix[top][x]);
            }
            top+=1;
            //2)Rght column
            for(int x=top;x<=bottom;x++){
                output.add(matrix[x][right]);
            }
            right-=1;
            //3)bottom row
            if(top<=bottom){
                for(int x=right;x>=left;x--){
                    output.add(matrix[bottom][x]);
                }
                bottom-=1;
            }

            //4)left column
            if(left<=right){
                for(int x=bottom;x>=top;x--){
                    output.add(matrix[x][left]);
                }
                left+=1;
            }

        }
        return output;

    }
}



//Time complexity = o(n*m)
//space complexity =o(n*m)

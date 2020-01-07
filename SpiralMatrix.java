package Day11;
//TC: O(m*n)
//SC: O(1) since just using result array

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        //Edge case
        if(matrix.length == 0 || matrix == null) return result;

        int m = matrix.length;
        int n = matrix[0].length;

        //4 pointers and their initialization
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;


        while( left <= right && top <= bottom){

            //top row
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //right col
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //bottom row
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left col
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        SpiralMatrix obj =  new SpiralMatrix();

        List<Integer> res = new ArrayList<>();

        res = obj.spiralOrder(matrix);

        Iterator<Integer> itr = res.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }


    }
}

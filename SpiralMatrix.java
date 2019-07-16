/**
 * #Idea: 
 * 1. Take four pointers to track four corners. Top, Bottom, Right and Left.
 * 2. Traversal starts. Move Left -> Right ; Increment Top. Move Top -> Bottom ; Decrement Right. Move Left -> Right ; Decrement Bottom. Move Bottom -> Top; Left --.
 * 3. Check for condition if pointer-pairs cross. Repeat the process for inner elements. Check for crossing condition edge case after two edge traversals. 
 * 
 * # Time Complexity : O(n) - number of elements. (X*Y -> X rows, Y cols)
 * # Space Complexity : O(n) - result List
 */


import java.util.*;
class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        if(matrix.length == 0) return spiral;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        /**
         * L -> R TOP ++
         * T -> B RIGHT --
         * R -> L BOTTOM --
         * B -> T LEFT ++
         * 
         */

        

        while(top <= bottom && left <= right){

            //top row
            for(int i=left;i<=right;i++)
                spiral.add(matrix[top][i]);
            top++; 
           

            //right most row
            for(int i=top;i<=bottom;i++)
                spiral.add(matrix[i][right]);            
            right--;

            //bottom row
            if(bottom >= top){
                for(int i=right;i>=left;i--)
                    spiral.add(matrix[bottom][i]);
            }
            bottom--;

           


            //left row
            if(right >= left){
                for(int i=bottom;i>=top;i--)
                    spiral.add(matrix[i][left]);
            }
          
           
            left++;
        }

       return spiral;
    }
    public static void main(String[] args){
        System.out.println("Spiral Matrix");
        int[][] mat = {
            {1,2,3,11},
            {4,5,6,12},
            {7,8,9,13}
        };

        // int[][] mat = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        SpiralMatrix obj = new SpiralMatrix();
        System.out.println(obj.spiralOrder(mat));
    }
}
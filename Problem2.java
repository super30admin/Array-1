// Time Complexity : O(n*m)
//      n: number of rows
//      m: number of columns
// Space Complexity : O(1)
//      Use the input matrix
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Problem2 {

    /** find diagonal order */
    public int[] findDiagonalOrder(int[][] matrix) {

        // base condition
        if(matrix==null || matrix.length==0)
            return new int[]{};
        
        // initialize
        int n= matrix.length;
        int m= matrix[0].length;
        int row = 0;
        int col = 0;
        boolean directionUp = true;
        int count = 0;
        int maxCount = n * m;
        
        int[] result = new int[maxCount];
        
        // till all the elements are visited
        while(count < maxCount){
            
            // adding to result
            result[count] = matrix[row][col];
            count++;

            // for direction Up
            if(directionUp){
                
                // if reached column Upper bound
                if(col== m-1){
                    row ++;
                    directionUp = false; // changing direction
                } // if reached row lower bound
                else if(row==0){
                    col ++;
                    directionUp = false; // changing direction
                // going up ~ decreasing row & increasing col
                }else{
                    row--;
                    col++;
                }
            // for direction down  
            }else{
                
                // reached row upper bound
                if(row==n-1){
                    col++;
                    directionUp = true; // changing direction
                } // reached col lower bound
                else if(col==0){
                    row++;
                    directionUp = true; // changing direction
                // going down ~ increasing row & decreasing col
                }else{
                    row++;
                    col--;
                }  
            }
            
        }

        // return result
        return result;
    }
}


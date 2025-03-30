// Time Complexity :O(N.M)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english


// class Solution {
//     public int[] findDiagonalOrder(int[][] matrix) {
        
//         // Check for empty matrices
//         if (matrix == null || matrix.length == 0) {
//             return new int[0];
//         }
        
//         // Variables to track the size of the matrix
//         int N = matrix.length;//N=5
//         int M = matrix[0].length;//M=4
        
//         // The two arrays as explained in the algorithm
//         int[] result = new int[N*M];
//         int k = 0;//pointer of diagnol
//         ArrayList<Integer> intermediate = new ArrayList<Integer>();
        
//         // We have to go over all the elements in the first
//         // row and the last column to cover all possible diagonals
//         for (int d = 0; d < N + M - 1; d++) {//d=0,1
            
//             // Clear the intermediate array every time we start
//             // to process another diagonal
//             intermediate.clear();//[]
            
//             // We need to figure out the "head" of this diagonal
//             // The elements in the first row and the last column
//             // are the respective heads.
//             int r = d < M ? 0 : d - M + 1;//r=True, r=0; #2 1<5(true)
//             int c = d < M ? d : M - 1;//c=true, c=d=0;
            
//             // Iterate until one of the indices goes out of scope
//             // Take note of the index math to go down the diagonal
//             while (r < N && c > -1) {//(r=0<5(true)&& c=0>-1(true))=true;(r=1<5(false))=false
                
//                 intermediate.add(matrix[r][c]);//[1]
//                 ++r;//r=1;
//                 --c;//c=0;
//             }
                
//             // Reverse even numbered diagonals. The
//             // article says we have to reverse odd 
//             // numbered articles but here, the numbering
//             // is starting from 0 :P
//             if (d % 2 == 0) {//d=0%2(false)
//                 Collections.reverse(intermediate);//[1]
//             }
            
//             for (int i = 0; i < intermediate.size(); i++) {//i=0->1
//                 result[k++] = intermediate.get(i);//result[0+1]=[1]
//             }
//         }
//         return result;//[1]
//     }
// }//TC:O(N*M)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        // Check for empty matrices
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        // Variables to track the size of the matrix
        int N = matrix.length;//N=5
        int M = matrix[0].length;//M=4
        
        // Incides that will help us progress through 
        // the matrix, one element at a time.
        int row = 0, column = 0;//row=0;column=0
        
        // As explained in the article, this is the variable
        // that helps us keep track of what direction we are
        // processing the current diagonal
        int direction = 1;//direction=1
        
         // The final result array
        int[] result = new int[N*M];//result[]
        int r = 0;//r=0
        
        // The uber while loop which will help us iterate over all
        // the elements in the array.
        while (row < N && column < M) {//(row=0<5 && col<4)=true
            
            // First and foremost, add the current element to 
            // the result matrix. 
            result[r++] = matrix[row][column];//result[0++=0] = matrix=[0][0]=1
            
            // Move along in the current diagonal depending upon
            // the current direction.[i, j] -> [i - 1, j + 1] if 
            // going up and [i, j] -> [i + 1][j - 1] if going down.
            int new_row = row + (direction == 1 ? -1 : 1);//new_row= row + (-1)=0-1=-1
            int new_column = column + (direction == 1 ? 1 : -1);//new_column= col + (1)=0+1=1
            
            // Checking if the next element in the diagonal is within the
            // bounds of the matrix or not. If it's not within the bounds,
            // we have to find the next head. 
            if (new_row < 0 || new_row == N || new_column < 0 || new_column == M) {//true
                
                // If the current diagonal was going in the upwards
                // direction.
                if (direction == 1) {//true
                    
                    // For an upwards going diagonal having [i, j] as its tail
                    // If [i, j + 1] is within bounds, then it becomes
                    // the next head. Otherwise, the element directly below
                    // i.e. the element [i + 1, j] becomes the next head
                    row += (column == M - 1 ? 1 : 0) ;//row = row + (3=false)=0=row
                    column += (column < M - 1 ? 1 : 0);//column = (column + (column<3=true=1)) =column+1
                        
                } else {
                    
                    // For a downwards going diagonal having [i, j] as its tail
                    // if [i + 1, j] is within bounds, then it becomes
                    // the next head. Otherwise, the element directly below
                    // i.e. the element [i, j + 1] becomes the next head
                    column += (row == N - 1 ? 1 : 0);
                    row += (row < N - 1 ? 1 : 0);
                }
                    
                // Flip the direction
                direction = 1 - direction;        
                        
            } else {
                
                row = new_row;
                column = new_column;
            }
        }
        return result;      
    }
}
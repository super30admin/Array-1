// Time Complexity : O(N*M), where N rows and M columns
// Space Complexity : O(K), where K is size of array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
    // two for loops based on starting point: first set of set of starting points across row 0, second set across last column
    // iterate diagonally or reverse-diagonally

// Your code here along with comments explaining your approach
class DiagonalTraverseSolution {

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; // number of rows
        int n = mat[0].length; // number of cols
        
        int[] result = new int[m*n];
        
        boolean reverse = true; // bool variable to keep track if elements needs to be placed in switch order
        int start = 0;
        result[start] = mat[0][0];
        int tmpStart = 0;
        boolean lastIsReverse = false;
        
        // edge case: 1 element only
        if (n==1 && m==1){
            return result;
        }
    
        // edge case: 1 row
        if (m == 1 && n > 1){
            for (int i = 1; i < n; i++){
                start++;
                result[start] = mat[0][i];
            }
            return result;
        }
        
        // edge case: 1 col
        if (n == 1 && m > 1){
            for (int i = 1; i < m; i++){
                start++;
                result[start] = mat[i][0];
            }
            return result;
        }
        
        for (int i = 1; i < n; i++){ // first set of diagonals; anchors starting point of every col (starting index 1) in first row
            // whatever reverse was last time, switch
            if (reverse == true){
               reverse = false;
            }
            else{
                reverse = true;
            }
            
            int col = i;
            int j = 0; // row
            
            if (reverse == false){
                if (lastIsReverse == true){
                    start = tmpStart + 1;
                }
                else{
                    start++;
                }
                lastIsReverse = false;
                result[start] = mat[j][col]; // add starting point element   
                while (col-1 >= 0 && j+1 < m){ // ensure not out of bounds
                    start++;
                    col -= 1;
                    j += 1;
                    result[start] = mat[j][col];
                }
            }
            else{ // reverse == true
                lastIsReverse = true;
                start++;
                int count = 0;
                while (col-1 >= 0 && j+1 < m){ // ensure not out of bounds
                    col -= 1;
                    j += 1;
                    count++;
                }
                
                col = i;
                j = 0;
                start = start + count;
                tmpStart = start;
                result[start] = mat[j][col]; // add starting point element   
                while (col-1 >= 0 && j+1 < m){ // ensure not out of bounds
                    start--;
                    col -= 1;
                    j += 1;
                    result[start] = mat[j][col];
                }
            }
        }
        for (int r = 1; r < m; r++){ // sec set of diagonals; anchors starting point of every row (starting index 1) in last column 
            // whatever reverse was last time, switch
            if (reverse == true){
               reverse = false;
            }
            else{
                reverse = true;
            }
            int row = r;
            int c = n - 1; // col
            
            if (reverse == false){
                if (lastIsReverse == true){
                    start = tmpStart + 1;
                }
                else{
                    start++;
                }
                lastIsReverse = false;
                result[start] = mat[row][c]; // add starting point element
                while (c-1 >= 0 && row+1 < m){
                    start++;
                    row += 1;
                    c -= 1;
                    result[start] = mat[row][c];
                }
            }
            else{ // reverse = true
                if (lastIsReverse == true){
                    start = tmpStart + 1; // only in cases where last checked was in reverse order
                }
                else{
                    start++;
                }
                lastIsReverse = true;
                
                int count = 0;
                while (c-1 >= 0 && row+1 < m){ // ensure not out of bounds
                    c -= 1;
                    row += 1;
                    count++;
                }
                
                row = r;
                c = n - 1;
                start = start + count;
                tmpStart = start;
                if (count == 0 ){ // last item in matrix
                    result[start] = mat[row][c];
                }
                
                result[start] = mat[row][c]; // add starting point element   
                while (c-1 >= 0 && row+1 < m){
                    start--;
                    row += 1;
                    c -= 1;
                    result[start] = mat[row][c]; // out of bounds whyyyyyyy???????
                }
            }
        }
        
        
        return result;
    }
}
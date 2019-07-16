class TraverseDiagonalMatrix {
    public void traverseMatrix(int[][] mat, int n){
        int i = 0, j = 0; 
  
        // Direction is initially from down to up 
        boolean isUp = true; 
        int[][] dagMatrix = new int[mat.length][mat[0].length];
        
        // To do n*m matrices
        // Traverse the matrix till all elements get traversed 
        for (int k = 0; k < n * n;) { 
            // If isUp = true then traverse from downward 
            // to upward 
            if (isUp) { 
                for (; i >= 0 && j < n; j++, i--) { 
                    // System.out.print(mat[i][j] + " "); 
                    dagMatrix[i][j] = mat[i][j];
                    k++; 
                } 
  
                // Set i and j according to direction 
                if (i < 0 && j <= n - 1) 
                    i = 0; 
                if (j == n) { 
                    i = i + 2; 
                    j--; 
                } 
            } 
  
            // If isUp = 0 then traverse up to down 
            else { 
                for (; j >= 0 && i < n; i++, j--) { 
                    // System.out.print(mat[i][j] + " "); 
                    dagMatrix[i][j] = mat[i][j];
                    k++; 
                } 
  
                // Set i and j according to direction 
                if (j < 0 && i <= n - 1) 
                    j = 0; 
                if (i == n) { 
                    j = j + 2; 
                    i--; 
                } 
            } 
  
            // Revert the isUp to change the direction 
            isUp = !isUp; 
        }
    }
    public static void main(String[] args){
        System.out.println("TraverseDiagonalMatrix");
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        TraverseDiagonalMatrix obj = new TraverseDiagonalMatrix();
        obj.traverseMatrix(mat, mat.length);
    }
}
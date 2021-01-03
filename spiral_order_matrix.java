class Solution {
       public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> spiral = new ArrayList<Integer>();
        int m = matrix.length;
        if(m==0)
            return spiral;
        int n = matrix[0].length;
        int i, j=0, k=0; 
        while(j<m && k<n)
        {
            // Adding row elements
            for(i=k; i<n; i++)
                spiral.add(matrix[j][i]);
            j++; // Updating row so that next time next row elements are added
            
            // Adding column elements
            for(i=j; i<m; i++)
                spiral.add(matrix[i][n-1]);
            n--; // Decrementing column so next time previous column elemnts are accessed
            
            // If we haven't reached the last row yet
            if(j<m)
            {
                // Adding last row elements from last column to first column
                for(i=n-1; i>=k; i--)
                    spiral.add(matrix[m-1][i]);
                m--; // Changing the length of matrix i.e., removing the last row 
            }
            
            if(k<n)
            {
                //Adding the column elements from last row row to updated initial row
                for(i=m-1; i>=j; i--)
                    spiral.add(matrix[i][k]);
                k++; // Saying that current column elemts are done adding in output, so incrementing column
            }
        }
        return spiral;
    }
}

// TC- O(mn)
// SC- O(1)- Since no additional memory is used
/* Logic
- We define the logic to complete one spiral round in the matrix and keep iterating it till
all the elements are accessed. */

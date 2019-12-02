Time Complexity=O(m*n)
Space Complexity-O(1)
public int[] findDiagonalOrder(int[][] matrix) {
if (matrix == null || matrix.length == 0) return new int[0];

int r = 0, c = 0, i = 0, m = matrix.length, n=matrix[0].length, result [] = new int[m * n];

for (i = 0; i < m * n; i++) {
    result[i] = matrix[r][c];

    if ((r + c) % 2 == 0) {
        
        if (c == n-1) 
        {
            r++;
        }
        else if (r == 0) 
        {
            c++; 
        }
        else 
        {
            r--;
            c++;
        }

    } else {
        
        if (r == m-1) 
        {
            c++;
        } 

        else if (c == 0) 
        {
            r++; 
        }
        
        else 
        {
            r++;
            c--;
        }
    }
    
}
    return result;
}

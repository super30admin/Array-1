"""
The approach with the comments. Solution from GeeksforGeeks
"""
def spiralPrint(m, n, a) : 
    k = 0; l = 0
  
    while (k < m and l < n) : 
          
        # For the first row
        for i in range(l, n) : 
            print(a[k][i], end = " ") 
              
        k += 1
  
        # For the last column
        for i in range(k, m) : 
            print(a[i][n - 1], end = " ") 
              
        n -= 1
  
        # For the last row 
        if ( k < m) : 
              
            for i in range(n - 1, (l - 1), -1) : 
                print(a[m - 1][i], end = " ") 
              
            m -= 1
          
        # For the first column from remaning
        if (l < n) : 
            for i in range(m - 1, k - 1, -1) : 
                print(a[i][l], end = " ") 
              
            l += 1

        # Continue this until you terminate the while condition.
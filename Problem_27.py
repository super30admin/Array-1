
def printMatrixDiagonal(mat, n):
    
    i = 0
    j = 0
    k = 0
   
    isUp = True
 
    
    while k<n * n:
        
        if isUp:
            while i >= 0 and j<n :
                print(str(mat[i][j]), end = " ")
                k += 1
                j += 1
                i -= 1
 
             
            if i < 0 and j <= n - 1:
                i = 0
            if j == n:
                i = i + 2
                j -= 1
 
        
        else:
            while j >= 0 and i<n :
                print(mat[i][j], end = " ")
                k += 1
                i += 1
                j -= 1
 
              
            if j < 0 and i <= n - 1:
                j = 0
            if i == n:
                j = j + 2
                i -= 1
 
        
        isUp = not isUp
 

if __name__ == "__main__":
    mat = [[1, 2, 3],
        [4, 5, 6],
        [7, 8, 9] ]
 
   n = 3
   printMatrixDiagonal(mat, n)
 

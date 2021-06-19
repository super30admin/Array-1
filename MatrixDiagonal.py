def PrintDiagonal(arr):
    m = len(arr[0])
    n = len(arr)
    print(m,n)
    
    for i in range(0, n):
        k = 0
        l = i
        while(l >= 0):
            print(arr[l][k])
            l = l-1
            k = k+1
            
    for j in range(1, m):
        col = j
        row = n-1
        while(col <= m-1 and row>= 0):
            print(arr[row][col])
            row = row - 1
            col = col + 1
            
            
PrintDiagonal([["a","b","c","d","e"],["f","g","h","i","j"],["k","l","m","n","o"],["p","q","r","s","t"]])
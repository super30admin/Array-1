'''
1. We have 4 variables top, bottom, left, right keeping the boundaries of our traversal
2. We start off traversing in the order of right, down, left and up using 4 for loops modifying the boundaries.
3. We append each value encountered and return the final list. We perform a check to prevent left going ahead of right and bottom going above top.  

TC: O(n)
SC: O(n)
'''

def spiralOrder(mat):

    if len(mat) == 0:
        return []

    m,n = len(mat), len(mat[0])

    top, bottom, left, right = 0, m-1, 0, n-1
    result = []

    while m*n > len(result):
        for  i in range(left,right+1):
            result.append(mat[top][i])
        
        top += 1

        for i in range(top,bottom+1):
            result.append(mat[i][right])
        
        right -= 1

        if top<=bottom:
            for i in range(right,left-1,-1):
                result.append(mat[bottom][i])
            
            bottom -=1
        
        if left<=right:
            for i in range(bottom,top-1,-1):
                result.append(mat[i][left])
            
            left += 1
    
    return result
        

        
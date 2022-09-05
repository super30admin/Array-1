# Time Complexity : O(m * n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
def spiralOrder(matrix):
    m = len(matrix)
    n = len(matrix[0])
    left, right = 0, n-1
    bottom, top =m-1, 0
    result = []
    while left <= right and top <= bottom:
        #top row
        for i in range(left,right+1):
            result.append(matrix[top][i])
        top += 1
        
        #if left < right and top < bottom:
        #right wall
        for i in range(top,bottom+1):
            result.append(matrix[i][right])
        right -= 1 
        
        if top <= bottom:
            
        #bottom wall
            for i in range(right,left-1,-1):
                result.append(matrix[bottom][i])
        bottom -= 1
        
        if left <=right:
        #left wall
            for i in range(bottom,top-1,-1):
                result.append(matrix[i][left])
        left += 1
    return result

matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(spiralOrder(matrix))
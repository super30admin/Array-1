# <!-- ## Problem 3
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

# Example 1:

# Input:

# [

# [ 1, 2, 3 ],

# [ 4, 5, 6 ],

# [ 7, 8, 9 ]

# ]
# Output: [1,2,3,6,9,8,7,4,5]
# Example 2:

# Input:

# [

# [1, 2, 3, 4],

# [5, 6, 7, 8],

# [9,10,11,12]

# ]
# Output: [1,2,3,4,8,12,11,10,9,5,6,7] -->

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        top = 0
        left = 0
        right = len(matrix[0])-1
        bottom = len(matrix)-1
        while left<=right and top<=bottom:
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top = top+1
            if left<=right:
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                right = right-1
            if top<=bottom:
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom = bottom -1
            if left<=right:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left = left+1
        return result
    
    # <!-- #Time Complexity: O(n)
    # #Space Complexity: O(1)
    # #Approach: take four pointers - left,right,top,bottom. left right - represents column values. top bottom - represent row values. iterate the matrix starting from 0,0 till the end ensuring the pointers dont go out of bounds.  -->
    

        
# ## Problem 3
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
# Output: [1,2,3,4,8,12,11,10,9,5,6,7]

#Solution -> 

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
    
        def right(r, c, rStep, cStep):
            if cStep==0: return
            for i in range(c, c+cStep):
                ans.append(matrix[r][i])
            # print(ans)
            down(r+1, c+cStep-1, rStep-1, cStep)

        def down(r, c, rStep, cStep):
            if rStep==0: return
            for i in range(r, r+rStep):
                ans.append(matrix[i][c])
            # print(ans)
            left(r+rStep-1, c-1, rStep-1, cStep-1)

        def left(r, c, rStep, cStep):
            if cStep==0: return
            for i in range(c, c-cStep, -1):
                ans.append(matrix[r][i])
            # print(ans)
            up(r-1, c-cStep+1, rStep, cStep-1)

        def up(r, c, rStep, cStep):
            if rStep==0: return
            for i in range(r, r-rStep, -1):
                ans.append(matrix[i][c])
            # print(ans)
            right(r-rStep+1, c+1, rStep, cStep)
            
        ans = []
        m, n = len(matrix), len(matrix[0])
        right(0, 0, m, n)
        return ans
    
# Time Complexity -> o(m*n)
# Space Complexity -> o(1)




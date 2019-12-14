# Time Complexity : O(M * N)
# Space Complexity : O(M * N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : Logic

class Solution:
    def findDiagonalOrder(self, matrix):
        if (matrix == [] or len(matrix) == 0):
            return []
        
        m = len(matrix)
        n = len(matrix[0])

        i = 0; r = 0; c = 0
        direction = 1
        result = []
        
        while i < m*n:
            result.append(matrix[r][c])       # entering the traversed value to the resultant list
            if direction == 1:
                if c == n -1:              # at last column
                    r = r + 1
                    direction = -1
                elif r == 0:                   # at First row
                    c = c + 1
                    direction = -1
                else:
                    r = r - 1
                    c = c + 1
                
            else:
                if r == m-1:                # at Last row
                    c = c + 1
                    direction = 1
                elif c == 0:                   # at First column
                    r = r + 1
                    direction = 1
                else:
                    r = r + 1
                    c = c - 1

            i += 1
        return result
        


matrix = [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

output = Solution()
print(output.findDiagonalOrder(matrix))

        
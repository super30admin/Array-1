# Problem 2: Diagonal Traverse https://leetcode.com/problems/diagonal-traverse/

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Explanation:
    # - We can traverse the matrix diagonally by iterating through each diagonal starting from the top row and then the last column.
    # - We maintain a direction flag to switch between moving down and moving up the diagonals.
    # - We collect the elements in a result list as we traverse the diagonals.

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat) == 0:
            return []
        m = len(mat) # rows
        n = len(mat[0]) # cols
        result = [0 for i in range(m*n)] 
        index = 0 # for result array
        r = c = 0
        flag = 1

        while index < m*n:
            result[index] = mat[r][c]
            index = index + 1

            # upwards direction
            if flag == 1:
                if c == n-1:
                    r = r + 1
                    flag = 0
                elif r == 0:
                    c = c +1
                    flag = 0
                else:
                    c = c+1
                    r = r -1
            # downwards direction
            else:
                if r == m-1:
                    c = c + 1
                    flag = 1
                elif c ==0:
                    r=r+1
                    flag = 1
                else:
                    r=r+1
                    c=c-1
        return result    

#Time Complexity O(MN) Traversing Matrix elements
#Space Complexity Maximum of M or N that much calls 
#It successfully runs on leetcode

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        visited=set()
        def helper(row,col,goingUp):
            if row < len(matrix) and row >= 0 and col >= 0 and col < len(matrix[0]) and (row,col) not in visited:
                visited.add((row,col))
                res.append(matrix[row][col])

                if goingUp:
                    helper(row-1,col,True)

                helper(row, col+1, False)
                helper(row+1, col, False)
                helper(row, col-1, False)
                helper(row-1, col, True)
        helper(0,0,False)
        return res

# Leetcode problem link : https://leetcode.com/problems/diagonal-traverse/
# Time Complexity : O(m * n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Solution approach => Maintain a direction variable which acts as a flag whether we need to traverse upwards or downwards.
        1. We will change the direction when we reach the boundary conditions i.e. first row, first column, last row, last column.
        2. Direction from up to down changes: In the same row next column for first row OR same column next row for last column
        3. Direction from down to up changes when same column next row for first column or same row next column for last row
        4. Upwards traversal is going to row - 1 and col + 1
        5. Downwards traversal is col - 1 and row + 1
 '''

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0 or len(matrix[0]) == 0:
            return []
        dir = 1
        m = len(matrix[0])
        n = len(matrix)
        output = []
        
        index = 0
        i,j = 0,0
        while index < n*m:
            output.append(matrix[i][j])
            index += 1
            # direction is up
            if dir == 1:
                # last column -> change row and change direction
                if(j == m - 1):
                    i +=1
                    dir = -1
                # reached first row so change column in the same row
                elif i == 0:
                    j += 1
                    dir = -1
                # else keep traversing normally in the diagonal upwards wthout changing direction
                else:
                    j += 1
                    i -= 1
                    
            # direction is down
            else:
                 # last row -> change column and change direction
                if(i == n - 1):
                    j +=1
                    dir = 1
                # reached first column so change row in the same column
                elif j == 0:
                    i += 1
                    dir = 1
                # else keep traversing normally in the diagonal downwards wthout changing direction
                else:
                    j -= 1
                    i += 1
        return output
        
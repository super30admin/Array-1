"""
Runtime Complexity:
O(m*n) - because there are 'm' rows and 'n' column of elements we need to traverse.
Space Complexity:
O(1) - since we just return the array it's constant.
Yes, the code worked on leetcode.
The idea behind the algorithm is to create a result array of dimensions m*n. We have 2 cases, direction=1 goes in upward direction whereas 
direction = -1 traverse the element diagonally in downward manner. We update the row and column respectively with respective direction of traversal.
"""


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        
        if len(mat)==0:
            return result
        m = len(mat)
        n = len(mat[0])
        row = 0
        col = 0
        index = 0
        direction = 1
        dimensions = (m*n)
        result = [0 for i in range(dimensions)]
        
        while index < (m*n):
            result[index] = mat[row][col]
            index+=1
            
            if direction ==1:       #if the direction is upwards
                if col == n-1:
                    direction = -1
                    row+=1
                
                elif row ==0:
                    direction = -1
                    col+=1
                
                else:
                    row-=1
                    col+=1
            else:                   #if the direction is downwards
                if row == m-1:
                    direction = 1
                    col+=1
                
                elif col ==0:
                    direction = 1
                    row+=1
                
                else:
                    row+=1
                    col-=1
        return result
        
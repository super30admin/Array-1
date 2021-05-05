"""
Intuition:  2 types of traversal are happening
1) Vertical & horizontal
2) Diagonal 

Vertical & horizontal traversal are only happening at the edges.
Diagonal traversal is hapenning everywhere else.
#####################################################################
Time Complexity : O(M* N)  where M*N = total elements
Space Complexity : O(1) 
#####################################################################
"""

class Solution:
    def findDiagonalOrder(self, nums: List[List[int]]) -> List[int]:

        result = []
        
        index = 0
        rows = len(nums)
        cols = len(nums[0])
        totalElements = rows * cols
        i, j = 0,0
        goingDown = False
        while index  < totalElements:
            
            num = nums[i][j]
            result.append(num)
            index += 1
            
            if goingDown:
                if j == 0 or i == rows-1 :
                    goingDown = False
                    if i == rows -1 :
                        j += 1
                    else:
                        i += 1
                else:
                    i += 1
                    j -= 1
                        
            else:
                if i == 0 or j == cols-1 :
                    goingDown = True
                    if j == cols -1 :
                        i += 1
                    else:
                        j += 1
                else:
                    j += 1
                    i -= 1
            print(i,j)
        return result
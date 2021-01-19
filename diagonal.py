# Time Complexity : O(n)
# Space Complexity : O(10)
# Did this code successfully run on Leetcode : Yes 
# Three line explanation of solution in plain english:
# Keeping a variable for determining the direction, we can go diagonally up
# and down. We then handle the conditions where i and j can go out of bounds.

# Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        i = 0
        j = 0
        x = len(matrix)-1
        if x == -1: return []
        y = len(matrix[0])-1
        upwards = True
        total = (x+1)*(y+1)
        result = [0 for x in range(total)]
        count = 0
        while count < total:
            result[count] = matrix[i][j]
            count+=1
            if upwards:
                if j == y:
                    i+=1
                    upwards = False
                elif i==0:
                    j+=1
                    upwards = False
                else:
                    i-=1
                    j+=1
            else:
                if i == x:
                    j+=1
                    upwards = True
                elif j == 0:
                    i+=1
                    upwards = True
                else:
                    i+=1
                    j-=1
        return result
# // Time Complexity : O(N)
# // Space Complexity : O(1) since its a auxilary array
# // Did this code successfully run on Leetcode : Yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        r,c = len(mat),len(mat[0])
        direction = 1
        i ,j = 0,0
        while(len(result)< r*c):
            result.append(mat[i][j])
            if direction == 1:
                if i == 0 and j != c-1:
                    j +=1
                    direction = -1
                elif j == c-1:
                    direction = -1
                    i+=1
                else:
                    i -= 1
                    j += 1
            elif direction == -1:
                if j == 0 and i != r-1:
                    direction = 1
                    i += 1
                elif i == r-1:
                    direction = 1
                    j += 1
                else:
                    i += 1
                    j -= 1
        return result
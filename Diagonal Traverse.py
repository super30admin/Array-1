#TC:O(m*n), where m and n are row and column of the matrix
#SC:O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        ans = [ ]
        r, c = 0, 0
        direction = 'UP'
        while(len(ans) != len(mat[0]) * len(mat)):
            ans.append(mat[r][c])
            #UP
            if direction == 'UP':
                if c == len(mat[0]) - 1:
                    r += 1
                    direction = 'DOWN'
                elif r == 0:        
                    c += 1
                    direction = 'DOWN'
                
                else:
                    r -= 1
                    c += 1
            #Down
            else:
                if r== len(mat) - 1:
                    c += 1
                    direction = 'UP'
                elif c == 0:
                    r += 1
                    direction = 'UP'
                else:
                    r +=1
                    c -=1
        return ans
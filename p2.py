#Tc = o(m*n)
#SC = O(1)
#successfully submitted on leetcode; yes



class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        ans = []
        direction = 1
        row_size = len(mat)
        col_size = len(mat[0])
        
        r = 0
        c = 0
       

        for i in range(0, row_size * col_size):
            ans.append(mat[r][c])
            #up pass, direction = 1
            if direction == 1:
                #right most
                if c == col_size - 1:
                    r += 1
                    direction = -1
                #hit top
                elif r == 0:
                    c += 1
                    direction = -1
                #general case
                else:
                    r -= 1
                    c += 1
            elif direction == -1:
                #bottom & left most 
                if r == row_size - 1:
                    c += 1
                    direction = 1
                #hit left but not bottom
                elif c == 0:
                    r +=1
                    direction = 1
                else:
                    r += 1
                    c -= 1
        return ans



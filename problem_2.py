# Time Complexity - O(mn)
# Space Complexity - O(1)



class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        r = 0
        c = 0 
        result = []
        m = len(mat)
        n = len(mat[0])

        direction = True

        for i in range(m * n):
            result.append(mat[r][c])

            if direction :
                
                if r== 0 and c!= n-1 :
                    direction = False
                    c+= 1 
                elif c == n-1 :
                    direction = False
                    r+= 1 
                else :
                    r -= 1 
                    c+= 1 

            else :
                if c== 0 and r!= m-1 :
                    direction = True
                    r+= 1 
                elif r == m-1 :
                    direction = True
                    c+= 1 
                else :
                    c -= 1
                    r+= 1 

        return result

        

        
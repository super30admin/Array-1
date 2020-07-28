class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        r = 0
        m = len(matrix)
        n = len(matrix[0])
        result = [0 for i in range(m * n)]
        c = 0
        direction = 1
        i = 0
        while i < (m * n):
            result[i] = matrix[r][c]

            if direction == 1:
                if c == n-1:
                    r+=1
                    direction = -1

                elif r == 0:
                    c+=1
                    direction = -1
                else:
                    r-=1
                    c+=1

            else:
                if r == m -1:
                    c+=1
                    direction = 1
                elif c == 0:
                    r+=1
                    direction = 1
                else:
                    r+=1
                    c-=1

            i+=1
        return result


        

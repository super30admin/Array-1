class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix: 
            return []

        m = len(matrix)
        n = len(matrix[0])
        arr = [0] * (m * n)
        j = 0 
        # right. down. left. up. 
        directions = [[0,1],[1,0],[0,-1],[-1,0]]
        dr = 0 
        visit = set()
        r = c = 0 

        while j != len(arr): 
            arr[j] = matrix[r][c]
            visit.add((r,c))
            j += 1 

            di, dj = directions[dr]
            ni, nj = r + di, c + dj 

            if 0 <= ni < m and 0 <= nj < n and (ni,nj) not in visit:
                r,c = ni,nj 
            else: 
                dr = (dr + 1) % 4 
                di,dj = directions[dr]
                r += di
                c += dj 

        return arr 




            




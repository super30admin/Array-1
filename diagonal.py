class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        
        m, n = len(mat), len(mat[0])
        r, c = 0, 0
        direction = 1
        result = []

        while len(result) < m * n:
            result.append(mat[r][c])

            new_r = r + (-1 if direction == 1 else 1)
            new_c = c + (1 if direction == 1 else -1)

          
            if new_r < 0 or new_r == m or new_c < 0 or new_c == n:
                
                if direction:  # Upward direction
                    r += (c == n - 1)
                    c += (c < n - 1)
                    
                else:  # Downward direction
                    c += (r == m - 1)
                    r += (r < m - 1)

                direction = 1 - direction
            else:
                r = new_r
                c = new_c

        return result

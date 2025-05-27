"""
Go through all diagonals (i + j == d where d -> 0 to m + n - 2).
For each diagonal, collect elements either from bottom to top (when d is even) or top to bottom (when d is odd).
Keep appending them to the result in that diagonal order.
"""
"""
Time Complexity : O(M * N) - All elements visited once
Space Complexity : O(1) if not counting the output, space is constant.
"""

class diagonals:
    def findDiagonalOrder(self,mat):
        if not mat or not mat[0]:
            return []

        m, n = len(mat), len(mat[0])
        result = []
        
        for d in range(m + n - 1):
            intermediate = []
            
            r = 0 if d < n else d - n + 1
            c = d if d < n else n - 1
            
            while r < m and c >= 0:
                intermediate.append(mat[r][c])
                r += 1
                c -= 1

            if d % 2 == 0:
                result.extend(intermediate[::-1])
            else:
                result.extend(intermediate)
        
        return result
    
if __name__=="__main__":
    obj = diagonals()
    matrix = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
    print(obj.findDiagonalOrder(matrix))

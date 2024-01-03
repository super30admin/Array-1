#time complexity : O(m * n)
#space complexity:  O(m * n)

class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        if not mat or not mat[0]:
            return []
        
        m = len(mat)
        n = len(mat[0])

        result = []
        row,col = 0,0
        dir_up = True

        while len(result) != m * n:
            if dir_up: 
                while row >= 0 and col < n:
                    result.append(mat[row][col])

                    row -= 1
                    col += 1
                if col == n:
                    col -= 1
                    row += 2
                else:
                    row +=1
                dir_up = False
            else:
                while col >= 0 and row < m:
                    result.append(mat[row][col])

                    col -= 1
                    row += 1
                if row == m:
                    row -= 1
                    col += 2
                else:
                    col +=1
                dir_up = True
            
        return result

sol = Solution()
mat1 = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
result1 = sol.findDiagonalOrder(mat1)
print(f"Diagonal Order for matrix:\n{mat1}\nResult: {result1}")
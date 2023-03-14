# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        ans = []
        row = 0
        col = 0
        visited = 0
        hori = 1
        vert = 1
        while visited < (m * n):

            # Direction change check
            if hori * vert > 0:
                if col + hori < 0 or col + hori >= n or matrix[row][col + hori] == None:
                    hori *= -1
            else:
                if row + vert < 0 or row + vert >= m or matrix[row + vert][col] == None:
                    vert *= -1

            # Base condition add
            ans.append(matrix[row][col])
            print(ans)
            visited += 1
            matrix[row][col] = None

            # Update index
            if hori * vert > 0:
                col += hori
            else:
                row += vert

        return ans

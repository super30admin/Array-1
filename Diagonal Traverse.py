# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        Upar = True  # Direction flag
        row = 0
        col = 0
        m = len(matrix)
        n = len(matrix[0])
        ans = []

        while row < m and col < n:
            # print(Upar)
            if Upar:
                # print(row, col)
                ans.append(matrix[row][col])
                if row == 0 or col == n - 1:
                    if col < n - 1:
                        col += 1
                        Upar = False
                    else:
                        row += 1
                        Upar = False
                else:
                    row -= 1
                    col += 1


            else:
                # print(row, col)
                ans.append(matrix[row][col])
                if col == 0 or row == m - 1:
                    # print("here")
                    if row < m - 1:
                        row += 1
                        Upar = True
                    else:
                        # print("here2")
                        col += 1
                        Upar = True
                else:
                    row += 1
                    col -= 1

        return ans


# Time: O(MN)
# TIme: O(MN)

class Solution:
    def findDiagonalOrder(self, matrix):
        print(matrix)
        if not matrix: return []
        if len(matrix) == 1: return matrix[0]
        if len(matrix[0]) == 1: return [matrix[i][0] for i in range(len(matrix))]
        rows = len(matrix) - 1
        cols = len(matrix[0]) - 1
        up = True
        i, j = 0, 0
        result = []
        visited = set()
        while 0 <= i <= rows and j >= 0 and j <= cols:

            result.append(matrix[i][j])
            visited.add(matrix[i][j])

            if up:
                if i == 0 and j == cols:
                    up = False
                    i += 1
                elif i == 0:
                    up = False
                    j += 1
                elif j == cols:
                    up = False
                    i += 1
                else:
                    i -= 1
                    j += 1

            else:
                if i == rows and j == 0:
                    if matrix[i-1][j+1] in visited:
                        j += 1
                    else:
                        i -= 1
                        j += 1
                    up = True
                elif i == rows:
                    up = True
                    j += 1
                elif j == 0:
                    up = True
                    i += 1
                else:
                    i += 1
                    j -= 1
        return result





if __name__ == "__main__":
    print(Solution().findDiagonalOrder([[1,2,3], [4,5,6], [7,8,9]]))
    print(Solution().findDiagonalOrder([[1,2], [3,4]])) 
    print(Solution().findDiagonalOrder([[3], [4]]))
    print(Solution().findDiagonalOrder([[1]]))
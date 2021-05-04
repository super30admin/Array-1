from typing import List
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None or len(mat) == 0: return None
        column = len(mat[0])
        row = len(mat)
        result = [0 for _ in range(column * row)]

        dir, rowindex, columnindex, resultindex = 1, 0, 0, 0
        while (resultindex < column * row):
            result[resultindex]=mat[rowindex][columnindex]
            if dir == 1:  # Upcase
                if columnindex == column - 1:
                    rowindex += 1
                    dir = -1
                elif rowindex == 0:
                    columnindex += 1
                    dir = -1
                else:
                    rowindex -= 1
                    columnindex += 1
            else:
                if  rowindex == row - 1:
                    columnindex += 1
                    dir = 1
                elif columnindex == 0:
                    rowindex += 1
                    dir = 1
                else:
                    rowindex += 1
                    columnindex -= 1
            resultindex += 1
        return result

# Space:- O(1)
# Time:-O(m*n)~~ liner


if __name__ == '__main__':
    print(Solution().findDiagonalOrder( [[1,2,3],[4,5,6],[7,8,9]]))


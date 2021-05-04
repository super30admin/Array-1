from typing import List
class Solution:
    def spiralOrder(self, mat: List[List[int]]) -> List[int]:
        if mat is None or len(mat) == 0: return None
        column = len(mat[0])
        row = len(mat)
        result = [0 for _ in range(column * row)]

        dir, rowindex, columnindex, resultindex, ucindex, lcindex, urindex, lrindex = 1, 0, 0, 0, column - 1, 0, row - 1, 0

        while (resultindex < column * row):
            result[resultindex] = mat[rowindex][columnindex]
            if dir == 1:  # right
                if columnindex == ucindex:
                    ucindex -= 1
                    lrindex += 1
                    dir = 2
                    rowindex += 1
                else:
                    columnindex += 1
            elif dir == 2:  # low
                if rowindex == urindex:
                    urindex -= 1
                    dir = 3
                    columnindex -= 1
                else:
                    rowindex += 1
            elif dir == 3:  # left
                if columnindex == lcindex:
                    dir = 4
                    rowindex -= 1
                    lcindex -= 1
                else:
                    columnindex -= 1
            elif dir == 4:  # UP
                if rowindex == urindex:
                    dir = 1
                    columnindex += 1
                else:
                    rowindex -= 1
            resultindex += 1
        return result

# Space:- O(1)
# Time:-O(m*n)~~ liner


if __name__ == '__main__':
    print(Solution().spiralOrder( [[1,2,3,4],[5,6,7,8],[9,10,11,12]]))


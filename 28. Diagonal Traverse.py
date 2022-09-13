# Time Complexity: O(mxn)
# Space Complexity: O(mxn)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat) == 0 or mat is None:
            return -1
        r = len(mat)
        c = len(mat[0])
        result = []
        index = 0
        flag = 1
        row, column = 0, 0
        while(index<(r*c)):
            result.append(mat[row][column])
            index += 1
            
            # up
            if flag == 1:
                if column == c-1:
                    row += 1
                    flag = -1
                elif row == 0:
                    column +=1
                    flag = -1
                else:
                    row -= 1
                    column += 1
            
            # down
            else:
                if row == r-1:
                    column += 1
                    flag = 1
                elif column == 0:
                    row +=1
                    flag = 1
                else:
                    row += 1
                    column -= 1
        print(result)
        return result
class Solution:
    def findDiagonalOrder(self, mat):
        x, y = 0, 0
        r, c = len(mat), len(mat[0])
        count = r * c
        res = []
        direction = 1

        while count:
            res.append(mat[x][y])
            count -= 1
            if direction == 1:
                if x == 0:
                    if y == c - 1:
                        x += 1
                    else:
                        y += 1
                    direction = -1
                elif y == c - 1:
                    x += 1
                    direction = -1
                else:
                    x -= 1
                    y += 1
            else:
                if x == r - 1:
                    y += 1
                    direction = 1
                elif y == 0:
                    x += 1
                    direction = 1
                else:
                    x += 1
                    y -= 1
        return res
L = [[1,2,3],[4,5,6],[7,8,9]]
obj = Solution()
print(obj.findDiagonalOrder(L))
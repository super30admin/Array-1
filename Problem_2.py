class Solution:
    def findDiagonalOrder(self, mat):
        result = []
        rows, cols = len(mat), len(mat[0])
        total_elements = rows * cols
        flag = True  # True means up, False means down
        cr, cc = 0, 0
        while len(result) < total_elements:
            result.append(mat[cr][cc])
            if flag:
                if cc == cols - 1:
                    cr += 1
                    flag = False
                elif cr == 0:
                    cc += 1
                    flag = False
                else:
                    cr -= 1
                    cc += 1
            else:
                if cr == rows - 1:
                    cc += 1
                    flag = True
                elif cc == 0:
                    cr += 1
                    flag = True
                else:
                    cc -= 1
                    cr += 1
        return result

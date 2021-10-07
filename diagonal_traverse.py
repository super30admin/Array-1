#Time Complexity = O(n*m)
#Space Complexity = O(n*m)
#compiled and run on leetcode



class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if (mat == None and len(mat) == 0 and len(mat[0]) == 0):
            return []

        row = len(mat)
        col = len(mat[0])

        res = []
        idx = 0
        i = 0
        j = 0
        dire = 1

        while (idx < row * col):
            res.append(mat[i][j])
            idx += 1

            if (dire == 1): #moving upward dir
                if (j == col - 1): #last col
                    i += 1
                    dire = -1

                elif (i == 0):#first row
                    j += 1
                    dire = -1
                else: #any other row or col
                    i -= 1
                    j += 1

            else: #moving downward dir
                if (i == row - 1): #last row
                    j += 1
                    dire = 1
                elif (j == 0): #first col
                    i += 1
                    dire = 1
                else: #any other row or col
                    i += 1
                    j -= 1
        return res

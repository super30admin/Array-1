class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix) == 0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        if m == 0 and n == 0:
            return 0
        dir = 1
        i = j = id = 0
        arr = [0] * m * n

        while id < m * n:
            arr[id] = matrix[i][j]
            # print(arr)
            if dir == 1:
                if j == n - 1:
                    i += 1
                    dir = -1
                elif i == 0:
                    dir = -1
                    j += 1

                else:
                    i -= 1
                    j += 1
            else:
                if i == m - 1:
                    j += 1
                    dir = 1
                elif j == 0:
                    dir = 1
                    i += 1

                else:
                    i += 1
                    j -= 1

            id += 1
        return arr
        # space-O(1) time-O(m*n)
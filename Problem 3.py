# Time:O(m*n)
# Space: O(1)
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        ans = []
        tot_count = len(matrix) * len(matrix[0])
        count = 0
        row = 0
        col = len(matrix[0])
        while count < tot_count:
            for i in range(len(matrix[0]) - col, col):
                ans.append(matrix[row][i])
                count += 1
            if count == tot_count:
                break
            for i in range(row+1, len(matrix) - row):
                ans.append(matrix[i][col-1])
                count += 1
            if count == tot_count:
                break
            for i in range(col-2, len(matrix[0]) - col-1, -1):
                ans.append(matrix[len(matrix)-row-1][i])
                count += 1
            if count == tot_count:
                break
            for i in range(len(matrix) - row -2, row, -1):
                ans.append(matrix[i][len(matrix[0])-col])
                count += 1
            if count == tot_count:
                break
            row += 1
            col -= 1
        return ans
            
            

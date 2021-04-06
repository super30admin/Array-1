# Time Complexity is O(m*n)
# Space Complexity is O(1)
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if(len(matrix) == 0):
            return []
        d = 1
        i = 0
        j = 0
        m = len(matrix)
        n = len(matrix[0])
        out = []
        while(i < m and j < n):
            out.append(matrix[i][j])
            if(d == 1):
                if(j == n-1):
                    i+=1
                    d = -1
                elif(i == 0):
                    j+=1
                    d = -1
                else:
                    i-=1
                    j+=1
            else:
                if(i == m-1):
                    j+=1
                    d = 1
                elif(j == 0):
                    i+=1
                    d = 1
                else:
                    i+=1
                    j-=1
        return out
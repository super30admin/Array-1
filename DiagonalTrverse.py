# Time Complexity: O(N*M) where N is number of inputs in row and M is number of inputs in column
# Space Complexity: O(N*M) where N is number of inputs in row and M is number of inputs in column
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []
        if len(matrix) ==0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = 0
        i = 0
        dir =1
        while(i < m*n):
            result.append(matrix[r][c])
            if dir ==1:
                if c == n-1:
                    r+=1
                    dir =-1
                elif r ==0:
                    c+=1
                    dir =-1
                else:
                    c+=1
                    r-=1
            else:
                if r == m-1:
                    c+=1
                    dir=1
                elif c ==0:
                    r+=1
                    dir =1
                else:
                    r+=1
                    c-=1
            i+=1
        return result


# Time Complexity: O(n)
# Time Complexity: O(1)
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m = len(mat)
        n = len(mat[0])
        dir = 1
        i = 0
        j = 0
        k = 0
        result = [0 for z in range(m*n)]
        while k < (m*n):
            result[k] = mat[i][j]
            k += 1
            if dir == 1:
                if j == n-1:
                    i+=1
                    dir = -1
                elif i == 0:
                    j+=1
                    dir = -1
                else:
                    i-=1
                    j+=1
            else:
                if i == m-1:
                    j+=1
                    dir = 1
                elif j == 0:
                    i+=1
                    dir = 1
                else:
                    j-=1
                    i+=1
        return result
        # for i in range(m-2, -1, 0):
        #     r = 0
        #     c = i
        #     while r <= i and c >= 0:
        #         if flag:
        #             output.append(mat[j][i])
        #         else:
        #             output.append(mat[i][j])
        #     flag = not flag
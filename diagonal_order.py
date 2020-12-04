'''
Time complexity:O(M*N)
Space complexity :O(M*N)
'''
class Solution:
    def diagonal_order(self,array):
        dir = 1
        m = len(array)
        n = len(array[0])
        result = [None] *(m*n)

        index = 0
        i,j = 0,0

        while index < m*n:
            result[index] = array[i][j]
            if dir == 1:
                if j == n-1 :
                    dir = -1
                    i+= 1
                elif i == 0:
                    dir = -1
                    j+=1
                else:
                    i-=1
                    j+=1
            else:
                if i == m-1:
                    dir = 1
                    j+=1
                elif j==0:
                    dir = 1
                    i+=1
                else:
                    i+=1
                    j-=1
            index+=1
        return result

s = Solution()
print(s.diagonal_order([[1,2,3],[4,5,6],[7,8,9]]))
# Time Complexity is O(m*n)
# Space Complexity is O(1), given that O/P array is not considered

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat : return
        di = 1
        m,n = len(mat),len(mat[0])
        result = []
        idx,i,j = 0,0,0
        while idx < m * n:
            result.append(mat[i][j])
#             The sequence of the if, elif is absolute in this problem. If we change it we will find get index out of range.
# [[1,2,3],[4,5,6],[7,8,9]] In this test case at value 3 we will move try to move to next column if the sequence of the statements is changed

            if di == 1:
                if j == n-1:
                    i += 1
                    di = -1
                elif i == 0:
                    j += 1
                    di = -1
                else:
                    i += -1
                    j += 1
            else:
                if i == m -1:
                    j += 1
                    di = 1
                elif j == 0:
                    i += 1
                    di = 1
                else:
                    j +=-1
                    i += 1
            idx +=1
        return result

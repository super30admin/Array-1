#  Time Complexity : O (m*n)
#  Space Complexity : O(1) except the output array
#  Did this code successfully run on Leetcode : Yes
#  Three line explanation of solution in plain english
    # strating from [0,0] check from which side we want to move
    # depending on which side we are moving check if we are going out of bound
    # if we are moving out of bound change i and j accordingly if not put a normal pass
    # write j == (n - 1) before of elif i == 0 to handle the edge case when i is 0 at j == len(n-1) and then we increment and then go out of bound

#  Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m,n = len(mat), len(mat[0])
        i = 0
        j = 0
        direction = True
        result = []
        while len(result) < m * n:
                result.append(mat[i][j])
                # when we are going upwards i.e direction True
                if direction:
                    # writin this first to handle the edge case when i and j both are zero
                    if j == (n - 1):
                        direction = False
                        i += 1
                    # going out from top
                    elif i == 0:
                        direction = False
                        j += 1
                    # for normal pass
                    else:
                        i -= 1
                        j += 1
                # when we are going downwards
                else:
                    # going out from botom
                    if i == (m - 1):
                        direction = True
                        j += 1
                    # going out from left
                    elif j == 0:
                        direction = True
                        i += 1
                    # for normal pass
                    else:
                        i += 1
                        j -= 1
                
        return result
#TC:O(M*N)
#SC:O(1)
class Solution:
  def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
    result = []
    m, n = len(mat), len(mat[0])
    i = j = direction = 0
    
    # Step 3
    for _ in range(m * n):
        result.append(mat[i][j])
        
        if direction == 0: 
            if j == n - 1:
                direction = 1 
                i += 1
            elif i == 0:
                direction = 1 
                j += 1
            else:
                i -= 1
                j += 1
        else:
            if i == m - 1:
                direction = 0 
                j += 1
            elif j == 0:
                direction = 0 
                i += 1
            else:
                i += 1
                j -= 1
    
    return result
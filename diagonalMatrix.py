# Space Complexity: O(1)
# Time Complexity: O(mn) : m -> Rows, n -> columns

# Defined the upward and Downward direction using flags and checking edge case on row, col value and number of elements

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        
        if mat is None or m == 0:
            return result
        
        dirs = [[-1, 1], [1, -1]]
        
        nr = 0
        nc = 0
        idx = 0
        flag = 0
        
        while(idx < m*n):
            
            
            result[idx] = mat[nr][nc]
            idx += 1
            
            if (flag == 0):

                # Upward Direction

                if (nr == 0 and nc != n - 1):
                    nc += 1
                    flag = 1
                elif(nc == n - 1):
                    nr += 1
                    flag = 1
                else:
                    nr += dirs[flag][0]
                    nc += dirs[flag][1]
                
            else:

                # Downward Direction
                
                if (nc == 0 and nr != m - 1):
                    nr += 1
                    flag = 0
                elif (nr == m - 1):
                    nc += 1
                    flag = 0
                else:
                    nr += dirs[flag][0]
                    nc += dirs[flag][1]
            
            
        return result

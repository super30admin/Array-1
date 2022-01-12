class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = []
        flag = -1
        n = len(mat) 
        m = len(mat[0])
        for j in range(m):
            i = 0
            flag *= -1
           
            blankList = []
            
            while 0 <= i < n and 0 <= j < m:
                blankList.append(mat[i][j])
                i += 1
                j -= 1
            if flag == 1:
                blankList = blankList[::-1]
            result.extend(blankList)
            
        for i in range(1, n):
            flag *= -1
            j = m - 1
            blankList = []
            while 0 <= i < n and 0 <= j < m:
                blankList.append(mat[i][j])
                j -= 1
                
                i += 1
                
            if flag == 1:
                blankList = blankList[::-1]
            result.extend(blankList)
        return result
    
    
# T.C => O(m * n)
# S.P => (m * n) => Length of a mtrix
# Approach = There are flag which is set to -1 or 1 based on the given direction. 
#If i come from bottom right then its -1 and if its take a turn from top right the it is set to 1
#Based on the direction the values are appended or extended as per needed.
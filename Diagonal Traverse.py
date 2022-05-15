# Time Complexity: O(MN), where N is length of matrix and N is columns
# Space Complexity: O(1)
# Executed Successfully: Yes
# Challenges faced: No


#CODE
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == [] or len(mat) == 0:
            return []
        if len(mat) == 1:
            return mat[0]
        arr = [None] * (len(mat)*len(mat[0]))
        row, col, ind, di = 0, 0, 0, 1
        while ind < len(arr):
            arr[ind] = mat[row][col]
            ind += 1
            if di == 1:
                if row == 0 and col != len(mat[0])-1:
                    di = -1
                    col += 1
                elif col == len(mat[0])-1:
                    di = -1
                    row += 1
                else:
                    row -= 1
                    col += 1
            else:
                if col == 0 and row != len(mat)-1:
                    di = 1
                    row += 1
                elif row == len(mat)-1:
                    di = 1
                    col += 1
                else:
                    col -= 1
                    row += 1
        return arr




# Recursive Solution
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == [] or len(matrix) == 0:
            return []
        
        
        m = len(matrix)
        n = len(matrix[0])
        
        l,r,t,b,ind = 0,n-1,0,m-1,0
        
        li = list()
        
        self.helper(l,r,t,b,li,matrix)
        return li
    
    def helper(self,l,r,t,b,li,matrix):
        
        if l > r and t > b:
            return
        
        if l <= r and t <= b:
            for i in range(l,r+1):
                li.append(matrix[t][i])
            t += 1
            
        if l <= r:
            for i in range(t,b+ 1):
                li.append(matrix[i][r])    
            r -= 1

        if t <= b:
            for i in range(r,l-1,-1):
                li.append(matrix[b][i])
            b -= 1

        if l <= r:
            for i in range(b,t-1,-1):
                li.append(matrix[i][l])
            l += 1
        
        self.helper(l,r,t,b,li,matrix)
        
        
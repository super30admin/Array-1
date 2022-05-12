'''
time complexity: O(R*C)
R - len of row of mat, C - len of col of mat
space complexity: O(1)
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        left = 0
        right = len(matrix[0])
        res = []
        top = 0
        bottom = len(matrix)
        while(left<right and top<bottom):
            
            for i in range(left,right):
                res.append(matrix[top][i])
            
            top+=1
            
            for i in range(top,bottom):
                res.append(matrix[i][right-1])
            right-=1
            if not (left<right and top<bottom):
                break
            for i in range(right-1,left-1,-1):
                res.append(matrix[bottom-1][i])
            bottom-=1
            
            for i in range(bottom-1,top-1,-1):
                res.append(matrix[i][left])
            left+=1
        return res
                
#Time Complexity: O(m*n)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        if len(matrix)==0:
            return []
        left,top = 0,0
        right,bottom = len(matrix[0])-1,len(matrix)-1
        result=[]
        
        while left<=right and top<=bottom:
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1
            if left<=right:
                for i in range(top,bottom+1):
                    result.append(matrix[i][right])
                right-=1
            if top<=bottom:
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom-=1
            if left<=right:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
        return result
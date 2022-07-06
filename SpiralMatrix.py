

# Time Complexity :O(mn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes 
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        top=0
        bottom=m-1
        left=0
        right=n-1
        res=[]
        while(len(res)<(m)*(n)):
            #top row
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top+=1
            
             #right col
            for j in range(top,bottom+1):
                res.append(matrix[j][right])
            right-=1
            
             #bottom row
            if top<=bottom: 
                for i in reversed(range(left,right+1)):
                    res.append(matrix[bottom][i])
            bottom-=1
            
             #left row
            if left<=right:    
                for j in reversed(range(top,bottom+1)):
                    res.append(matrix[j][left])
            left+=1
            
        return res
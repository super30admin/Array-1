# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : Noclass Solution:
def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        n=len(matrix[0])
        m=len(matrix)
        
        left=0
        right=n-1
        
        top=0
        bottom=m-1
        
        res=[] 
        while left<=right and top<=bottom:
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top+=1
            if top<=bottom and left<=right:
                for j in range(top,bottom+1):
                    res.append(matrix[j][right])
            right-=1
            if top<=bottom and left<=right:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])   
            
            bottom-=1
            if top<=bottom and left<=right:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])  
            left+=1
        
        return (res)
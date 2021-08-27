#time comp- O(m*n)
#space- O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ans=[]
        m=len(matrix)
        n=len(matrix[0])
        ans=[]
        i=0
        left=0 
        right=n-1
        top=0
        bottom=m-1
        
        while top<=bottom and left<=right:
                
                #left to right
                for i in range(left,right+1):
                    ans.append(matrix[top][i])
                top=top+1
                #top to bottom
                for i in range(top,bottom+1):
                    ans.append(matrix[i][right])
                right=right-1
                #right to left
                if top<=bottom:
                    i=right
                    while i >=left:
                        ans.append(matrix[bottom][i])
                        i=i-1
                    bottom=bottom-1
                #bottom to up
                if left<=right:
                
                    i=bottom
                    while i>=top:
                        ans.append(matrix[i][left])
                        i=i-1
                    left=left+1
                
        return ans
                  
          
                
        

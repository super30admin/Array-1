#Time Complexity O(n*m)
#Space Complexity O(1)
class Solution:
    def spiralOrder(self, mat: List[List[int]]) -> List[int]:
        
        if mat == None or len(mat)==0:
            return []
        res = []
        direction = 1
        n = len(mat[0])
        m = len(mat)
        left = 0
        right = n-1
        top = 0
        bottom= m-1
        
        while top <= bottom and left<=right:
            #For the top 
            for x in range(left,(right+1)):
                res.append(mat[top][x])
            top+=1
            
            #For the right
            for x in range(top,(bottom+1)):
                res.append(mat[x][right])
            right-=1
            
            #For the bottom
            for x in range(right,(left-1),-1):
                if len(res) == (n*m):
                    return res
                res.append(mat[bottom][x])
            bottom-=1
            
            #For the left
            for x in range(bottom,(top-1),-1):
                if len(res) == (n*m):
                    return res
                res.append(mat[x][left])
            left+=1
        
        return res

            
        

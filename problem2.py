#Time Complexity O(n*m)
#Space Complexity O(n*m)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat)==0:
            return []
        res = []
        direction = 1
        n = len(mat[0])
        m = len(mat)
        i =0
        j=0
        ind = 0
        
        for x in range((n*m)):
            res.append(mat[i][j])
            if direction == 1:
                if j == n-1:
                    i+=1
                    direction=-1
                elif i ==0:
                    j+=1
                    direction=-1
                    
                else:
                    i-=1
                    j+=1
                
            else:
                
                if i == m-1:
                    j+=1
                    direction=1
                    pass
                elif j ==0:
                    i+=1
                    direction=1
                    
                else:
                    i+=1
                    j-=1
                
        return res
            
         
            
        
        
        

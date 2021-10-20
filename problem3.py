#Time complexity O(n*m) and space complexity O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res=[]
        l=t=0
        r=len(matrix[0])-1
        b=len(matrix)-1
#Traversing through the loop        
        while t<=b and l<=r:
#since we are traversing row here changing column          
            for i in range(l,r+1):
                res.append(matrix[t][i])
            t+=1
#changing row , traversing column           
            for i in range(t,b+1):
                res.append(matrix[i][r])
            r-=1
#changing column, traversing row from right    
            if t<=b:
                for i in range(r,l-1,-1):
                    res.append(matrix[b][i])
            b-=1
  #changing row , traversing column from bottom       
            if l <=r:
                for i in range(b,t-1,-1):
                    res.append(matrix[i][l])
                l+=1
            
        return res

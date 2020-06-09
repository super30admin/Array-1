class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if(len(matrix)==0):
            return []
        i=0
        m=len(matrix)
        n=len(matrix[0])
        r=0
        c=0
        resultarr=[None]*(m*n)
        dir=1
        while(i<m*n):
            if(dir==1):
                resultarr[i]=matrix[r][c]
                if c==n-1:
                    r+=1
                    dir=-1
                elif(r==0):
                    c+=1
                    dir=-1
                else:
                    r-=1
                    c+=1
            elif dir==-1:
                resultarr[i]=matrix[r][c]
                if r==m-1:
                    c+=1
                    dir=1
                elif c==0:
                    r+=1
                    dir=1
                else:
                    r+=1
                    c-=1
            i+=1
        return resultarr
       
#time complexity is O(n*m) because traversing through the entire matrix..
#result is O(1) #returning the results array itself, no other auxialliary data structure used

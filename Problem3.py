class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        def printLayer(r1,r2,c1,c2):
            cur=[]
            #top layer
            for c in range(c1,c2+1):
                cur.append(matrix[r1][c])
            #right layer
            for r in range(r1+1,r2+1):
                cur.append(matrix[r][c2])
            if r1==r2 or c1==c2:
                return cur
            #bottom layer
            for c in range(c2-1,c1,-1):
                cur.append(matrix[r2][c])
            #left layer
            for r in range(r2,r1,-1):
                cur.append(matrix[r][c1]) 
            print(cur)
            return cur
            
        r1=0
        r2=len(matrix)-1
        c1=0
        c2=len(matrix[0])-1
        
        final=[]
        while(r1<=r2 and c1<=c2):
            layer=printLayer(r1,r2,c1,c2)
            final.extend(layer)
            r1+=1
            r2-=1
            c1+=1
            c2-=1
        return final
    #Time O(mn), m=row.length, n=col.length
    #Space O(1)
        

#T(N)=O(M*N)
#S(N)=O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m,n=len(matrix),len(matrix[0])
        up,le=0,0
        ri=n-1
        dn=m-1
        li=[]
        while(up<=dn and le<=ri):
            #top row
            for i in range(le,ri+1):
                li.append(matrix[up][i])
            up+=1
            
            if dn<up or ri<le:
                break
            #Right Column
            
            for i in range(up,dn+1):
                li.append(matrix[i][ri])
            ri-=1
            
            #Bottom Row
            if dn<up or ri<le:
                break
            
            for i in range(ri,le-1,-1):
                li.append(matrix[dn][i])
            
            dn-=1
            if dn<up or ri<le:
                break
            
            #Left Col
            
            for i in range(dn,up-1,-1):
                li.append(matrix[i][le])
            le+=1
        return li
            
                
            
        
        
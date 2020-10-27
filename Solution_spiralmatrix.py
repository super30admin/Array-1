"""
Time Complexity= O(NxM)
Space Complexity=O(1)

Have four pointer Rowbegin, rowend, column begin and columnend and mov ethem based on the spiral matrix need checking necessary base conditions.

"""

class Solution_spiralmatrix:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix)==0:
            return []
        
        rowbegin=0
        rowend=len(matrix)
        columnbegin=0
        columnend=len(matrix[0])
        res=[]
        
        while rowend>rowbegin and columnend>columnbegin:
            for i in range(columnbegin,columnend):
                res.append(matrix[rowbegin][i])
            
            for j in range(rowbegin+1,rowend-1):
                res.append(matrix[j][columnend-1])
            
            if rowend!= rowbegin+1:
                for i in range(columnend-1,columnbegin-1,-1):
                    res.append(matrix[rowend-1][i])
            
            if columnbegin!=columnend-1:
                for j in range(rowend-2,rowbegin,-1):
                    res.append(matrix[j][columnbegin])
            
            rowbegin+=1
            columnbegin+=1
            rowend-=1
            columnend-=1
        
        return res
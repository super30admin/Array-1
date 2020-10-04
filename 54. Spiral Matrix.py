"""
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix:
            return []
        
        rS = 0
        rE = len(matrix)-1
        cS = 0
        cE = len(matrix[0])-1
        res=[]
        while(rS<=rE and cS<=cE):
            
            for i in range(cS,cE+1):
                res.append(matrix[rS][i])
            rS+=1
            
            for i in range(rS,rE+1):
                res.append(matrix[i][cE])
            cE-=1
            
            if(rS<=rE):
                for i in range(cE,cS-1,-1):
                    res.append(matrix[rE][i])
                rE-=1
            
            if(cS<=cE):
                for i in range(rE,rS-1,-1):
                    res.append(matrix[i][cS])
                cS+=1
        
        return res
                
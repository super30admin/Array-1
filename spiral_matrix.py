// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
  
// Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        if not matrix:
            return result
        b = a = 0
        rowIndex = len(matrix)-1
        colIndex = len(matrix[0])-1
        num = 0
        while a <= colIndex and b <= rowIndex:
            ## up
            
            for i in range(a,colIndex+1):
                result.append(matrix[b][i])
            b += 1
            
            # right
            for j in range(b,rowIndex+1):
                result.append(matrix[j][colIndex])
            colIndex -= 1
             # down 
            if b <= rowIndex:
                for m in range(colIndex,a-1,-1): 
                    result.append(matrix[rowIndex][m])
            rowIndex -= 1 
            # left
            if a <= colIndex:
                for n in range(rowIndex,b-1,-1):
                    result.append(matrix[n][a])
            a += 1

        return result
 

# Time Complexity: O(N*M)
# Space Complexity: O(N)
# Leetcode all test cases passed: Yes
# Any Difficulties: No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix:
            return None
        
        result = []
        
        startRow = 0
        startCol = 0
        endRow = len(matrix)
        endCol = len(matrix[0])
        
        while startRow < endRow and startCol < endCol:
            
            for i in range(startCol, endCol):
                result.append(matrix[startRow][i])
                
            for i in range(startRow+1, endRow-1):
                result.append(matrix[i][endCol-1])
                
            if startRow != endRow - 1:
                for i in range(endCol-1,startCol-1,-1):
                    result.append(matrix[endRow-1][i])
            
            if startCol != endCol - 1:
                for i in range(endRow-2,startRow,-1):
                    result.append(matrix[i][startRow])
                    
            startRow += 1
            startCol += 1
            endRow -= 1
            endCol -= 1
        return result

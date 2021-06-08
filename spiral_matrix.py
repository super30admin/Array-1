class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        :time complexity: O(m*n)
        :space complexity: O(1)
        """
        
        # result=[]
        # if len(matrix) ==1:
        #     return [result.append(matrix[i])]
        
        rowBegin = 0
        rowEnd = len(matrix)-1
        colBegin = 0
        colEnd = len(matrix[0])-1
        #n = (rowEnd+1) * (colEnd+1)
        result=[]
        
        while (rowBegin<=rowEnd and colBegin <= colEnd):
            for i in range(colBegin, colEnd+1):
                result.append(matrix[rowBegin][i])
            rowBegin=rowBegin+1
            
            for i in range(rowBegin, rowEnd+1):
                result.append(matrix[i][colEnd])
            colEnd=colEnd-1
            
            if(rowBegin<=rowEnd):
                for i in range(colEnd, colBegin-1, -1):
                    result.append(matrix[rowEnd][i])
            rowEnd=rowEnd-1
            if (colBegin<=colEnd):
                for i in range(rowEnd, rowBegin-1, -1):
                    result.append(matrix[i][colBegin])
            colBegin=colBegin+1

        return result
    
        
        
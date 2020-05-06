#TimeComplexity : O(N*M) N is rows and Mis Columns
#Space Complexity : O(N*M )
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix)==0:
            return []
        result = []
        top =0
        bottom =len(matrix)-1
        right =len(matrix[0])-1
        left =0
        
        while left<=right and top<=bottom:
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1
            for j in range(top,bottom+1):
                result.append(matrix[j][right])
            right-=1
            
            if top<=bottom:
                for k in range(right,left-1,-1):
                    result.append(matrix[bottom][k])
                bottom-=1
            if left<=right:
                for t in range(bottom,top-1,-1):
                    result.append(matrix[t][left])
                left+=1
        return result
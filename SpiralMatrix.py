'''Time complexity: O(mn)
Space: O(1)'''

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        
        if len(matrix)==0:
            return [None]
        m=len(matrix)
        n=len(matrix[0])
        top=0
        bottom=m-1
        right=n-1
        left=0
        
        result=[]
        
        while left<=right and top<=bottom:
            #Top row
            for j in range(left, right+1):
                result.append(matrix[top][j])
            #shrink top
            top+=1
            #right Col
            
            #checking the base condition again
            if left<=right and top<=bottom:
                
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                #shrink right
                right-=1
            #bottom
            if left<=right and top<=bottom:
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                #shrink bottom
                bottom-=1
            if left<=right and top<=bottom:
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])

                left+=1
        
        return result
                
                
        
       

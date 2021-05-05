#Running Time Complexity: O(mxn)
#Space Complexity: Constant or O(1)
#Successfully Run and Compiled 
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None and len(matrix)==0:
            return [0]
        m = len(matrix)
        result = []
        n = len(matrix[0])
        top,bottom,left,right = 0,m-1,0,n-1
        while left<=right and top <=bottom:
            #iterate on top row 
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top +=1
            #iterate on column
            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right -=1
            #bottom row is faulty 
            if (left<=right and top <=bottom):
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom -=1
            if (left<=right and top <=bottom):
                #left column
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left +=1
        return result
    
            
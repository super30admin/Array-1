from pip import List
#Time Complexity = O(n^2)
#Space Complexity = O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if(len(matrix)==0):
            return []
        m = len(matrix)
        n = len(matrix[0])
        res = []
        top, bottom = 0, m-1
        left, right = 0, n-1
        while(top<=bottom and left<=right):
            for i in range(left, right+1):
                res.append(matrix[top][i])
            top+=1
            if(top<=bottom and left<=right):
                for i in range(top,bottom+1):
                    res.append(matrix[i][right])
                right -=1
            if(top<=bottom and left<=right):
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom -=1
            if(top<=bottom and left<=right):
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
                left +=1
        return res
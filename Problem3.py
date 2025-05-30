class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """

        left = 0
        right = len(matrix[0]) -1
        top = 0
        bottom = len(matrix)- 1
        arr = []
        while left<= right and top <= bottom:

            for i in range(left,right+1):
                arr.append(matrix[top][i])
            top+=1

            for j in range(top,bottom+1):
                arr.append(matrix[j][right])
            right-=1

            if top <= bottom:
                for i in range(right,left-1,-1):
                    arr.append(matrix[bottom][i])
                bottom-=1

            if left <= right:
                for j in range(bottom,top-1,-1):
                    arr.append(matrix[j][left])
                left +=1

        return arr
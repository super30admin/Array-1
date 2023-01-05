#TC-> O(m*n)
#SC->O(1)

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if(matrix == None or len(matrix) == 0 or len(matrix[0])==0 ):
            return []
        m = len(matrix) #r
        n = len(matrix[0])
        result = []
        #row wise
        top = 0
        bottom = m-1
        #column wise
        left = 0
        right = n-1

        while(top<=bottom and left<=right):
            #top row filling
            for j in range(left, right+1): #fills 1,2,3
                result.append(matrix[top][j])
            top = top + 1

            #right columns filling
            for i in range(top,bottom+1):#fills 6,9 : remember it fills from 6 and not 3, top is incremented
                result.append(matrix[i][right])
            right = right - 1

            #bottom row filling
            if top<=bottom:
                for j in range(right, left-1, -1):#fills 8,7
                    result.append(matrix[bottom][j])
                bottom = bottom - 1

            #left column filling
            if left<=right:
                for i in range(bottom, top-1, -1):#fills 4
                    result.append(matrix[i][left])
                left = left + 1 

        return result
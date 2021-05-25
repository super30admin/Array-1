class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left = 0
        right = len(matrix[0])-1
        top = 0
        arr = []
        bottom = len(matrix)-1
        while(left<=right and bottom>=top):
            if(left<=right and bottom>=top):
                for i in range(left,right+1):
                    arr.append(matrix[top][i])
                top = top+1
            if(left<=right and bottom>=top):
                for i in range(top,bottom+1):
                    arr.append(matrix[i][right])
                right = right -1
            if(left<=right and bottom>=top):
                for i in range(right,left-1,-1):
                    arr.append(matrix[bottom][i])
                bottom = bottom -1
            if(left<=right and bottom>=top):
                for i in range(bottom,top-1,-1):
                    arr.append(matrix[i][left])
                left = left + 1

        return arr
        

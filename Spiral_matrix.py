class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res=[]
        if len(matrix)==0:
            return res
        left=0
        right=len(matrix)-1
        top=0
        bottom= len(matrix[0])-1

        while(left<=right and top<=bottom):

            for i in range(top, bottom+1):
                res.append(matrix[left][i])
            left+=1

            for i in range(left, right+1):
                res.append(matrix[i][bottom])
            bottom= bottom-1

            if(left<=right):
                for i in range(bottom, top-1, -1):
                    res.append(matrix[right][i])
                right= right-1

            if(top<=bottom):
                for i in range(right, left-1, -1):
                    res.append(matrix[i][top])
                top+=1
        return res

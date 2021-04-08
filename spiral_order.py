class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix)==0:
            return []
        top=0
        bottom=len(matrix)-1
        left=0
        right=len(matrix[0])-1
        res=[]
        while(top<=bottom and right>=left):
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top+=1       
            for j in range(top,bottom+1):
                res.append(matrix[j][right])
            right-=1
            if(top<=bottom):
                for k in range(right,left-1,-1):
                    res.append(matrix[bottom][k])
            bottom-=1
            if(left<=right):
                for l in range(bottom,top-1,-1):
                    res.append(matrix[l][left])
            left+=1
        return res
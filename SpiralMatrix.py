#Time complexity: O(m*n)
#Space complexity: O(m*n)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==None or len(matrix)==0:
            return []
        m=len(matrix)
        n=len(matrix[0])
        arr=[0 for i in range(m*n)]
        top=0
        bottom=m-1
        left=0
        right=n-1
        i=0
        while(i<m*n) and (top<=bottom) and (left<=right):
            for j in range(left,right+1):
                arr[i]=matrix[top][j]
                i+=1
            top+=1
            for j in range(top,bottom+1):
                arr[i]=matrix[j][right]
                i+=1
            right-=1
            if(top<=bottom):
                for j in range(right,left-1,-1):
                    arr[i]=matrix[bottom][j]
                    i+=1
                bottom-=1
            if(left<=right):
                for j in range(bottom,top-1,-1):
                    arr[i]=matrix[j][left]
                    i+=1
                left+=1
        return arr
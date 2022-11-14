#TC: O(mxn)
#SC: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top,left,bottom,right=0,0,len(matrix)-1,len(matrix[0])-1

        spiral=[]
        while(top<=bottom and left<=right):
            for j in range(left,right+1):
                spiral.append(matrix[top][j])
            top+=1
            for i in range(top,bottom+1):
                spiral.append(matrix[i][right])
            right-=1
            if left>right or top>bottom: break
            for j in range(right,left-1,-1):
                spiral.append(matrix[bottom][j])
            bottom-=1
            for i in range(bottom,top-1,-1):
                spiral.append(matrix[i][left])
            left+=1
        return spiral
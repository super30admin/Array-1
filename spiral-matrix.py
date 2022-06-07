# Time Complexity: O(m*n)
# Space Complexity: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res=[]
        top,l=0,0
        bottom=len(matrix)-1
        r=len(matrix[0])-1
        while top<=bottom and l<=r:
            for i in range(l,r+1):
                res.append(matrix[top][i])
            top+=1
            if top<=bottom and l<=r:
                for j in range(top,bottom+1):
                    res.append(matrix[j][r])
            r-=1
            if top<=bottom and l<=r:
                for i in range(r,l-1,-1):
                    res.append(matrix[bottom][i])
            bottom-=1
            if top<=bottom and l<=r:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][l])
            l+=1
            
        return res
                
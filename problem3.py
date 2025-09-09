"""
Space Complexity: O(1) if the output array is not considered as space

Time Complexity: O(m*n) where m == number of rows and n == number of columns

"""
class Solution:
    def spiralOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        res = []
        left, right, top, bottom = 0, n-1, 0, m-1

        while left<=right and top <= bottom: 
            
            for i in range(left, right+1): 
                res.append(mat[top][i])

            top+=1
            if top > bottom: break

            for j in range(top, bottom+1): 
                res.append(mat[j][right])

            right-=1
            if left > right : break
            for i in range(right, left-1, -1): 
                res.append(mat[bottom][i])
            bottom-=1
            
            if top > bottom: break
            for j in range(bottom, top-1, -1): 
                res.append(mat[j][left])
            left+=1


        return res
        

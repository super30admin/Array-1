#All TC passed on leetcode

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #Here we keep 4 pointer for top, left, right and bottom to keep track of current row or 
        #column to be printed. In every case our left<=right and top<=bottom. The moment 
        #the pointers cross then we exit. after append each row/column we increment or decrement 
        #the corressponding pointers based on its current position.
        #Time complexity - O(m.n) where m=rows and n=cols
        #Space complexity - O(1) as space alloted for o/p is not considered 
        rows = len(matrix)
        cols = len(matrix[0])

        left=0
        top=0
        right=cols-1
        bottom=rows-1

        res = []

        while left<=right and top<=bottom:

            for j in range(left,right+1):
                res.append(matrix[top][j])
            top+=1

            if left<=right:
                for i in range(top, bottom+1):
                    res.append(matrix[i][right])
                right-=1

            if top<=bottom:
                for j in range(right, left-1, -1):
                    res.append(matrix[bottom][j])
                bottom-=1

            if left<=right:
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
                left+=1

        return res
        
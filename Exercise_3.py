# Time Complexity: O(m*n)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        if not matrix:
            return []

        m = len(matrix)
        n = len(matrix[0])

        top, bottom, left, right = 0, m-1, 0, n-1

        res = []

        while top<=bottom and left<=right:
            
            # moving left to right 
            for i in range(left, right+1):
                res.append(matrix[top][i] )
            top+=1

            # moving top to bottom 
            for i in range(top, bottom+1):
                res.append(matrix[i][right])
            right-=1

            # moving right to left, also check that top bound has not crossed bottom bound
            if top<=bottom:
                for i in range(right, left-1, -1):

                    res.append(matrix[bottom][i])
                bottom-=1
            

            # moving bottom to top, also check that left bound has not crossed right bound
            if left<=right:
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])

                left+=1

            # print(res)

        return res


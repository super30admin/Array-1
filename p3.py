#Tc = o(m*n)
#SC = O(1)
#successfully submitted on leetcode; yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top = 0
        bottom = len(matrix)
        left = 0
        right = len(matrix[0]) 
        ans = []

       
        while top < bottom and left < right:
            #top pass
            if top < bottom and left < right:
                for i in range(left,right):
                    curr = matrix[top][i]
                    ans.append(curr)
                top += 1

            #right pass
            if top < bottom and left < right:
                for i in range(top, bottom):
                    curr = matrix[i][right-1]
                    ans.append(curr)
                right -= 1
            
            #bottom
            if top < bottom and left < right:
                for i in range(right-1, left-1, -1):
                    curr = matrix[bottom-1][i]
                    ans.append(curr)
                bottom -= 1
            
            #left
            if top < bottom and left < right:
                for i in range(bottom-1, top-1, -1):
                    curr = matrix[i][left]
                    ans.append(curr)
                left += 1
        return ans
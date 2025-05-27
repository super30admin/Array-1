# // Time Complexity : iterative o(m*n) recursive : o(m*n)
# // Space Complexity : iterative - o(m*n) recursive - o(min(m,n)/2)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
# 1) idea is to respect boundaries when traversing the array and maintaain four pointers to keep track of elemnt to print and  update the pointers

# // Your code here along with comments explaining your approach

from typing import List
# Approach 1:
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m,n= len(matrix) , len(matrix[0])
        arr = [None] * m*n
        top,bottom,left,right,idx = 0,m,0,n,0
        
        while(left<=right-1  and top<=bottom-1):

            if(left<=right-1  and top<=bottom-1):
            # move left to right
                for i in range(left, right):
                    arr[idx] = matrix[top][i]
                    idx+=1
                top+=1

            # move top to bottom
            if(left<=right-1  and top<=bottom-1):
                for i in range(top,bottom):
                    arr[idx] = matrix[i][right-1]
                    idx+=1
                right-=1

            if(left<=right-1  and top<=bottom-1):
            # move right to left
                for i in range(right-1, left-1, -1):
                    arr[idx] = matrix[bottom-1][i]
                    idx+=1
                bottom-=1

            if(left<=right-1  and top<=bottom-1):
            # move from botttom to top
                for i in range(bottom-1,top-1,-1):
                    arr[idx] = matrix[i][left]
                    idx+=1
                left+=1

        return arr

        

# Approach 2:
# class Solution:
#     def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
#         def helper(matrix,top,bottom,left,right, arr):
#             if left>right-1  or top>bottom-1 : return
#             # move left to right
#             for i in range(left, right):
#                 arr.append(matrix[top][i])
#             top+=1

#             # move top to bottom
#             for i in range(top,bottom):
#                 arr.append(matrix[i][right-1])
#             right-=1

#             if(top<=bottom-1):
#             # move right to left
#                 for i in range(right-1, left-1, -1):
#                     arr.append(matrix[bottom-1][i])
#                 bottom-=1

#             if(left<=right-1):
#             # move from botttom to top
#                 for i in range(bottom-1,top-1,-1):
#                     arr.append(matrix[i][left])
#                 left+=1
#             helper(matrix,top,bottom,left,right,arr)

#         m,n= len(matrix) , len(matrix[0])
#         arr = []
#         top,bottom,left,right = 0,m,0,n
#         helper(matrix,top,bottom,left,right,arr)
#         return arr
            

        
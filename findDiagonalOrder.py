# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        num_rows=len(mat)
        num_cols=len(mat[0])        
    #looked up how to get no of diagnols from matrix formula is (rows +coulms )-1
        d=[[] for _ in range((num_rows+num_cols)-1)]
        for i in range(num_rows):
            for j in range(num_cols):
                d[i+j].append(mat[i][j])
        
        output=d[0]  

        for x in range(1, len(d)):
            if x%2==1:
                output.extend(d[x])
            else:
                output.extend(d[x][::-1])
        return output
   
# class Solution:
#     def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
#         i = 0
#         j = 0
#         rows = len(mat)
#         cols = len(mat[0])
#         up = True
#         result = []
#         while i < rows and j < cols:
#             result.append(mat[i][j])
#             if up:
#                 if j == cols - 1:
#                     i += 1
#                     up = False
#                 elif i == 0:
#                     j += 1
#                     up = False
#                 else:
#                     i -= 1
#                     j += 1
#             else:
#                 if i == rows - 1:
#                     j += 1
#                     up = True
#                 elif j == 0:
#                     i += 1
#                     up = True
#                 else:
#                     i += 1
#                     j -= 1
#         return result
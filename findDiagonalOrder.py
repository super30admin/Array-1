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
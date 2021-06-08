# Time Complexity : O(n**2)
# Space Complexity : O(n//2)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


#taking 4variables top left right and bottom and solving recursion using iterative process
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        mat = matrix
        m = len(matrix)
        n = len(matrix[0])
        
        l,r,t,b = 0,n-1,0,m-1
        out = []
        while l<=r and t<=b:
            print(l,r,t,b)
            for i in range(l,r+1):
                out.append(mat[t][i])
            t += 1
            if t <= b:
                for i in range(t,b+1):
                    out.append(mat[i][r])
            r -= 1
            if l<=r:
                for i in range(r,l-1,-1):
                    out.append(mat[b][i])
            b -= 1
            if b<=t:
                for i in range(b,t-1,-1):
                    out.append(mat[i][l])
            l += 1
        return out
            
# Problem 1: Product of Array Except Self
# Time Complexity : O(n)
# Space Complexity : O(1) (Not counting the result)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        res=[1]*(n)
        
        for i in range(1, n):
            res[i]=res[i-1]*nums[i-1]
        
        rp=1
        for i in range(n-2, -1, -1):
            rp*=nums[i+1]
            res[i]*=rp
        
        return res



# Problem 2: Diagonal Traverse
# Time Complexity : O(m*n)
# Space Complexity : O(1) extra space (O(m*n) result)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        res=[]
        m=len(mat)
        n=len(mat[0])
        df=True
        i=j=0
        while i<=m-1 and j<=n-1:
            res.append(mat[i][j])
            # Up
            if df:

                if j==n-1:
                    df=False
                    i+=1

                elif i==0:
                    df=False
                    j+=1

                else:
                    i-=1
                    j+=1
            
            # Down
            else:
                
                if i==m-1:
                    df=True
                    j+=1

                elif j==0:
                    df=True
                    i+=1

                else:
                    i+=1
                    j-=1

        return res




# Problem 3: Spiral Matrix
# Time Complexity : O(m*n)
# Space Complexity : O(1) extra space ( O(m*n) result )
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows=len(matrix)
        cols=len(matrix[0])
        res=[]

        left=0
        right=cols-1
        top=0
        bottom=rows-1

        while top<=bottom and left<=right:
            
            # Left to Right
            for i in range(left, right+1):
                res.append(matrix[top][i])
            
            top+=1
            if top>bottom:
                break
            # Top to Bottom
            for i in range(top, bottom+1):
                res.append(matrix[i][right])


            right-=1
            if left>right:
                break
            # Right to Left
            for i in range(right, left-1,-1):
                res.append(matrix[bottom][i])

            bottom-=1
            if top>bottom:
                break
            # Bottom to Top
            for i in range(bottom, top-1,-1):
                res.append(matrix[i][left])

            left+=1
            
            
        return res
 

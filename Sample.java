Problem 1
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: Took left running products and right running products and by multiplying them, we can get product of left and right neighbours.

// Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        rp = 1
        res = [0]*n
        res[0] = 1
        i = 1
        #left running product
        while(i<n):
            rp = rp*nums[i-1]
            res[i] = rp
            i+=1
        #right running product
        rp = 1
        i = n-2
        while(i>=0):
            rp = rp*nums[i+1]
            res[i] = res[i]*rp
            i-=1
        return res

  Problem 2
// Time Complexity :O(m*n)
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode:Yes
// Three-line explanation of solution in plain English: Maintaining a flag for upward diagonal direction and for downward diagonal direction. whenever we encounter boundaries change the flags 
// and update the row and column.
    
// Your code here along with comments explaining your approach.

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        r = 0
        c = 0
        flag = True
        res = [0]*m*n
        for i in range(len(res)):
            res[i] = mat[r][c]
            if(flag):
            #up
                if(c==(n-1)):
                    flag = False
                    r+=1
                elif(r==0 and c!=n-1):
                    flag = False
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
            #down
                if(r==(m-1)):
                    flag = True
                    c+=1
                elif(c==0 and r!=m-1):
                    flag = True
                    r+=1
                else:
                    c-=1
                    r+=1
            i+=1
            
        return res

  Problem 3
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode: Yes
// Three-line explanation of solution in plain English: Maintain 4 counters top, bottom, left, and right. Limit the boundaries while traversing in a matrix. Important: checking the
// base condition every time we update counters.
    
// Your code here along with comments explaining your approach.
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        res = []
        while(left<=right and top<=bottom):
    
            #traverse left to right on the top row
            i = left
            while(i<=right):
                res.append(matrix[top][i])
                i+=1
            top+=1

            if(left<=right and top<=bottom):
                #traverse top to bottom on the right column
                i = top
                while(i<=bottom):
                    res.append(matrix[i][right])
                    i+=1
            right-=1

            if(left<=right and top<=bottom):       
                #traverse right to left on the bottom row
                i = right
                while(i>=left):
                    res.append(matrix[bottom][i])
                    i-=1
            bottom-=1

            if(left<=right and top<=bottom):               
                #traverse bottom to top on the left column
                i = bottom
                while(i>=top):
                    res.append(matrix[i][left])
                    i-=1
            left+=1

        return res



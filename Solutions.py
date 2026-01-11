# Problem 1 : https://leetcode.com/problems/product-of-array-except-self/
# Time complexity : O(n)
# Space Complexity : O(1)

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        arr = [1]* len(nums)

        ##running product
        ## creating a running product from right
        ## and then going from left to right and multiplying to the same product
        ## because the product will be all the elements on the left and right
        ## finally returning the arr
        rp =1
        for i in range(len(nums)):
            arr[i] = arr[i] * rp
            rp = rp *nums[i]
            
        rp =1
        for i in range(len(nums)-1,-1,-1):
            arr[i] = arr[i] * rp
            rp = rp * nums[i]
              
        return arr


# Problem 2: https://leetcode.com/problems/diagonal-traverse/
# Time complexity : O(n)
# Space Complexity : O(1)

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        rows = len(matrix)
        cols = len(matrix[0])

        ## we can either go up or down, introducing a flag to store the condition
        ## and then identifying what will be the next r.c
        ## 

        r,c = 0,0
        direction = True ##up
        res = []
        while r<rows and c<cols:
            res.append(matrix[r][c])
            ## find out next cell, in case direction is up
            if direction:
                ## to check if row becomes out of bound
                if r ==0 and c!= cols-1 :
                    c+=1
                    direction = False
                ## if col becomes out of bound    
                elif c == cols-1:
                    r+=1
                    direction = False
                ## if none of of the above condition, then just do this for next element
                else:
                    r-=1
                    c+=1            
            else:
                ## base case to check out of bounds
                if c ==0 and r!= rows-1 :
                    r+=1
                    direction = True
                ## base case to check row out of bound
                elif r == rows-1:
                    c+=1
                    direction = True
                ## if none of the condition just get the next element
                else:
                    c-=1
                    r+=1
        return res 
                
# Problem 3 : https://leetcode.com/problems/spiral-matrix/description/
# Time complexity : O(n)
# Space Complexity : O(1)


class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        rows = len(matrix)
        cols = len(matrix[0])

        ## four pointer for squeezing the array
        ## we can squeeze the array for next iteration
        top,left =0,0
        bottom = rows-1
        right = cols-1

        res = []
        
        while left<=right and top<=bottom:
            ## printing rows
            for j in range(left,right+1):
                res.append(matrix[top][j])
            top+=1
            ## printing cols from last onwards
            ## checking the while loop base condition because it is changing
            if top<=bottom:
                for j in range(top,bottom+1):
                    res.append(matrix[j][right])
                right -=1
            ## print rows from bottom
            ## checking the while loop base condition because it is changing
            if top<=bottom:
                for j in range(right,left-1,-1):
                    res.append(matrix[bottom][j])
                bottom-=1
            ## printing cols from starting
            ## checking the while loop base condition because it is changing
            if left<=right:
                for j in range (bottom,top-1,-1):
                    res.append(matrix[j][left])
                left +=1
        
        return res

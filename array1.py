#Problem 1: Product of Array Except Self
#Time Complexity: O(n)
#Space Complexity: O(1) (if we don't count result array)
#Did this code successfully run on leetcode: yes

'''
idea: We can have the ouput array initialized with the running multiplications from last index to first index.
We multiply one by one until the last. At the same time we do the same thing from first index to last index
directly on nums. More precisely, at index i of nums, we have the running sum until i (excluded), for the other array
we have the running sum from the last element until i, excluded. Then we multiply the two arrays for the result.

'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #edge case
        if not nums:
            return []
        res=nums[:]
        prev=1
        for i in reversed(range(len(nums))):
            temp=res[i]
            res[i]=prev
            prev*=temp
        prev=1
        for i in range(len(nums)):
            temp=nums[i]
            nums[i]=prev
            prev*=temp
        for i,num in enumerate(nums):
            res[i]*=num
        return res

#Problem 2: Spiral Matrix
#Time Complexity: O(n) (elements in matrix)
#Space Complexity: O(1) (if we don't count result array)
#Did this code successfully run on leetcode: yes
'''
Main idea: This is just an implementation problem and there isn't much
optimisation since we are going to go through the array. We create a function that checks
if the next step is valid, if not ,we change direction, if it is, we transform the value, after
appending to results, to None (so we know it's invalid after that). We keep a counter of the elements
and exit the loop when there are no elements left

'''


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        def is_not_none(i,j):
            if matrix[i][j] is not None:
                return True
            else:
                return False
        def is_valid_and_next(i,j,direction):
            #the index coming in will always be valid
            #returns the next index given a direction and if it's valid
            if direction==0:
                j+=1
                if j<len(matrix[0]) and is_not_none(i,j):
                    return (i,j,True)
            elif direction==1:
                i+=1
                if i<len(matrix) and is_not_none(i,j):
                    return (i,j,True)
            elif direction==2:
                j-=1
                if j>=0 and is_not_none(i,j):
                    return (i,j,True)
            elif direction==3:
                i-=1
                if i>=0 and is_not_none(i,j):
                    return (i,j,True)
            return (-1,-1,False)

        #edge case
        if not matrix:
            return []
        #since we put in the first element already
        remaining=len(matrix[0])*len(matrix)-1
        directions=[0,1,2,3]
        i,j,direction=0,0,0
        res=[matrix[i][j]]
        matrix[i][j]=None
        while remaining>0:
            next_i,next_j,is_valid=is_valid_and_next(i,j,direction)
            if is_valid:
                i,j=next_i,next_j
                res.append(matrix[i][j])
                matrix[i][j]=None
                remaining-=1
            else:
                direction=(direction+1)%4
        return res

#Problem 3: Diagonal Traverse
#Time Complexity: O(n) (elements in matrix)
#Space Complexity: O(1) (if we don't count result array)
#Did this code successfully run on leetcode: yes

'''
We see that when we go out of bounds, if the direction is up, we check if the on the right is available, if not the one down.
If we're going down, we check if the one down is available, if not , we go up. Everytime we go out of bound we switch direction
'''
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        def is_valid(i,j):
            if 0<=i<len(matrix) and 0<=j<len(matrix[0]):
                    return True
            return False
        def next_element(i,j,direction):
            #returns the next element and if it's valid
            if direction==0:
                i-=1
                j+=1
            if direction==1:
                j-=1
                i+=1
            return (i,j)
        def next_start(i,j,direction):
            #if it's not valid give the next starting point
            if direction==0:
                if is_valid(i,j+1):
                    return (i,j+1)
                else:
                    return (i+1,j)
            if direction==1:
                if is_valid(i+1,j):
                    return (i+1,j)
                else:
                    return (i,j+1)
        #edge case:
        if not matrix:
            return []
        i,j,direction=0,0,0
        res=[matrix[i][j]]
        remaining=len(matrix)*len(matrix[0])-1

        while remaining>0:
            next_i,next_j=next_element(i,j,direction)
            if is_valid(next_i,next_j):
                i,j=next_i,next_j
                res.append(matrix[i][j])
                remaining-=1
            else:
                i,j=next_start(i,j,direction)
                direction=(direction+1)%2
                res.append(matrix[i][j])
                remaining-=1
        return res

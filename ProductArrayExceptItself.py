# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

## we need to find the left product and right product of a number and multiply them. We need to store the running product for every element.
## we create a new array(auxilary data structure) and in the first pass pass from left to right(starting from 1 as the left product of 0th element wil be 1) we keep multiplying the previous element and stor it in the array
## we do another pass fromm right to left(starting from last but one element) this is because the right product of last element is 1 itself, so 1 * left = left
##  in the end we get a resultant array of left*right and we return it
# # // Your code here along with comments explaining your approach

class Solutoin:
    def product(Self, nums):

        res = [1]* len(nums)
        temp = 1
        for i in range(1,len(nums)):
            temp *= nums[i-1]
            res[i] *= temp
            
        
        temp =1

        for i in range(len(nums)-2,-1,-1):
            temp *= nums[i+1]
            res[i]*=temp
        
        return res
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 


def product(nums):
    
    left = [0 for _ in range(len(nums))]
    product = 1

    #left
    for i in range(0, len(nums)):
        left[i] = product
        product = product * nums[i]

    #right
    product =1
    for i in range(len(nums)-1, -1, -1):
        left[i] = left[i] * product
        product = product * nums[i]
    
    return left
    

print product([1,2,3,4])

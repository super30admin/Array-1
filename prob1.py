# Time Complexity : O(N)
# Space Complexity : O(N) for left and right arrays
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : find the left product, 
# right product and the result is the product of left and right 
def prodself(nums):
    
    n = len(nums)
    left = [0] * n
    right = [0] * n
    left[0] = 1
    right[n-1] = 1
    
    for i in range(1, n):
        left[i] = left[i-1] * nums[i-1]
    
    for i in range(n-2, -1, -1):
        right[i] = right[i+1] * nums[i+1]
    
    return [left[i] * right[i] for i in range(n)]

nums = [1,2, 3, 4]
print(prodself(nums))
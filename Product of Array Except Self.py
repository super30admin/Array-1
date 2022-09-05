# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
def productExceptSelf(nums):
    n = len(nums)
    res = [1]* n
    
    if nums == None or len(nums) == 0:
        return res
    rp = 1
    #left pass
    for i in range(n):
        res[i] *= rp
        rp = rp * nums[i]
        
    rp = 1
    #right pass
    for i in range(len(nums) - 1,-1,-1):
        res[i] *= rp 
        rp = rp * nums[i]
        
    return res
nums = [1,2,3,4]
print(productExceptSelf(nums))
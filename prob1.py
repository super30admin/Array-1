# Time Complexity : O(N)
# Space Complexity : O(1) as no extra space
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : find the left product, 
# right product and the result is the product of left and right 
def prodself(nums):
    
    n = len(nums)
    res = [1] * n
    lp = 1

    for i in range(1, n):
        lp = lp * nums[i-1]
        res[i] = lp
    
    rp = 1
    for j in range(n-2, -1, -1):
        rp = rp * nums[j+1]
        res[j] *= rp
    
    return res
    
    

nums = [1,2, 3, 4]
print(prodself(nums))
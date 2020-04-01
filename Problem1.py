# Time Complexity = O(n) (two parse)
# Space Complexity = O(1)
# Works on leetcode

def productexceptself(nums):
    running_prod = 1
    res = []
    for i in range(len(nums)):
        res.append(running_prod)
        running_prod*=nums[i]
    running_prod = 1
    for i in range(len(nums)-1,-1,-1):
        res[i]*=running_prod
        running_prod*=nums[i]
    return res


print(productexceptself([1,2,3,4,5]))


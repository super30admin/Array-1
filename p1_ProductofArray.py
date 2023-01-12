#238. Product of Array Except Self

# // Time Complexity : 3n -> O(n)
# // Space Complexity : 2n -> O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // code here along with comments explaining approach

# using forward sum and reverser sum

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        rp = 1 # running product
        fsum,rsum = [],[]
        res = []
        for i in range(0,n): # forward sum O(n)
            rp = rp*nums[i]
            fsum.append(rp)
        print(fsum)
        rp =1
        for i in range(n-1,-1,-1): # reverse sum O(n)
            rp = rp*nums[i]
            rsum.append(rp)
        print(rsum)
        res = [rsum[n-2]]
        for i in range(1,n-1): # O(n)
            res.append(fsum[i-1] * rsum[n-2-i])
        res.append(fsum[n-2]) # lastr element
        return res
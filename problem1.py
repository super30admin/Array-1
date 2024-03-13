# Time complexity is O(N) and space complexity is O(N)
class Solution:
    def productofarray(self, nums):
        l = [0]*len(nums)
        r = [0]*len(nums)
        res = [0]* len(nums)
        N = len(nums)
        l[0] = 1
        for i in range(1, N):
            l[i] = l[i-1]*nums[i-1]
            
        r[N-1] = 1
        for j in reversed(range(0, N-1)):
            r[j] = r[j+1]*nums[j+1]
            
        for i in range(N):
            res[i] = l[i]*r[i]
            
        return res
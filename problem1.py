'''
238. Product of Array Except Self
TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)
LEETCODE: Yes
DIFFICULTY: Nope, although I had watched the class.

'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # brute force
        n = len(nums)
        l = [1 for i in range(0, n)]
        
        for i in range(1, n):
            l[i] = l[i-1] * nums[i-1]
        
        t1 = 1
        for i in range(n-2, -1, -1):
            rl = t1 * nums[i+1]
            t1 = rl
            l[i] *= rl
            
        
        return l

"""238. Product of Array Except Self
Time Complexity: O(n)
Space Complexity: O(1)"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        answer = [0]*n
        answer[0] = 1
        for i in range(1,n):
            answer[i] = answer[i-1]*nums[i-1]
        post = 1
        for i in reversed(range(n)):
            answer[i] = answer[i]*post
            post *=nums[i]
        return answer
            
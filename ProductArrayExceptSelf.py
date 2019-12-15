
class Solution:
    def productExceptSelf1(self, nums):
        # Time Complexity : O(N)
        # Space Complexity : O(2N)
        # Did this code successfully run on Leetcode : YES

        L = [0] * len(nums)
        R = [0] * len(nums)
        answer = [0] * len(nums)


        L[0] = 1
        R[len(nums)-1] = 1

        for i in range(1, len(nums)):
            L[i] = L[i-1] * nums[i-1]

        for i in reversed(range(len(nums)-1)):
            R[i] = R[i+1] * nums[i+1]

        for i in range(len(nums)):
            answer[i] = L[i] * R[i]
            
        return answer

    def productExceptSelf2(self, nums):
        # Time Complexity : O(N)
        # Space Complexity : O(1)
        # Did this code successfully run on Leetcode : YES
    
        answer = [0] * len(nums)
        answer[0] = 1

        for i in range(1, len(nums)):
            answer[i] = nums[i-1] * answer[i-1]

        R = 1
        for i in reversed(range(len(nums))):
            answer[i] = answer[i] * R 
            R = R * nums[i]

        return answer


output = Solution()
print(output.productExceptSelf2([1,2,3,4]))

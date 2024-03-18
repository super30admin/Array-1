#T.C. O(n), as we iterate through the array
#S.C. O(n), since we declare two more array

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)

        L,R, result = [0]*n, [0]*n, [0]*n

        L[0] = 1
        for i in range(1, n):
            L[i] = nums[i-1] * L[i-1]
        R[n - 1] = 1
        for i in reversed(range(n - 1)):
            R[i] = nums[i+1] * R[i+1]
        for i in range(n):

            result[i] = L[i] * R[i]
        return result

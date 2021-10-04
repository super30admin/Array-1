
# Time complexity: O(N)
# Space Complexity:O(N)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        # The length of the input array
        length = len(nums)

        # The left and right arrays as described in the algorithm
        L, R, answer = [0]*length, [0]*length, [0]*length
        L[0] = 1
        for i in range(1, length):


            L[i] = nums[i - 1] * L[i - 1]

        R[length - 1] = 1
        for i in reversed(range(length - 1)):


            R[i] = nums[i + 1] * R[i + 1]


        for i in range(length):

            answer[i] = L[i] * R[i]

        return answer

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Time Complexity: O(N)
        # Space Complexity: O(N)
        arrPost = [1]
        for i in range(len(nums)-1):
            arrPost.append(arrPost[i] * nums[i])
        arrPre = [1]
        for i in range(len(nums)-1, -1,-1):
            arrPre.append(arrPre[len(nums)-1-i] * nums[i])
        arrPre = arrPre[0:len(arrPre)-1]
        arrPre = arrPre[::-1]
        res = []
        for j in range(len(arrPre)):
            res.append(arrPost[j] * arrPre[j])

        return res


####
# TC: 3*O(n) = O(n) to create left array, right array and then multiple results and form output array
# SC: 2*O(n)) as left and right auxiliary arrays created to store left and right results

# class Solution(object):
#     def productExceptSelf(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: List[int]
#         """

#         n = len(nums)

#         left = [1] * n
#         right = [1] * n
#         out = [1] * n

#         if n <= 1 or nums is None:
#             return -1

#         left[0] = 1

#         for i in range(1, n):
#             left[i] = nums[i-1] * left[i-1]

#         right[n-1] = 1

#         for i in range(n-2, -1, -1):
#             right[i] = nums[i+1] * right[i+1]

#         print(left)
#         print(right)
#         for i in range(n):
#             out[i] = left[i] * right[i]

#         return out


# obj = Solution()
# print(obj.productExceptSelf([1, 2, 3, 4]))


####
# TC: 2*O(n) = O(n)
# SC: O(1) as no extra space is used. output and input not counted in SC

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        n = len(nums)

        out = [1] * n
        temp = 1

        if n <= 1 or nums is None:
            return -1

        out[0] = 1

        for i in range(1, n):
            out[i] = nums[i-1] * out[i-1]

        for i in range(n-2, -1, -1):
            temp = temp * nums[i+1]
            out[i] = out[i] * temp
        return out


obj = Solution()
print(obj.productExceptSelf([1, 2, 3, 4]))

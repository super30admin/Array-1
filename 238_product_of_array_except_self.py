from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
            // Time Complexity : O(N)
            // Space Complexity : O(1)
                    the problem states the result array is not considered in extra space
            // Did this code successfully run on Leetcode :
                    yes
            // Three line explanation of solution in plain english
                    - For each element at index i, we first calculate the
                    product of the left side
                    - While calculating the find product of it the left and
                    right side, accumulate the right hand product
                    - The first and last index don't have a left and right respectively,
                    say they have a product 1.
        """
        length = len(nums)
        result = [1] * length
        for i in range(1, length):
            result[i] = result[i - 1] * nums[i - 1]

        right = nums[length - 1]
        for i in reversed(range(length - 1)):
            result[i] = result[i] * right
            right = right * nums[i]
        return result

    def product_except_self_linear_space(self, nums: List[int]) -> List[int]:
        """
            // Time Complexity : O(N)
            // Space Complexity : O(2N) or O(N)
        """
        left_arr = [1] * len(nums)
        right_arr = [1] * len(nums)
        for i in range(1, len(nums)):
            left_arr[i] = left_arr[i - 1] * nums[i - 1]
        # for i in range(len(nums) - 2, -1, -1):
        for i in reversed(range(len(nums) - 1)):
            right_arr[i] = right_arr[i + 1] * nums[i + 1]
        for i in range(len(nums)):
            nums[i] = left_arr[i] * right_arr[i]
        return nums

    def product_except_self_with_division(self, nums: List[int]) -> List[int]:
        """
            // Time Complexity : O(N)
                'N' is the number of elements in nums
            // Space Complexity : O(1)
        """
        # edge case
        if not nums:
            return []

        result = 1
        result_zero = None
        count_zero = 0
        for i in nums:
            if i == 0:
                count_zero += 1
                if count_zero > 1:
                    result = 0
                else:
                    result_zero = 0
                continue
            result *= i
        for i in range(len(nums)):
            if nums[i] == 0:
                nums[i] = result
            elif result_zero is not None:
                nums[i] = result_zero
            else:
                nums[i] = result // nums[i]
        return nums


if __name__ == '__main__':
    h = Solution()
    print(h.productExceptSelf([1, 2, 3, 4]))
    print(h.productExceptSelf([0, 0]))
    print(h.productExceptSelf([1, 0]))
    print(h.product_except_self_linear_space([1, 2, 3, 4]))
    print(h.product_except_self_linear_space([0, 0]))
    print(h.product_except_self_linear_space([1, 0]))
    print(h.product_except_self_with_division([1, 2, 3, 4]))
    print(h.product_except_self_with_division([0, 0]))
    print(h.product_except_self_with_division([1, 0]))

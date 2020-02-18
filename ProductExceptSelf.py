class ProductExceptSelf(object):
    '''
    Solution:
    1. The main idea is that the output at a particular index is the product of all elements towards left and
        product of all elements towards right.
    2. So maintain running product towards right in one iteration (in an array) and update by multiplying the product
        by calculating running product from left.
    3. Return the resulting array

    --- Passed all testcases on leetcode
    '''
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # O(n) Time Complexity | O(1) Space Complexity
        if (nums == None or len(nums) == 0):
            return []

        rProd = 1
        result = [1]

        for i in range(1, len(nums)):
            rProd = nums[i - 1] * result[i - 1]
            result.append(rProd)

        lProd = 1

        for i in range(len(nums) - 1, -1, -1):
            result[i] = lProd * result[i]
            lProd *= nums[i]

        return result
class Solution(object):
# tc : O(2n) 2 for loops -> O(n)
# sc : O(1) no extra space used just variables which is O(1), the product array is the output array of space n and given
# The output array does not count as extra space for space complexity analysis
# // Did this code successfully run on Leetcode : Yes

    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # since we cannot use division operation
        # at every point I will need left of the elements product and right of the elements product
        # first traversing left of each index and saving the left product at that index in an product_array
        # and then have one more for loop to multiple the left product with the right product at that index 
        # will return the product array which is the product of all elemenst except self

        
        product_array = [1]*len(nums)

        right_product = 1
        left_product = 1

        for i in range(1,len(nums)):
            left_product = left_product*nums[i-1]
            product_array[i] = left_product

        for i in range(len(nums)-2, -1, -1):
            right_product = right_product*nums[i+1]
            product_array[i] = product_array[i]*right_product

        return product_array



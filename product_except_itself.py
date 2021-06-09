# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def productExceptSelf(self, nums):
        #         Initializing the output array
        product_arr = [0] * len(nums)
        #     maianting running product
        product = 1
        #     Initialize first value as 1
        product_arr[0] = 1
        #         Creating left pass multiplication
        for i in range(1, len(nums)):
            #         product will be current product * previous number
            product = nums[i - 1] * product
            #     and now asign that value to product
            product_arr[i] = product

        # print(product_arr)
        #         To do the same for right hand  side check reset product to 1
        product = 1
        #         Start from end of the array and update the values in product array for final sum except self
        for i in range(len(nums) - 2, -1, -1):
            product = product * nums[i + 1]
            product_arr[i] = product_arr[i] * product

        # print(product_arr)
        return product_arr
        """
        :type nums: List[int]
        :rtype: List[int]
        """

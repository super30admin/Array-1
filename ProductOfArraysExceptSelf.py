# Time complexity is O(n), n is the number elements in array
# space complexity is O(1), because we don not use any memory for computation

class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        length = len(nums)
        result = [1] * length
        product = 1
        # This is problem of running product
        # Product of Array Except self means product of number to the left of the element
        # and product of the element to the right of the element
        # If we iterate one loop which finds the product of element left of the array and
        # second loop which gives the product of the elements to the right of the element
        # then we mulitply both array and get products except self

        # This is the one solution
        # pre = 1
        # post = 1
        # for i in range(length):
        #     result[i] *= pre
        #     pre *= nums[i]
        #     result[length-1-i] *= post
        #     post *= nums[length-1-i]
        # return result

        # This is the second solution
        for i in range(1, length):
            product = product * nums[i-1]
            result[i] = product

        product = 1

        for i in range(length-2, -1, -1):
            product = product * nums[i+1]
            result[i] *= product

        return result

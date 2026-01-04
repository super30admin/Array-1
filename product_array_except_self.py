class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        left_product_arr = [1]*(len(nums)+1)

        right_product_arr = [1]*(len(nums)+1)

        res = [1]*(len(nums))

        left_sum = 1

        right_sum = 1

        for i in range(len(nums)):

            left_sum*=nums[i]
            right_sum*=nums[len(nums)-1-i]

            left_product_arr[i+1] = left_sum
            right_product_arr[len(nums)-1-i] = right_sum


        for i in range(len(nums)):

            res[i] = left_product_arr[i]*right_product_arr[i+1]


        return res



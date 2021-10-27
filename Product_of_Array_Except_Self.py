class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = [1] * (len(nums))
        
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) -1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res


        # final = []
        # # nums.sort()
        # product = reduce((lambda x, y: x * y), nums)
        # # print(product)
        # for i,val in enumerate(nums):
        #     if val == 0:
        #         nums_temp = nums[:i]+nums[i+1:]
        #         product_temp = reduce((lambda x,y: x * y),nums_temp)
        #         print(product_temp)
        #         final.append(product_temp)
        #     else:
        #         print(product,val)
        #         final.append(product/val)
            
        # return final
        
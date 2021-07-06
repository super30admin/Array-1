from collections import Counter
import math
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums)<2:
            return [0]
        # count = Counter(nums)
        # if count[0]>1:
        #     return [0]*len(nums)
        # ans_prod = math.prod(nums)
        # ans_list=[]
        # if ans_prod == 0:
        #     ans_without_zero=1
        #     for i in range(len(nums)):
        #         if nums[i]!=0:
        #             ans_without_zero*=nums[i]
        #     for i in range(len(nums)):
        #         if nums[i]!=0:
        #             ans_list.append(0)
        #         else:
        #             ans_list.append(ans_without_zero)
        # else:
        #     for i in range(len(nums)):
        #         ans_list.append(ans_prod//nums[i])
        # return ans_list
        left_prod = [1]*len(nums)
        right_prod = [1]*len(nums)
        final_ans = []
        for i in range(1,len(nums)):
            left_prod[i] = (left_prod[i-1]*nums[i-1])
        R = 1 
        for i in (reversed(range(len(nums)))):
            ans = R*left_prod[i]
            R = R*nums[i]
            nums[i] = ans
        return nums
#Time: O(n)
#Space: O(n)
class Solution:
    # leetcode URL : https://leetcode.com/problems/product-of-array-except-self/
    # Problem : 238. Product of Array Except Self
    # Time Complexity : O(n)
    # Space Complexity : O (1)
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ret_list = list()
        pref_prod = 1
        suff_prod = 1
        for i in range(0,len(nums)):
            ret_list.append(pref_prod)
            pref_prod = pref_prod * nums[i]
        i = len(nums)-1
        
        while i>=0:
            ret_list[i]  =  ret_list[i]*suff_prod
            suff_prod = suff_prod*nums[i]
            i = i-1
        
        return ret_list
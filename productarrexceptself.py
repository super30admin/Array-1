#time complexity:o(n)
#space complexity:o(n)
#passed all cases on LeetCode: yes
#difficulty faced:-
# comments:
class Solution:
    def productExceptSelf(self, nums: 'List[int]') -> 'List[int]':
        
        #2 ptr approach
        # we run 2 pointers one from left and 1 from right 
        n = len(nums) - 1
        #these left and right are actually left product and right product
        #we store the product of left side elemets to the one we are in in left and right side element to one we are at to the right
        left,right = 1,1
        res = [1]*len(nums)
        
        #i and n-i are are two array indexes 
        for i in range(0,len(nums)):
            res[i] *= left
            res[n-i] *=  right
            left *= nums[i]
            right *= nums[n-i]
            
        return res
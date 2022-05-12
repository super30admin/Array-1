'''
time complexity: O(n)
space complexity: O(1)
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        '''
        1 2 3 4
        1 1 2 6
        24  12  4  1
        '''
        
        ans =[0 for i in range(len(nums))]
        
        ans[0] = 1
        #1st itteration
        for i in range(1,len(nums)):
            ans[i] = ans[i-1]*nums[i-1]

        temp = 1
        for i in range(len(nums)-1,-1,-1):
            ans[i] = temp*ans[i]
            temp *= nums[i]
        
        return ans
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        product =1
        zero_index = []
        for i in range(len(nums)):
            if nums[i] != 0:
                product = product*nums[i]
            else :
                zero_index.append(i)
        
        if len(zero_index)>1:
            return [0]*len(nums)
        elif len(zero_index)==1:
            temp = [0]*len(nums)
            temp[zero_index[0]] = product
            return temp
            
        else :
            for i in range(len(nums)):
                nums[i] = product//nums[i]
            
        return nums

        #time complexity  O(n) [iterate array twice]
        #space complexity O(n) [ zero index array]
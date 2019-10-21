#Time Complexity - O(n)
#Space Complexity - O(n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        left_prod = [0]*length
        left_prod[0] = 1
        for i in range(1,length):
            left_prod[i] = left_prod[i-1] * nums[i-1]
        right_prod = [0]*length
        right_prod[length-1] = 1 
        for j in reversed(range(len(nums)-1)):
            right_prod[j] = right_prod[j+1] * nums[j+1]
        output = [0]*length
        for i in range(length):
            output[i]=left_prod[i]*right_prod[i]
        return output
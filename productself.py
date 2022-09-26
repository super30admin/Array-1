'''
Time Complexity: O(N)
Space Complexity: O(1)
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp1 = 1
        rp2 = 1
        temp_arr = []
        for i in range(0, len(nums)):
            if(i==0):
                temp_arr.append(rp1)
            else:
                rp1 = rp1*nums[i-1]
                temp_arr.append(rp1)
        for i in range(len(temp_arr)-2, -1, -1):
            rp2 = rp2*nums[i+1]
            temp_arr[i] = temp_arr[i]*rp2
        return temp_arr
        
# TC : O(n)
# SC : O(n)

class Solution:
    def productExceptSelf(self, nums: List[int]):
        # Take running sum from L-> R and R-> L
        
        left_running_sum_array = [1]
        for i in range(1,len(nums)):
            left_running_sum_array.append(nums[i-1] * left_running_sum_array[i-1])
                
        right_running_sum_array = [1 for i in range(len(nums))]
        for i in range(len(nums)-2,-1,-1):
            right_running_sum_array[i] = right_running_sum_array[i+1] * nums[i+1]
        return (left_running_sum_array)
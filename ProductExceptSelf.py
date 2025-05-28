# Time Complexity - o(n)
# Space Complexity - o(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        r_p = 1
        result = [1]

        for i in range(1,len(nums)):
            r_p = nums[i-1]*r_p
            result.append(r_p)

        r_p = 1
        for i in range(len(nums)-2,-1,-1):
            r_p = nums[i+1]*r_p
            result[i] = result[i]*r_p

        

        return result
        

            
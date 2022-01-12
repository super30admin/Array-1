class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == None: return[]
        n = len(nums)
        result = []
        rp = 1
        result.append(rp)
        for i in range(1, n):
            rp = rp * nums[i - 1]
            result.append(rp)
            
        rp = 1
        m = len(nums)-2
        print(m)
        for i in range(m, -1, -1):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp
            
        return result


#T.C => O(n)
#S.C => O(n)
#Approach => In this approach we have traversed from left to right and stored all the resulting sum in one of the array. 
# For the second pass we have traversed from right to left and also is being multiplied with elemets in result array.  
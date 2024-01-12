class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == 0 or len(nums) == 0:
            return []
        n = len(nums)
        rp = 1
        result = [0 for i in range(n)]
        result[0] = 1
        for i in range(1,n):
            rp = rp*nums[i-1]
            result[i] = rp
        rp = 1
        for i in range(n-2,-1,-1):
            rp = rp*nums[i+1]
            result[i] = result[i] * rp
        return result




# class Solution:
    # def productExceptSelf(self, nums: List[int]) -> List[int]:
        # if nums == 0 or len(nums) == 0:
            # return []
            
        # n = len(nums) #4
        # rp = 1
        # left = [1]
        # right = [1]

        # for i in range(1,n):
            # rp = rp*nums[i-1]
            # left.append(rp)
        # rp = 1
        # for i in range(n-1,0,-1):
            # rp = rp*nums[i]
            # right.append(rp)  
        # right = right[::-1]    
  
        # return [left[i]*right[i] for i in range(n)]
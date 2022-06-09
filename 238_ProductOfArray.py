# time complexity: O(n)
# space complexity: O(1)

class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)

       
        if nums == None or n == 0:
            return result

        result = [0 for i in range(n)]
        result[0] = 1

        # left product
        # set Running product 1, so for the first element left rp = 1
        # for ex: [1,2,3,4] -> here for nums[0] , there are no any left element so for this rp = 1
        rp = 1

        # iterate from second element of the nums 
        for i in range(1,n):
            # from the second element, there are left elements, so rp * nums[i-1]. 
            # reason to multiplt nums[i-1] is, previous rp is calculated for nums[i-1] 
            rp = rp * nums[i-1]
            # store that rp into result array. 
            result[i] = rp
            # leftProduct = [1,1,2,6]

        # right product
        # set Running product 1, so for the last element left rp = 1
        # for ex: [1,2,3,4] -> here for nums[3] , there are no any right element so for this rp = 1
        rp = 1

        # iterate from last second element of the nums 
        for j in range(n-2,-1,-1):
            # from the second-last element, there are right elements, so rp * nums[j+1]. 
            # reason to multiplt nums[j+1] is, previous rp is calculated for nums[j+1] 
            rp = rp * nums[j+1]

            # mute the result array. so multipy right product and left product
            result[j] = rp * result[j]
        return result
    
obj = Solution()
print(obj.productExceptSelf([1,2,3,4]))
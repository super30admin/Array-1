
#Approach:
# Take left product and right product. Then multiply both to get the final outcome
# left product would be running product till lp[i-1] and nums[i-1]
# same for right product but use -i for nums array and finally reverse the rp list
#TC: O(n) SC:O(2n) as we created 2 lists but dropping constants O(n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        lp, rp = [1],[1]
        
        for i in range(1,len(nums)):
            lp.append(nums[i-1]*lp[i-1])
            
        for i in range(1, len(nums)):
            rp.append(nums[-i]*rp[i-1])
        
        rp = list(reversed(rp))
        
        return [lp[i]*rp[i] for i in range(len(nums))]




#Approach:
# Take left product and right product. Then multiply both to get the final outcome
# left product would be running product till lp[i-1] and nums[i-1]
# same for right product but use -i for nums array and finally reverse the rp list
#TC: O(n) SC:O(1) as we only used one lp array that we return as a result - so not counted against SC
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        lp, rp = [1], 1
        
        for i in range(1,len(nums)):
            lp.append(nums[i-1]*lp[i-1])

        
        for i in range(1, len(nums)):
            # calculate rp and update it constantly
            rp = (nums[-i]*rp)
            # multiply with value in lp
            # e.g. first rp in this loop would get multiplied with index -2 of the lp, then -3 and -4th indices
            # hence we do `-i-1`
            lp[-i-1] *= rp
        
        
        return lp

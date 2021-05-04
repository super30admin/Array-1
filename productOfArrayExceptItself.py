class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        rp = 1
        solution = []
        solution.append(1)
        for i in range(1,len(nums)):
                rp = rp*nums[i-1]
                solution.append(rp)
                
        rp = 1        
        for i in range(len(nums)-2,-1,-1):
            rp = rp*nums[i+1]
            solution[i] *= rp
            
        return solution
    
#  Approach is to create  a solution array, first iterate from left to right with running product rp upto that element.
#  Now go the other way and do the in the reverse manner. 

#  Time complexity is O(n)

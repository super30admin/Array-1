# Time Complexity :
# O(n)

# Space Complexity :
# o(1)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english
# I have replaced each element of input array with the product of all the elements left of it and all the elements right of it.

# Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp = 1 
        rpl = []  # left running product array
        
        # creating an array that contains left running product of each element of nums array
        for i in range(len(nums)):
            
            if i == 0:
                rpl.append(1)
            else:
                rpl.append(nums[i-1]*rp)
                rp = nums[i-1]*rp
                
        rp = 1
         
        # Mordifying left running product array by multiplying each element of it by right running product
        # of that index element of nums array
        for j in range(len(nums)-1, -1, -1):
        
            if  j == len(nums)-1:
                rpl[j] = rpl[j]*1
            else:
                rpl[j] = rpl[j]*nums[j+1]*rp
                rp = nums[j+1]*rp
            
        return rpl
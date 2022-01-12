#LC_238 - Product of Array Except Self
# Time Complexity - O(N)
# Space Complexity - O(N)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        N = len(nums)
        
        prefix_array = [1]*(N+1)
        suffix_array = [1]*(N+1)
        
        # Using N+1 to include N
        for i in range(1,N+1): 
            prefix_array[i] = prefix_array[i-1] * nums[i-1]
            
        # Traverse in reverse
        for i in reversed(range(1,N+1)): 
            suffix_array[i-1] = suffix_array[i] * nums[i-1]
        
        ans = []
        for i in range(N):
            ans.append(prefix_array[i] * suffix_array[i+1])
        return ans


class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        
        low = 0
        
        high = len(nums)-1
        
        while(low <= high):
            
            mid = low + (high - low)//2
            print(mid)
            if((mid ==0 or nums[mid] > nums[mid-1]) and (mid == len(nums) - 1 or nums[mid] > nums[mid+1]) ):
                
                return mid
            elif mid !=0 and nums[mid-1] > nums[mid]:
                high = mid -1
            else:
                low = mid +1
                
        
                 
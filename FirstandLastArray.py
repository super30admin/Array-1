class Solution:
    def binarySearchFirst(self,nums,target):
        low = 0
        high = len(nums)-1
        
        while(low <= high):
            
            mid = low +(high - low)//2
        
            if(nums[mid] == target):
                if( mid == 0 or nums[mid - 1 ] != nums[mid]):
                  
                    return mid
                else:
                    high = mid -1
            elif(nums[mid] > target):
             
                high = mid -1
            else:
                low = mid +1
            
        return -1
    
    def binarySearchLast(self,first,nums,target):
        
        low = first
        high = len(nums)-1
        
       
        
        while(low <= high):
            
            mid = low + (high - low)//2
        
            if(nums[mid] == target):
                if(mid == len(nums)-1 or nums[mid+1] !=nums[mid] ):
                    return mid
                else:
                    low = mid +1
            elif nums[mid] > target:
                high = mid -1
            else:
                low = mid + 1
        return -1
                
                
        
    
    
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
        if len(nums) != 0:
            if nums[0] == target and nums[len(nums)-1] == target:
                return [0,len(nums)-1]
            if nums[0] > target or nums[len(nums)-1] < target:
                return [-1,-1]
           
            first = self.binarySearchFirst(nums,target)
           
            if first == -1:
                return[-1,-1]
            last = self.binarySearchLast(first,nums,target)
            return [first,last]
        else:
            return [-1,-1]
    
 
                
                    
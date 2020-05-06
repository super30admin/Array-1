# Time Complexity: O(N) +O(M) where O(N) time taken to traverse left side of array and O(M) is time taken to traverse right side of array
# Space Complexity: O(1) as Output array result is not considered as extra space in single array calculation is done
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = []
        result.append(1)
        main = 1
        i = 1
        while i < len(nums):
            main = nums[i-1]*main
            result.append(main)
            i+=1
        j = len(nums)-2
        main = 1
        while j>=0:
            main = nums[j+1]*main
            result[j] = result[j]*main
            j-=1
        return result
        
            
        
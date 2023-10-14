class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        print(f"nums={nums}")
        product = 1
        
        """
        Time Complexity: O(n) - 2 passes of array 
        Space Complexity: O(n) - 2 auxiliary arrays are produced to keep track of left and right products
        Did this code successfully run on Leetcode: Yes
    
        Any problem you faced while coding this: No
    
        """

        left_nums=[0]*len(nums)
        right_nums=[0]*len(nums)

        # Setup the left array
        left_nums[0] = 1
        left_nums[1] = nums[0]
        for i in range(2, len(nums)):
            #print(f"i={i}")
            left_nums[i] = left_nums[i-1] * nums[i-1]
            i = i + 1
        print (f"left_nums={left_nums}")

        # Set up the right array
        right_nums[-1] = 1
        right_nums[-2] = nums[-1]
        # Range is decreasing. 
        # 2nd value = -1 => this will pick up the element at 0 since the 2nd value is excluded
        # Last value is the decreasing step = -1
        for i in range(len(nums)-3, -1, -1):
            print(f"nums[i]={nums[i]}")
            right_nums[i] = right_nums[i+1] * nums[i+1]
            i = i + 1
        print (f"right_nums={right_nums}")

        for i in range(0, len(nums)):
            nums[i] = left_nums[i] * right_nums[i]

        return nums
        

        

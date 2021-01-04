class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # Time Complexity: O(n)
        # Space Complexity: O(1)
        
        left = deque([1])
        for i in range(0,len(nums)-1):
            left.append(left[-1]*nums[i])
        '''
        right = deque([1])
        x = []
        for i in range(len(nums)-1,0,-1):
            right.appendleft(right[0]*nums[i])
        
        for i in range(0,len(nums)):
            x.append(left[i]*right[i])
        return x
        '''
        r = 1
        for i in range(len(nums)-1,-1,-1):
            left[i] = left[i] *r
            r = r*nums[i]
        
        return left

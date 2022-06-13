class Solution:
    # time complexity = O(n), space is just for output O(n). No extra space for prev and next products
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1] * len(nums)
        for i in range(1, len(nums)):
            output[i] = nums[i - 1] * output[i - 1]

        right = 1
        for i in range(len(nums) - 1, -1, -1):  # reverse range(start,stop,step) stop should be one before actual stop
            output[i] = right * output[i]
            right = right * nums[i]

        return output
    '''
        # using extra space for left and right product list 

        prev_prod = [1]*len(nums)
        next_prod = [1]*len(nums)
        output = [1]*len(nums)
        for i in range(1,len(nums)):
            prev_prod[i] = nums[i-1] * prev_prod[i-1]

        for i in range(len(nums)-2,-1,-1):  #reverse range(start,stop,step) stop should be one before actual stop
            next_prod[i] = nums[i+1] * next_prod[i+1]

        for i in range(len(nums)):
            output[i] = prev_prod[i] * next_prod[i]

        print(prev_prod, next_prod)
        return output

    '''


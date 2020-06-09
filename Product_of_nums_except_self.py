class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left_arr=[0]*len(nums)
        right_arr=[0]*len(nums)
        output_arr=[None]*len(nums)
        
        left_arr[0]=1
        right_arr[len(nums)-1]=1
        
        for i in range(1,len(nums)):
            left_arr[i]=nums[i-1]*left_arr[i-1]
        
        for i in range(len(nums)-1,0,-1):
            right_arr[i-1]=nums[i]*right_arr[i]
            
        l3=[i[0]*i[1] for i in list(zip(left_arr,right_arr))]
        return l3
        
#time complexity is O(n)
#Space complexity is O(n)

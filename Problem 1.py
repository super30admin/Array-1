class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length_of_array=len(nums)
        rp_f=1
        rp_b=1
        output_array=[1]*(length_of_array)
 
        for i in range(length_of_array):
           j = -i-1
           if(i==0):
             output_array[i]=rp_f*1
             output_array[j]=rp_b*1
           else:
            rp_f *= nums[i-1]
            output_array[i] *= rp_f
            rp_b *= nums[j+1] 
            output_array[j] *= rp_b   
        return output_array


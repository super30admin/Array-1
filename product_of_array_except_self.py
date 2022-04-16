class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        len_of_ip = len(nums)
        l = [0]*len_of_ip
        # right product array 
        l[0] = 1
        for i in range(1, len_of_ip):
            l[i] = l[i-1] * nums[i-1]
        # print(l)
        r = [0]*len(nums)
        r[-1] = 1
        #for i in range( len_of_ip-2,-1, -1):
        for i in reversed(range(len_of_ip - 1)):
            r[i] = r[i+1] * nums[i+1]
        # print(r)
        result = [0]*len_of_ip
        for i in range(len_of_ip):
            result[i] = l[i]*r[i]
        return result
         

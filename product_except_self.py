class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pref=[None for i in range(len(nums))]
        pref[0]=1
        postf=1
        l=[]
        for i in range(1,len(nums)):
            # temp=perf
            pref[i]=nums[i-1]*pref[i-1]

        for i in range(len(nums)-1, -1, -1):
            # print(i)
            l.append(pref[i]*postf)
            postf=nums[i]*postf
        return l[::-1]
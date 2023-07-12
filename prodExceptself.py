#TC:O(N)
#SC:O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre=[]
        pos=[]
        res=[]
        pro=1
        for n in nums:
            pro*=n
            pre.append(pro)
        pro=1
        for n in reversed(nums):
            pro*=n
            pos.append(pro)
        posi=list(reversed(pos))

        for i in range(len(nums)):
            if(i==0):
                res.append((1*posi[i+1]))
            elif(i==(len(nums)-1)):
                res.append(pre[i-1]*1)
            else:
                res.append(pre[i-1]*posi[i+1])
        return(res)
'''
#brute force-time-O(n*n)
#space-O(n) used a list to store but since we are given in the answer to return a list so it should be O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans=[]
        for i in range(0,len(nums)):
            multi=1
            for j in range(0,len(nums)):
                if i!=j:
                    multi=multi*nums[j]
            ans.append(multi)
        return ans'''
#time comp- O(n)
#space comp-O(1) not using any extra space
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        nums=[0]+nums[:]
        for i in range(0,len(nums)):
            index=abs(nums[i]) 
            #change value at the index 
            nums[index]=-abs(nums[index])
        print(nums)
        return [i for i in range(0,len(nums))   if nums[i]>0]
            
                

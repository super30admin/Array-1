#timecomplexity O(n)
#spacecomplexity O(1) becouse function is returning list created in list and returing that only
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums==[]: return []
        left=[]# storing left running first 
        prod=1# keep the prod(running product before the index) of left part of the index if index is 0 then default prod is 1
        #
        temp=1
        #left runing product before the index
        # 1 2 3 4
        # 1 1 2 6
        for i in range(len(nums)):
            prod*=temp# doing the product of the prevoius element for index 0 default is 1
            left.append(prod)
            temp=nums[i]# keeping currect element in temp
        prod=1
        print(left)
        temp=1
        # in below for loop doing the right running product product of after index
        # 1  2  3 4
        # 24 12 4 1
        # 1 1 2 6
        # result multiple left and right product index value respectively
        for i in range(len(nums)-1,-1,-1):
            print(i)
            prod*=temp
            left[i]=left[i]*prod
            temp=nums[i]
        return left
            
        
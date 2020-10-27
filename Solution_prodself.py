"""
Time Complexity O(n)
Space Complexit O(n)

forward pace: Multiply ans[i-1]*nums[i-1] to get running product at index i. set first element as 1 in ans.
Backward pass:set rightproduct as 1 and multiply by ans[i] for each index in backward. for each i , update rightproduct as rightproduct*nums[i] to get running product from right side

"""

class Solution_prodself:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans=[0]*len(nums) 
        #forward ass
        ans[0]=1
        for i in range(1,len(nums)):
            ans[i]=ans[i-1]*nums[i-1]

        print(ans)
            #reverse pass
        rprod=1
        for i in reversed(range(len(nums))):
            ans[i]=ans[i]*rprod
            rprod*=nums[i]

        return ans
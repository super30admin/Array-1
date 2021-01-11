# // Time Complexity : O(2n) = O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach.
   # 1 for a list like abcdefg at each of the index we need bcdefg acdefg abcefg abcdfg abcdeg abcdef
   # 2 we can notice that at any index say 'c' we need ab defg to get abdefg which can be achived by maintaining a left and right product array
   # 3 i.e lproduct = [1,a,ab,abc,abcd,abcde,abcdef] rproduct = [bcdefg,cdefg,defg,efg,fg,g,1] multipling these two will gives the result

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return 0
        
        rrproduct = 1
        lrproduct = 1
        
        leftprod = [1] * len(nums)
        
        for i in range(0,len(nums)):
            leftprod[i] = rrproduct
            rrproduct *= nums[i]
            
        
        for i in range(len(nums)-1,-1,-1):
            leftprod[i] *= lrproduct
            lrproduct *= nums[i]
        return(leftprod)
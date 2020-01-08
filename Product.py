// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: I have made a right and left list and for left list the first element is 1 and next element is 
o/p of previous element* previous num which we have not considered. similary for right list. So make a final list and multiply both the list.
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l=[]
        r=[0]*(len(nums)-1)+[1]
        final=[]
        l.append(1)
        for i in range(1,len(nums)):
            l.append(l[i-1]*nums[i-1])
        for j in range(len(nums)-1,0,-1):
            r[j-1]=r[j]*nums[j]
        for i in range(len(nums)):
            final.append(l[i]*r[i])
        return final
            
   #For space-o(1)
   class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l=[]
        l.append(1)
        temp=1
        l[-1]=temp*l[-1]
        for i in range(1,len(nums)):
            l.append(l[i-1]*nums[i-1])
        for j in range(len(nums)-1,0,-1):
            c=temp*nums[j]
            temp=c
            l[j-1]=temp*l[j-1]
        return l
        
   

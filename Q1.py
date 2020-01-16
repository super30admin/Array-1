# Time Complexity : 
# Space Complexity :
# Did this code successfully run on Leetcode :
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach


import numpy as np

def productExceptSelf(self, nums):
    self.nums = nums
         
    list1=[]
        
    for i in range(len(self.nums)):
        a = np.array(self.nums[:i])
        b = np.array(self.nums[i+1:])
        if (a.size == 0):
            c = np.prod(b)
            list1.append(c)
        else:
            c= np.prod(a)*np.prod(b)
            
        list1.append(c.astype(int))
                
            
            
    return(list1)
if __name__=='__main__': 
    nums = [1,2,3,4]
    print(productExceptSelf(nums)) 
  
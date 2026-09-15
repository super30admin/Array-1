# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : 

# Your code here along with comments explaining your approach
def productExceptSelf(nums: List[int])-> List[int]:
    n = len(nums)
    res = [0]*n

    #Left side product with running product as 1 
    left_product = 1
    for i in range(n):
        res[i] = left_product
        left_product *= nums[i]
    #Right side product with running product as 1 
    right_product = 1
    for i in range(n-1, -1, -1):
        res[i] *= right_product
        right_product *= nums[i]
    
    return res

import unittest 

class TestProductExceptSelf(unittest.TestCase):
    def test_normal_array(self):
        result = productExceptSelf([1,2,3,4])
        self.assertEqual(result, [24,12,8,6])
    
    def test_array_with_zero(self):
        result = productExceptSelf([1,2,0,0,3,4])
        self.assertEqual(result, [0,0,0,0,0,0])

if __name__ == '__main__':
    unittest.main()
  


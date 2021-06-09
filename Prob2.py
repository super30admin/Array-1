#Time complexity: O(m*n)   
#Space complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        # m*n matrix
        res = [0 for el in xrange(len(mat)*len(mat[0]))]
        # start at 0,0 and +1 direction which means up
        r, c,dirc = 0,0,1
        for i in xrange(len(res)):
            #add element to result list
            res[i] = mat[r][c]
            if dirc == 1:
                #upper arrow conditions
                #this cond'n comes first because if both conditions are true, it would cause idx out of bound
                if c == len(mat[0])-1:
                    dirc = -1
                    r += 1
                elif r == 0:
                    dirc = -1
                    c += 1                
                else:
                    r -= 1
                    c += 1  
            else:
                #down arrow conditions
                #this cond'n comes first because if both conditions are true, it would cause idx out of bound
                if r == len(mat)-1:
                    dirc = 1
                    c += 1
                elif c == 0:
                    dirc = 1
                    r += 1
                else:
                    r += 1
                    c -= 1
        return res
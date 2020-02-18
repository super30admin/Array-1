# Time Complexity : O(M*N)
# Space Complexity : O(M*N)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
#Keep track of the left,right,top and down boundaries in l,r,t and d variables.
#Use a dir variable to keep track of direction of traversal
#Accordingly update the output array
# Your code here along with comments explaining your approach

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        # Edge case of empty matrix or null matrix
        if matrix == None or len(matrix) == 0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        
        t = 0
        d = m-1
        l = 0
        r = n-1
        
        dir = 0
        output = []
        
        
        while t<=d and l<=r:
            
            #If going right
            if dir == 0:
                for i in range(l,r+1):
                    output.append(matrix[t][i])
                t +=1

            #If going down
            elif dir == 1:
                for i in range(t,d+1):
                    output.append(matrix[i][r])
                r -=1

            #If going left
            elif dir == 2:
                for i in range(r,l-1,-1):
                    output.append(matrix[d][i])
                d -=1

            #If going top
            elif dir == 3:
                for i in range(d,t-1,-1):
                    output.append(matrix[i][l])
                l +=1
            
            #Update the direction
            dir = (dir+1)%4
            
        return output
        
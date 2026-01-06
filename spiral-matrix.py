''' Time Complexity : O(m*n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No

   Approach : First do left pass to calculate running product. 
              Then second iteration from right to left and updating the new product
'''

#---------- Solution 1 : Checking the variable before every for loop iteration--------
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows,cols= len(matrix),len(matrix[0])
        l, t = 0,0
        r, b = cols-1,rows-1
        result = []
        while l <= r and t <= b:
            #for left to right
            for i in range(l,r + 1):
                result.append(matrix[t][i])
            t += 1

            if l <= r and t <= b:
                #for top to bottom
                for i in range(t,b + 1):
                    result.append(matrix[i][r])
                r -= 1

            if l <= r and t <= b:
                #for right to left
                for i in range(r,l-1, -1):
                    result.append(matrix[b][i])
                b -= 1

            if l <= r and t <= b:
                #for bottom to top
                for i in range(b,t-1,-1):
                    result.append(matrix[i][l])
                l += 1
        return result

#---------- Solution 2 : Optimized condition check before requied for loop iteration--------
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows,cols= len(matrix),len(matrix[0])
        l, t = 0,0
        r, b = cols-1,rows-1
        result = []
        while l <= r and t <= b:
            #for left to right
            for i in range(l,r + 1):
                result.append(matrix[t][i])
            t += 1

            #for top to bottom
            for i in range(t,b + 1):
                result.append(matrix[i][r])
            r -= 1

            if t <= b:
                #for right to left
                for i in range(r,l-1, -1):
                    result.append(matrix[b][i])
                b -= 1

            if l <= r:
                #for bottom to top
                for i in range(b,t-1,-1):
                    result.append(matrix[i][l])
                l += 1
        return result

        
#Arrays-1
#Problem 3 : https://leetcode.com/problems/spiral-matrix/
#Test Cases Passed on LeetCode
#Time Complexity-O(m*n)
#Space Complexity-O(1)
#layer by layer traversal with taking into consideration crossover points
class Solution:
    def spiralOrder(self, matrix):
        if not matrix or len(matrix)==0:
            return []
        right=len(matrix[0])-1
        left=0
        top=0
        bottom=len(matrix)-1
        row=0
        col=0
        result=[]
      
        while left<=right and top<=bottom:
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1

            for i in range(top,bottom+1): 
                result.append(matrix[i][right])
            right-=1
            
            if left<=right and top<=bottom:
                for i in range(right,left-1,-1):  
                    result.append(matrix[bottom][i])
                bottom-=1

                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])

                left+=1
        return result

sol=Solution()
matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(sol.spiralOrder(matrix))














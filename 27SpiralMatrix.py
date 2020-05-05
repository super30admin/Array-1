"""
// Time Complexity :O(m*n) Where m = number of rows, n = number of columns
// Space Complexity :O(1) Since result[] is returning at the end
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NA

//Explanation:
//BF Solution:NA
//Solution
Use left,right,top, and bottom variables to traverse through the array
Make sure that while loop conditions are not breaching inside loop-> subsequent
code block. *COMMON mistake  
"""
from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #Edge case
        if matrix is None or len(matrix)==0:
          return []

        result = []
        left = 0
        right = len(matrix[0])-1
        top = 0
        bottom = len(matrix)-1

        while(left<=right and top<=bottom):
          #print("*left=",left,"r=",right,"t=",top,"b=",bottom)
          # Top row
          for i in range(left,right+1):
            result.append(matrix[top][i])
          top+=1

          #Right column
          for i in range(top,bottom+1):
            result.append(matrix[i][right])
          right-=1


          #Bottom row
          if top<=bottom:
            for i in range(right,left-1,-1):
              result.append(matrix[bottom][i])
            bottom-=1


          #Left column
          if left<=right:
            for i in range(bottom,top-1,-1):
              result.append(matrix[i][left])
            left+=1
        return result






if __name__=="__main__":
  m=[[1,2,3,4],[5,6,7,8],[9,10,11,12]]
  s=Solution()
  print(s.spiralOrder(m))

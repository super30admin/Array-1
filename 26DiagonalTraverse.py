"""
// Time Complexity :O(m*n) Where m = number of rows, n = number of columns
// Space Complexity :O(1) Since result[] is returning at the end
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NA

//Explanation:
//BF Solution:NA
//Solution
use r,c direction variables.
Considered edge cases
Change direction to either 1 or -1 when
c==cn-1 -> No column to move
r==cm-1-> No row to move forward
r==0 -> No row to move up
c==0 -> No column to move left
Likewise update r and c
"""
from typing import List
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:

      #Edge case
      if matrix is None or len(matrix)==0:
        return []

      r,c,i = 0,0,0
      direction = 1
      rm = len(matrix)
      cn = len(matrix[0])
      result = []

      while (i<rm*cn):
        #print("r=",r,"c=",c,"dir=",direction,"i=",i)
        result.append(matrix[r][c])
        if direction == 1:
          if c==cn-1:
            direction = -1
            r+=1
          elif r==0:
            direction = -1
            c+=1
          else:
            r-=1
            c+=1
        else:
          if r == rm-1:
            direction = 1
            c += 1
          elif c==0:
            direction = 1
            r += 1
          else:
            r += 1
            c -= 1
        i += 1
      return result




if __name__== "__main__":
  m = [[ 1, 2, 3 ],[4, 5, 6 ],[ 7, 8, 9 ]]
  s=Solution()
  print(s.findDiagonalOrder(m))
"""
r= 0 c= 0 dir= 1
r= 0 c= 1 dir= -1
r= 1 c= 0 dir= -1
r= 2 c= 0 dir= 1
r= 1 c= 1 dir= 1
r= 0 c= 2 dir= 1
r= 1 c= 2 dir= -1
r= 2 c= 1 dir= -1
r= 2 c= 2 dir= 1
r= 3 c= 2 dir= -1
"""

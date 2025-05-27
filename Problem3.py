
#  // Time Complexity :O(N)
# # // Space Complexity :O(N)
# # // Did this code successfully run on Leetcode :yes
# # // Three line explanation of solution in plain english
# https://leetcode.com/problems/spiral-matrix/
# # // Your code here along with comments explaining your approach
# here you maintain 4 varibles and change based on that, recursive solution is also possible for this
class Solution:
    def spiralOrder(self, m: List[List[int]]) -> List[int]:
        top,left=0,0
        ans=[]
        right=len(m[0])-1
        bottom=len(m)-1
        while(top<=bottom and left<=right):
            print(ans)
            for i in range(left,right+1):
                ans.append(m[top][i])
            top+=1
            for i in range(top,bottom+1):
                ans.append(m[i][right])
            right-=1
            if top<=bottom:
                for i in range(right,left-1,-1):
                    ans.append(m[bottom][i])
                bottom-=1
            if left<=right:
                for i in range(bottom,top-1,-1):
                    ans.append(m[i][left])
                left+=1
        return ans

# Time Complexity : O(n*m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix  or not matrix[0]:
            return []
        
        
        direction = 1
        ans=[]
        i,j =0,0
        index=0
        n = len(matrix)
        m = len(matrix[0])
        
        while index < n*m :
            ans.append(matrix[i][j])
            
            if(direction == 1) :
                if j == m -1:
                    i+=1
                    direction*= -1
                elif i == 0:
                    j+=1
                    direction*= -1
                else :
                    i-=1
                    j+=1
                    
            else :
                if i == n -1:
                    j+=1
                    direction*= -1
                elif j == 0:
                    i+=1
                    direction*= -1
                else :
                    j-=1
                    i+=1
            index +=1
                    
        return ans
            
                    
                
        
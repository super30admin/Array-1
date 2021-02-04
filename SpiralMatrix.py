# Time Complexity : O(n*m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix and not matrix[0]:
            return []
        
        
        left,top=0,0
        right=len(matrix[0])-1
        bot=len(matrix)-1
        ans=[]
        
        while(top<= bot and left<= right):
            # go right
            
            for x in range(left,right+1):
                ans.append(matrix[top][x])
            
            top+=1
                
            # go down
            
            for x in range(top,bot+1):
                ans.append(matrix[x][right])
            
            right-=1
                
            
            if (top<= bot and left<= right):
                
                # go left
                for x in range(right,left-1,-1):
                    ans.append(matrix[bot][x])
                
                bot-=1
                    
                # go up
                for x in range(bot,top-1,-1):
                    ans.append(matrix[x][left])
                
                left+=1
        
        
        return ans
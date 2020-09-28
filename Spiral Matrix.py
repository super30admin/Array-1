# Time Complexity: O(N)
# Space Complexity: O(N)
# This code was passsed on LC: Yes
# Problems: No

class Solution:
    def spiralOrder(self, matrix):
        if not matrix:
            return []
            
        l = 0
        r = len(matrix[0])-1
        t = 0
        b = len(matrix)-1
        ans = []
        
        while l<r and t<b:
            for i in range(l,r): # t same
                ans.append(matrix[t][i])
                
            for i in range(t,b): # r same 
                ans.append(matrix[i][r])
                
            for i in range(r,l,-1): # b same
                ans.append(matrix[b][i])
            
            for i in range(b,t,-1): # l same
                ans.append(matrix[i][l])
            l += 1
            r -= 1
            t += 1
            b -= 1
        if l==r and b==t:
            ans.append(matrix[l][b])
        elif t==b:
            for i in range(l,r+1):
                ans.append(matrix[t][i])
        elif l==r:
            for i in range(t,b+1):
                ans.append(matrix[i][l])
        return ans
                
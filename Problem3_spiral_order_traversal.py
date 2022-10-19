# // Time Complexity : O(n*m)
# // Space Complexity : O(n*m)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
# https://leetcode.com/problems/spiral-matrix/
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix)
        m = len(matrix[0])
        RS, CS = 0,0
        RE, CE = n-1, m-1
        out = []
        
        while (RS<=RE and CS<=CE):
            #move right, keep row same ie row start
            for i in range(CS,CE+1):
                out.append(matrix[RS][i])
            RS += 1
            
            #move down, keep column same ie column end
            for i in range(RS,RE+1):
                out.append(matrix[i][CE])
            CE -= 1
            
            #move left, keep row same ie row end
            if RS<=RE:
                for i in range(CE,CS-1, -1):
                    out.append(matrix[RE][i])
                RE -= 1
            
            #move up, keep column same ie column start
            if CS<=CE:
                for i in range(RE,RS-1,-1):
                    out.append(matrix[i][CS])
                CS += 1
            
        return out
        
            
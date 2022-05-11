# Time Complexity: O(MN), where M is rows and N is columns
# Space Complexity: O(1)
# Executed Successfully: Yes
# Challenges faced: No


#CODE
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        arr = []
        l = 0
        r = n - 1
        t = 0
        b = m - 1
        
        while l <= r and t <= b:
            
            # right
            for i in range(l,r+1):
                arr.append(matrix[t][i])
            t += 1
            # bottom
            if l <= r:
                for i in range(t,b+1):
                    arr.append(matrix[i][r])
                r -= 1
            
            # left
            if t <= b:
                for i in range(r,l-1,-1):
                    arr.append(matrix[b][i])
                b -= 1
            
            # top
            if l <= r:
                for i in range(b,t-1,-1):
                    arr.append(matrix[i][l])
                l += 1
            
        return arr
'''

54. Spiral Matrix

TIME COMPLEXITY: O(m*n)
SPACE COMPLEXITY: O(m*n)
LEETCODE: Yes
DIFFICULTIES: Yes, but I could resolve it

'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        print(matrix)
        m = len(matrix)
        n = len(matrix[0])
        res = [None] * m * n
        res_len = m * n
        ind = 0
        
        p1 = [0,0]
        p2 = [0,n-1]
        p3 = [m-1,n-1]
        p4 = [m-1,0]
        
        while ind < res_len:
            if p1 == p2 and p3 == p4: # single column traverse
                for i in range(p1[0], p4[0]+1):
                    res[ind] = matrix[i][p1[1]]
                    ind += 1
                return res
            
            if p1 == p4 and p2 == p3: # singel row traverse
                for j in range(p1[1], p2[1]+1):
                    res[ind] = matrix[p1[0]][j]
                    ind += 1
                return res
            
            # 1
            for j in range(p1[1], p2[1]):
                res[ind] = matrix[p1[0]][j]
                ind += 1

            # 2
            for i in range(p2[0], p3[0]):
                res[ind] = matrix[i][p2[1]]
                ind += 1
            
            # 3
            for j in range(p3[1], p4[1], -1):
                res[ind] = matrix[p3[0]][j]
                ind += 1
            
            # 4
            for i in range(p4[0], p1[0], -1):
                res[ind] = matrix[i][p4[1]]
                ind += 1
            
            p1 = [p1[0]+1, p1[1]+1]
            p2 = [p2[0]+1, p2[1]-1]
            p3 = [p3[0]-1, p3[1]-1]
            p4 = [p4[0]-1, p4[1]+1]
        
        return res            
        

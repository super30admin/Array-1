#Time Complexity : O(m*n) m->rows , n->columns
#Space Complexity : O(1) as result is output and not counted in space complexity
#did your code run on leetcode: yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = [0]*(m*n)
        
        r=0
        c=0
        i=0
        
        direction = 1
        
        if mat == [[]]: return [0]
        while(i < m*n):
            result[i] = mat[r][c]
            i+=1
            #change direction upwards
            if(direction == 1):
                if r == 0 and c != n-1:
                    direction = -1
                    c+=1
                elif c == n - 1:
                    direction = -1
                    r+=1
                else:
                    r-=1
                    c+=1
            
            #change direction downwards
            else:
                if(direction == -1):
                    if c == 0 and r != m-1:
                        direction = 1
                        r+=1
                    elif r == m - 1:
                        direction = 1
                        c+=1
                    else:
                        c-=1
                        r+=1
        
        return result

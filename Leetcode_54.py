#Time Complexity: O(m*n)
#Space Complexity: O(1)

class Solution:
    def spiralOrder(self, matrix):
        if not matrix or not matrix[0]:
            return []
        spiral=[]
        r,c=0,-1
        d_r, d_c=0,1
        r_leg, c_leg=len(matrix[0]), len(matrix)-1
        leg_count=0
        
        for _ in range(len(matrix[0])*len(matrix)):
            r+=d_r
            c+=d_c
            spiral.append(matrix[r][c])
            leg_count+=1
        
            if(d_c!=0 and leg_count==r_leg) or (d_r!=0 and leg_count==c_leg):
                if d_c!=0:
                    r_leg-=1
                else:
                    c_leg-=1
                d_r, d_c = d_c, -d_r
                leg_count=0
        return spiral
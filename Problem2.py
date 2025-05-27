# // Time Complexity :O(m X N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :YES
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach
# https://leetcode.com/problems/diagonal-traverse/description/
# here important thing is to understand when it makes breaches / turns/ goes out of bounds based on that append to answer

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        ans_l=len(mat)*len(mat[0])
        ans=[]
        row,col=0,0
        m,n=len(mat),len(mat[0])
        b=1
        #[col][row]
        for i in range(ans_l):
            # print(ans)
            #going-up
            if b:
                #top-breach
                if col==0 and row!=n-1 :
                    ans.append(mat[col][row])
                    b=0
                    row+=1
                #right breach
                elif row==n-1 and col!=0:
                    ans.append(mat[col][row])
                    b=0
                    col+=1
                elif row==n-1 and col==0:
                    b=0
                    ans.append(mat[col][row])
                    col+=1
                else:
                    ans.append(mat[col][row])
                    col-=1
                    row+=1
            else:
                #down
                #bottom breach
                if col==m-1:
                    ans.append(mat[col][row])
                    b=1
                    row+=1
                    #left breach
                elif row==0:
                    ans.append(mat[col][row])
                    b=1
                    col+=1
                else:
                    print(col,row)
                    ans.append(mat[col][row])
                    col+=1
                    row-=1
        return ans
            

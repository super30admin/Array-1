# // Time Complexity : O(mxn), m is the number of rows and n is the numebr of cols
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Here, we essentially have 2 directions - Up or Down.
# Up would be up+right and down would be down+left.
# Edge cases would be when you go outside the matrix size - row=0,row=n-1,col=0,col=n-1.  Based on these conditions change the flag variable to go up or down.
# // Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m=len(mat)
        n=len(mat[0])
        res=[0 for _ in range(m*n)]
        flag=True
        r,c=0,0
        for i in range(len(res)):
            res[i]=mat[r][c]
            if flag: #UP direction
                if r==0 and c!=n-1: #if you simply check r==0 case at the top right corner, it will go out of bounds as c is equal to n-1. The moment you hit n-1 with c, it means row is done, so r+=1 - handled in the elif case
                    c+=1
                    flag=False
                elif c==n-1:
                    r+=1
                    flag=False
                else: #normal iteration for up
                    r-=1
                    c+=1
            else: #DOWN direction - mirror opposite
                if c==0 and r!=m-1: #if you simply check c==0 case at the bottom leftcorner, it will go out of bounds as r is equal to m-1. The moment you hit m-1 with r, it means col is done, so c+=1 - handled in the elif case
                    r+=1
                    flag=True
                elif r==m-1:
                    c+=1
                    flag=True
                else: #normal iteration for down
                    c-=1
                    r+=1
        return res
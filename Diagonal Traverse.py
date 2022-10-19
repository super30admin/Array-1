class Solution:
    # leetcode URL : https://leetcode.com/problems/diagonal-traverse/
    # Problem : 498. Diagonal Traverse
    # Time Complexity : O(n)
    # Space Complexity : O(1)
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        TL = 0
        BL = len(mat)-1
        LL = 0
        RL = len(mat[0])-1
        ret_list = list()
        i = 0 
        j = 0
        while len(ret_list)<= ((BL+1)*(RL+1)):
            # TR
            while (j<=RL and i>=TL):
                ret_list.append(mat[i][j])
                i = i-1
                j = j+1
            if j > RL and i < TL:
                i = i+2
                j = j-1
            elif j > RL:
                i = i+2
                j = j-1
            elif i < TL:
                i = i+1
                
            if len(ret_list) == ((BL+1)*(RL+1)):
                break
            # BL
            while (j>=LL and i<=BL):
                ret_list.append(mat[i][j])
                i = i+1
                j = j-1
            if j < LL and i > BL:
                j = j+2
                i = i - 1
            elif i > BL:
                i = i-1
                j = j+2
            elif j < LL:
                j = j+1
        
        return ret_list
        
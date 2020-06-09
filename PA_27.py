#LC 54 - Spiral Matrix
#Time Complexity - O(row*col)
#Space Complexity - O(row*col)
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix:
            return []
        ans = []
        T,L = 0,0
        B,R = len(matrix)-1,len(matrix[0])-1
        d = 0
        while T <= B and L <= R:
            #Go right
            if d == 0:
                for i in range(L,R+1):
                    ans.append(matrix[T][i])
                T = T + 1
                d = 1
            #Go down
            elif d == 1:
                for i in range(T,B+1):
                    ans.append(matrix[i][R])
                R = R - 1
                d = 2
            #Go Left
            elif d == 2:
                i = R
                while i >= L:
                    ans.append(matrix[B][i])
                    i = i - 1
                B = B - 1
                d = 3
            #Go up
            elif d == 3:
                i = B
                while i >= T:
                    ans.append(matrix[i][L])
                    i = i - 1
                L = L + 1
                d = 0
        return(ans)
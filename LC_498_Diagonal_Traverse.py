#TC-> O(M*N)
#SC->O(1)

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """

        if(mat == None or len(mat) == 0 or len(mat[0])==0 ):
            return []
        
        m = len(mat) #r
        n = len(mat[0]) #c
        result = []
        i =0
        r = 0 #rows
        c = 0 #columns
        flag = 'up' #Up direction,  for down
        for i in range(m*n):
            result.append(mat[r][c])

            if flag == 'up':
                if r==0 and c!=n-1: #1->2
                    flag = 'down'
                    c = c+1 
                elif c==n-1:#3->6
                    flag = 'down'
                    r = r+1
                else: #5->3,7->5,8->6
                    r = r-1
                    c = c+1
            else:
                if c == 0 and r!=m-1:#4->7
                    flag = 'up'
                    r = r+1 
                elif r==m-1:#8->9
                    flag = 'up'
                    c = c+1
                else:#2->4,6->8
                    c = c-1
                    r = r+1
        return result
                    
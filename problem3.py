 #Time Complexity :O(m.n)
 #Space Complexity :O(1)
 #Did this code successfully run on Leetcode :Yes
 #Any problem you faced while coding this :No
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        top=0
        bot=len(matrix)-1
        left=0
        right=len(matrix[0])-1
        arr=[0]*((bot+1)*(right+1))
        i,j=0,0
        idx=0
        while left<=right and top<=bot:
            
            for j in range(left,right+1):
                arr[idx] = matrix[i][j]
                idx += 1
            top+=1
            for i in range(top,bot+1):
                arr[idx] = matrix[i][j]
                idx += 1
            right-=1
            if (top<=bot):
                for j in range(right,left-1,-1):
                    arr[idx] = matrix[i][j]
                    idx += 1
            bot-=1
            if (left<=right):
                for i in range(bot,top-1,-1):
                    arr[idx] = matrix[i][j]
                    idx += 1
            left+=1
        return arr
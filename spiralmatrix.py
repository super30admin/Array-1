#spiral matrix
#time complexity : 0(n)
# felt little difficult to track the row and columns
#no doubts
#ran on leetcode

#we have four different pointer, right coloumn(RC),left coloumn(LC), top row(TR), bottom row(BR)
# while going left, we traverse the top row (TR) from LC to RC, after printing all elements from top row, we increment the row which will go to next row
#while going down, we move RC from TR to BR, and do RC=Rc-1
#while going left, traverse BR from RC to LC (backward), then do BR=Br-1. cos we printed all the leemts of the last row
#while going up, we traverse LC from BR to TR and then do LC=LC+1

#after incrementing the TR,Br,LC,RC we should always check if TR<=Br and Lc<=Rc. because when it crossed it means we have printed all the eleemnts



class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []
        if len(matrix) == 0:
            return result
        tr = 0
        rc = len(matrix[0]) - 1  # 2
        lc = 0
        br = len(matrix) - 1  # 3

        while ((tr <= br) and (lc <= rc)): #checking pointers
            for i in range(lc, rc + 1):  #traversing left to right
                result.append(matrix[tr][i])
            tr = tr + 1
            for j in range(tr, br + 1): #traversing from up to down
                result.append(matrix[j][rc])
            rc = rc - 1
            if ((tr <= br)):
                for i in range(rc, lc - 1, -1): #traversing from right to left
                    result.append(matrix[br][i])
                br = br - 1
            if (lc <= rc):
                for i in range(br, tr - 1, -1): #traversing from down to up
                    result.append(matrix[i][lc])
                lc = lc + 1
        return result
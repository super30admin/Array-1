  ---------------------- Diagonal Traverse Matrix ------------------------------------------------   
# Time Complexity : O(N*M) N is the length of the Array M is the columns of the array.
# Space Complexity : O(N)  dict
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# To print the diagonal elements, we know that the diagonal elements have a i+j as a same value. 
#so here I can use a dictionary to store the elements of same i+j value. 
#Now I can  iterate through the dict and if my i+j value is even I am going from up to down, else down to up and reverse my array elements.
        



class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        
        d = {}
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if i+j not in d:
                    d[i+j] = [matrix[i][j]]
                else:
                    d[i+j].append(matrix[i][j])
        res = []
        for k in d.items():
            if k[0]%2 == 0:
                [res.append(x) for x in k[1][::-1]]
            else:
                [res.append(x) for x in k[1]]
        return res
        
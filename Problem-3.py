"""
## Problem 3
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

"""

def Spiral_matrix(Matrix):
    if Matrix==None or len(Matrix)==0:
        return Matrix
    rows=len(Matrix)   # calculate rows
    cols=len(Matrix[0])  # number fo columns
    output=[]             # empty output list /array
    t=0                  # pointer at left top means 1st row to move top to bottom rows
    l=0                  # pointer at left top to move from left to right
    r=cols-1              # pointer at right top to move from right to left
    b=rows-1          # pointer at bottom last row to move from bottom to top

    while l <= r and t <=b:                # condiition
        for i in range(l,r+1):     # move left to right : first row covered and increment top pointer to 2nd row now
            output.append(Matrix[t][i])
        t=t+1

        for i in range(t,b+1):     # move top to bottom : last column is  covered and decrement right pointer to 2nd last col
            output.append((Matrix[i][r]))
        r=r-1

        if (t <= b):                      # check bottom is less than equal to top
            for i in range(r,l-1,-1):     # move right to left : last row covered and decrement bottom pointer to 2nd last row now
                output.append(Matrix[b][i])
            b=b-1
        if (l <= r):                      #check left is less than equal to right
            for i in range(b,t-1,-1):     # move bottom to top : 2nd row covered and increment left pointer to 2nd col now
                output.append(Matrix[i][l])
            l=l+1

    return output





print(Spiral_matrix(
[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

]))
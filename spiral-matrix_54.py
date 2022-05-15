#Time Complexity O(MN) Traversing Matrix elements
#Space Complexity O(1) We are just using an array of output
#It successfully runs on leetcode

def spiral(m):
    res=[]
    top,bottom,left, right= 0,len(m),0,len(m[0])

    while left<right and top<bottom:
        for i in range(left,right):
            res.append(m[top][i])
        top+=1

        for i in range(top,bottom):
            res.append(m[i][right-1])
        right-=1

        for i in range(right-1,left-1,-1):
            res.append(m[bottom-1][i])
        bottom-=1

        for i in range(bottom-1,top-1,-1):
            res.append(m[i][left])
        left+=1

    return res
print(spiral([[1,2,3],[4,5,6],[7,8,9]]))
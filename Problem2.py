# Time Complexity : O(m*n)
# Space Complexity : O(m*n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m=len(matrix)
        n=len(matrix[0])
        Left=0
        Right=n-1
        Top=0
        Bottom=m-1
        result=[]
        while(Top<=Bottom and Left<=Right):
            for i in range(Left,Right+1):
                result.append(matrix[Top][i])
            Top+=1

            if Left<=Right:
                for i in range(Top,Bottom+1):
                    result.append(matrix[i][Right])
                Right-=1

            if Top<=Bottom:
                for i in range(Right,Left-1,-1):
                    result.append(matrix[Bottom][i])
                Bottom-=1

            
            if Left<=Right:
                for i in range(Bottom,Top-1,-1):
                    result.append(matrix[i][Left])
                Left+=1

        print(result)
        return result
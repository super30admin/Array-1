# Time Complexity : O(n**2)
# Space Complexity : O(n//2)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : Couldn't solve it

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        return self.helper(matrix,len(matrix),len(matrix[0]),[0,0],[],0)
    
    def helper(self,matrix,bot,rig,start,result,count):
        x = len(matrix)
        print(count,x)
        if x % 2 == 0:
            if count == x // 2:
                return result
        else:
            if count == (x//2+1):
                return result
        a = start[0]
        b = start[1]
        run = 0
        if a >= len(matrix) or b >= len(matrix[0]):
            return result
        result.append(matrix[a][b])
        if a == bot - 1 and b == rig -1:
            return result
        if b == rig - 1:
            a += 1
        else:
            b += 1
        while a<bot and b<rig and a >= start[0] and b >= start[1]:
            if a >= len(matrix) or b >= len(matrix[0]):
                return result
            result.append(matrix[a][b])
            if count == 1:
                    print(a,b,bot,rig)
            if a == start[0]:
                if b != rig-1:
                    b += 1
                else:
                    a += 1
            elif b == rig - 1:
                if a!= bot-1:
                    a+=1
                else:
                    b -= 1
            elif a == bot-1:
                if b != start[1]:
                    b -= 1
                else:
                    a -= 1
            elif b == start[1]:
                if a != start[0]:
                    a -= 1
            if a == start[0] and b == start[1]:
                break
        print(result)
        return self.helper(matrix,bot-1,rig-1,[start[0]+1,start[1]+1],result,count+1)
                    
                           
        
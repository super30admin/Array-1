"""
Time Complexity: O(n*n)
Space Complexity: O(1)
Did your code run on leetcode?: yes
Issues faced: Incorrect usage of pointers
"""
class Solution:
    def spiralOrder(self, matrix):
        n = len(matrix)
        m = len(matrix[0])
        top = 0
        bot = n-1
        # print("bot=" ,bot)
        left = 0
        right = m-1
        # print("right=" , right)
        List = []
        while(top <= bot and left <= right):
            # print("i am in while loop")
            # right
            for x in range(left,right+1):
                if top <= bot and left <= right:
                    List.append(matrix[top][x])
                    # print("rightmatrix", matrix[top][x])
            top += 1

            # down
            for x in range(top, bot+1):
                if top<= bot and left <= right:
                    # print("x=",x)
                    # print("right=",right)
                    List.append(matrix[x][right])

                    # print("downmatrix", matrix[x][right])
            right -= 1
            # left
            for x in reversed(range(left,right+1)):
                if(top <= bot) and left<= right:
                    List.append(matrix[bot][x])
                    # print("leftmatrix", matrix[bot][x])
            bot -= 1

            #up
            for x in reversed(range(top,bot+1)):
                if(top <= bot) and left <= right:
                    List.append(matrix[x][left])
                    # print("upmatrix", matrix[x][left])
            left += 1
        return List
if __name__ == '__main__':
     L = Solution()
     print(L.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))

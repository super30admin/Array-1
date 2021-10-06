"""
Time Complexity: O(n)
Space Complexity: O(1)
Did your code run on leetcode?: yes
Issues faced: I was getting wrong output because of using incorrect syntax which changed the meaning. Instead of j-= 1, I typed j =- 1


"""
class Solution:
    def findDiagonalOrder(self, mat):
        if len(mat) == 0 or len(mat[0]) == 0:
            return []
        n = len(mat)
        m = len(mat[0])
        List = [None]* (n*m)
        # print(List)

        idx = 0
        dir = 1
        i,j = 0,0
        while(idx < n*m):
            List[idx] = mat[i][j]
            idx += 1
            # print("dir=", dir)
            if dir == 1:
                if j == m-1:
                    dir = -1
                    i += 1
                elif i == 0:
                    dir = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                if i == n-1:
                    dir = 1
                    j += 1
                elif j == 0:
                    dir = 1
                    i += 1
                else:
                    i += 1
                    j -= 1
        return List
if __name__ == '__main__':
    L = Solution()
    print(L.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))

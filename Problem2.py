# Time Complexity :O(n^m
# Space Complexity :O(n)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 498

def findDiagonalOrder(matrix):
    """
    :type matrix: List[List[int]]
    :rtype: List[int]
    """
    myMap = {}
    # loop through matrix
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            # if no entry in dictionary for sum of indices aka the diagonal, create one
            if i + j not in myMap:
                myMap[i + j] = [matrix[i][j]]
            else:
                # If you've already passed over this diagonal, keep adding elements to it!
                myMap[i + j].append(matrix[i][j])

    ans = []
    # look at the diagonal and each diagonal's elements
    for entry in myMap.items():

        # Each entry[0] will give the level of diagonal.
        if entry[0] % 2 == 0:
            # Here we append in reverse order because its an even numbered level/diagonal.
            [ans.append(x) for x in entry[1][::-1]]
        else:
            [ans.append(x) for x in entry[1]]
    return ans

if __name__ == '__main__':
    matrix = [[1,2,3],[4,5,6],[7,8,9]]
    ans = findDiagonalOrder(matrix)
    print(ans)
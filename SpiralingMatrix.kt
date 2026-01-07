// In this problem we need to traverse a 2d matrix in a spiral order and return the elements in a list.We have add consditions on all the sides of the matrix which top, right, bottom and left.
// we also take care of breach scenarios while inside the while loop so that we don't accidentally collide the sides. 
// Time complexity is O(m*n) where m is number of rows and n is number of columns. Space complexity is O(1)

class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val result = mutableListOf<Int>()
        val m = matrix.size
        val n = matrix[0].size
        var top = 0
        var left = 0
        var right = n - 1
        var bottom = m - 1

        while (top <= bottom && left <= right) {
            //top row
            for (i in left..right) {
                result.add(matrix[top][i])
            }
            top++

            if (top <= bottom && left <= right) {
                for(i in top..bottom){
                    result.add(matrix[i][right])
                } 
                right--
            }

            if (top <= bottom && left <= right){

                for(i in right downTo left) {
                    result.add(matrix[bottom][i])
                }
                bottom--
            }
            if (top <= bottom && left <= right){

                for(i in bottom downTo top) {
                    result.add(matrix[i][left])
                }
            left++
            }
        }

        return result
    }
}
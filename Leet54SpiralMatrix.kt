// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Establish 4 boundries top, bottom, left and right then scanning becomes easy now
// edge case for line 40 and line 33 are very important because we are changing the base values
//toprow and rightCol and we are checking only when we reach the outer while so we have to check inside as well
// to prevnt the extra entry getting scanned



// Your code here along with comments explaining your approach
class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val ROWS = matrix.size
        val COLS = matrix[0].size

        var topRow = 0
        var leftCol = 0
        var bottomRow = ROWS - 1
        var rightCol = COLS - 1
        val res:MutableList<Int> = mutableListOf()
        while(topRow <= bottomRow && leftCol <= rightCol){
            //top scan left to right
            for(i in leftCol..rightCol ){
                res.add(matrix[topRow][i])
            }
            topRow++ //Rows work is completed now increment it
            //right scan top right to bottom right
            for(i in topRow..bottomRow){
                res.add(matrix[i][rightCol])
            }
            rightCol-- //colum work done decrement it now
            //bottom right to bottom left
            if(topRow <= bottomRow){
                for(i in rightCol downTo leftCol){
                    res.add(matrix[bottomRow][i])
                }
                bottomRow--
            }

            if(leftCol <= rightCol){
                for(i in bottomRow downTo topRow){
                    res.add(matrix[i][leftCol])
                }
                leftCol++
            }
        }
        return res
    }
}
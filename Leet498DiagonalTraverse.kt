// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Intution is to have a direction variable for up and down and then
// also a pair of variable r, c which will be updated when we hit the boundries.
// *** The point to keep in mind is to check for COLUM boundry and ROW boundry first when going up or down
// Face issues much issue here

class Solution {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val ROW = mat.size
        val COL = mat[0].size
        var r = 0
        var c = 0
        val res = IntArray(ROW * COL)
        var dir = true // true = up () and false = down

        for(i in res.indices){

            res[i] = mat[r][c]

            if(dir){
                if( c == COL - 1){
                    dir = false
                    r++
                }else if( r == 0){
                    dir = false
                    c++
                } else {
                    r--
                    c++
                }
            }
            else{
                if(r == ROW - 1){
                    dir = true
                    c++
                } else if(c == 0){
                    dir = true
                    r++
                } else {
                    r++
                    c--
                }
            }
        }
        return res
    }
}


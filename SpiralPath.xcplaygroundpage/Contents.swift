// Time complexity: O(mxn)
// Space complexity: O(1)

func spiralOrder(_ matrix: [[Int]]) -> [Int] {
        var l = 0                   // +1 after moving from bot to top
        var r = matrix[0].count-1   // -1 after moving from top to bot
        var bot = matrix.count-1    // -1 after moving from right to left
        var top = 0                 // +1 after moving left to right
        var res = [Int]()
        var matrixSize = matrix.count * matrix[0].count
        while res.count < matrixSize {
            
            // left to right
            if res.count < matrixSize {
                for i in l...r {
                   res.append(matrix[top][i])
                }
            }
            top += 1

            // top to bot
            if res.count < matrixSize {
                for i in top...bot {
                    res.append(matrix[i][r])
                }
            }
            r -= 1

            // right to left
            if res.count < matrixSize {
                for i in stride(from: r, through: l, by: -1) {
                    res.append(matrix[bot][i])
                }
            }
            bot -= 1
            
            // bot to top
            if res.count < matrixSize {
                for i in stride(from: bot, through: top, by: -1) {
                    res.append(matrix[i][l])
                }
            }
            l += 1
        }

        return res
    }

let matrix = [[1,2,3],[4,5,6],[7,8,9]]
spiralOrder(matrix)

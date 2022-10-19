// Time complexity O(mxn)
// Space complexity O(1)

func findDiagonalOrder(_ mat: [[Int]]) -> [Int] {
        var result = [Int]()
        var matrix = mat
        guard matrix.count != 0 else {
            return result
        }
        
        let rowCount = matrix.count
        let columnCount = matrix[0].count
        var rowIndex = 0
        var columnIndex = 0
        repeat {
            result.append(matrix[rowIndex][columnIndex])
            if (rowIndex + columnIndex) % 2 == 0 {
                rowIndex = (columnIndex == columnCount - 1) ? rowIndex + 1 : max(0, rowIndex-1)
                columnIndex = min(columnCount-1, columnIndex + 1)
            }
            else {
                columnIndex = (rowIndex == rowCount - 1) ? columnIndex + 1 : max(0, columnIndex-1)
                rowIndex = min(rowCount-1, rowIndex + 1)
            }
        } while result.count != rowCount*columnCount
        
        return result
    }

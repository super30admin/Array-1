//
//  SpiralMatrix.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/6/26.
//

class SpiralMatrix {
    
    init() {
        let result = spiralOrder()
        print("result \(result)")
        
        spiralMatrixUsingRecursion()
    }
    /*
     It's a recursive pattern.
     When left & right  or top & bottom crosses each other, we are done.
     after each iteration, to print the inner spral - (left + 1, right - 1, bottom - 1, top + 1)
     initially - left = 0, right - n-1, bottom- (m-1)
     j -left to right - top row done.
     shrink the boundary -> increment top
     go on the right most boundary from top to bottom
     shrink the boundary -> right = right - 1
     go on the bottom row from right to left
     shrink bottom - bottom - 1
     go on left from bottom to top.
     once left column is done, increase the left boundary. left = left + 1
     If a single row at the innermost layer. then top and bottom is equal. left and right are different.
     If any pair crossed, we would stop. If they are equal, we need to print it.
     */
    /*
     time complexity - O(mn)
     space complexity - no extra space
     */
    func spiralOrder() -> [Int] {
        let input = [[1,2,3,4,5], [6,7,8,9,10], [11, 12, 13, 14, 15], [16, 17, 18, 19,20]]
        var result = [Int]()
        let m = input.count
        let n = input[0].count
        var top = 0
        var bottom = m - 1
        var left = 0
        var right = n - 1
        //when both pairs didn't cross each other.
        while (top <= bottom && left <= right) {
            //iterate on top row. for j = left to right
            for j in left...right {
                result.append(input[top][j])
            }
            //once top row is done. Ijncrease the top pointer
            top += 1
            
            //If the variables of while loop is mutating (if base is changing), check the base case again
            if (top <= bottom && left <= right) {
                //right column
                for i in top...bottom {
                    result.append(input[i][right])
                }
                right -= 1
            }
            
            if (top <= bottom) {
                //bottom row
                for j in stride(from: right, through: left, by: -1) {
                    result.append(input[bottom][j])
                }
                bottom -= 1
            }
            
            if (left <= right) {
                //left column
                for i in stride(from: bottom, through: top, by: -1) {
                    result.append(input[i][left])
                }
                left += 1
            }
        }
        return result
    }
    
    //Recursion stack space - no of spirals
    func spiralMatrixUsingRecursion() {
        let input = [[1,2,3,4,5], [6,7,8,9,10], [11, 12, 13, 14, 15], [16, 17, 18, 19,20]]
        var top = 0
        var bottom = input.count - 1
        var left = 0
        var right = input[0].count - 1
        var result = [Int]()
        helperForSpiralOrder(input: input, left: left, right: right, top: top, bottom: bottom, result: &result)
        print("result : \(result)")
    }
    
    func helperForSpiralOrder(input: [[Int]], left: Int, right: Int, top: Int, bottom: Int, result: inout [Int]) {
        var top = top
        var bottom = bottom
        var left = left
        var right = right
        
        if (top > bottom || left > right) {
            return
        }
        //iterate on top row. for j = left to right
        for j in left...right {
            result.append(input[top][j])
        }
        //once top row is done. Increase the top pointer
        top += 1
        
        //right column
        for i in top...bottom {
            result.append(input[i][right])
        }
        right -= 1
        
        //If the variables of while loop is mutating (if base case variable is changing), check the base case again
        
        if (top <= bottom) {
            //bottom row
            for j in stride(from: right, through: left, by: -1) {
                result.append(input[bottom][j])
            }
            bottom -= 1
        }
        
        if (left <= right) {
            //left column
            for i in stride(from: bottom, through: top, by: -1) {
                result.append(input[i][left])
            }
            left += 1
        }
        
        helperForSpiralOrder(input: input, left: left, right: right, top: top, bottom: bottom, result: &result)
    }
}

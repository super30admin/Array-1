//
//  Untitled.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/6/26.
//

class DiagonalTraversal {
    
    
    init() {
        let input: [[Int]] = [[1,2,3], [4,5,6], [7,8,9]]
        let output = diagonalTraversal(input)
        print("output \(output)")
    }
    
    func diagonalTraversal(_ nums: [[Int]]) -> [Int] {
        let m = nums.count
        let n = nums[0].count
        var result = Array(repeating: 0, count: nums.count * nums[0].count)
        
        var r = 0
        var c = 0
        var flag = true //upward direction
        for i in 0..<result.count {
            result[i] = nums[r][c]
            
            //get next r,c
            if (flag) {
                //upward direction
                if (c == n - 1) {
                    //the right most
                    flag = false
                    r += 1
                } else if (r == 0) {
                    //roof but not right
                    //flip the direction
                    flag = false
                    c += 1
                } else {
                    r -= 1
                    c += 1
                }
            } else {
                //downward direction
                if (r == m - 1) {
                    flag = true
                    c += 1
                } else if (c == 0) {
                    flag = true
                    r += 1
                } else {
                    c -= 1
                    r += 1
                }
            }
        }
        
        return result
    }
}

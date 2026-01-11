//
//  ProductOfArrayExceptSelf.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/5/26.
//

class productOfArrayExceptSelf {
    
    init() {
        let productExceptSelfAtEachIndex = productExceptSelf(nums: [1, 2, 3, 4, 5])
        print("product ** \(productExceptSelfAtEachIndex)")
        
        let productExceptSelf = productExceptSelfBySavingSpace(nums: [1, 2, 3, 4, 5])
        print("product except self \(productExceptSelf)")
    }
    
    /*
     time compelxity - O(n)
     space complexity - O(3n) = O(n)
     */
    func productExceptSelf(nums: [Int]) -> [Int] {
        //forward pass left to right
        var leftToRightProduct = Array(repeating: 0, count: nums.count)
        leftToRightProduct[0] = 1
        for index in 1..<nums.count {
            leftToRightProduct[index] = leftToRightProduct[index - 1] * nums[index - 1]
        }
        
        //forward pass right to left.
        var rightToLeftProduct = Array(repeating: 0, count: nums.count)
        rightToLeftProduct[nums.count - 1] = 1
        //use stride to loop from back of the array to front
        for index in stride(from: (nums.count - 2), through: 0, by: -1) {
            rightToLeftProduct[index] = rightToLeftProduct[index + 1] * nums[index + 1]
        }
        
        var finalResultArray = Array(repeating: 0, count: nums.count)
        for index in 0..<nums.count {
            finalResultArray[index] = leftToRightProduct[index] * rightToLeftProduct[index]
        }
        
        return finalResultArray
    }
    
    //save space
    /*
     space complexity = O(1) - because input output space are not considered in auxilliary space.
     */
    func productExceptSelfBySavingSpace(nums: [Int]) -> [Int] {
        var rp = 1
        var result = Array(repeating: 0, count: nums.count)
        result[0] = 1 //
        //forward pass left to right
        for index in 1..<nums.count {
            rp = rp * nums[index - 1]
            result[index] = rp
        }
        
        //forward pass right to left.
        rp = 1 //reset running product
        
        //loop from back of the array to front
        for index in stride(from: (nums.count - 2), through: 0, by: -1) {
            rp = rp * nums[index + 1]
            result[index] = result[index] * rp
        }
        return result
    }
}

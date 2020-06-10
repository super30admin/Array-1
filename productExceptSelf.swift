// Time Complexity : (O)n
// Space Complexity : (O)1
// Did this code successfully run on Leetcode : yes
// find product of left and product ofr right then multiply both right and left


class Solution {
    func productExceptSelf(_ nums: [Int]) -> [Int] {
        var result = [Int](repeating:0, count: nums.count)
        //edge
        if nums.isEmpty {
            return result
        }
        var lp = 1
        var temp = 1
        //left pass
        for i in 0..<nums.count {
            lp = lp * temp
            result[i] = lp
            temp = nums[i]
        }
        var rp = 1
        temp = 1
        //right pass with calculating result
        for i in (0..<nums.count).reversed() {
            rp =  rp * temp
            result[i] = rp * result[i]
            temp = nums[i]
        }
        return result
    }
}
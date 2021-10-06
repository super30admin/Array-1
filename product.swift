// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

    func productExceptSelf(_ nums: [Int]) -> [Int] {
        if nums.count == 0 || nums == nil {
            return []
        }
        var output = nums
        output[0] = 1
        for i in 1..<output.count {
            output[i] =  output[i-1] * nums[i-1]
        }
        var productRight = 1
        for i in (0..<output.count).reversed() {
            output[i] *= productRight
            productRight *= nums[i]
        }
        return output
    }
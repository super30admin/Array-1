// Time complexity: O(N)
// Space complexity: O(1)


func productExceptSelf(_ nums: [Int]) -> [Int] {
    
    var answer = [Int](repeating:1, count: nums.count)
    var rightValue = 1
    
    for index in 1..<nums.count {
        answer[index] = answer[index-1] * nums[index - 1]
    }
    
    for (index, _ ) in nums.enumerated().reversed() {
        print(index)
        answer[index] *= rightValue
        rightValue *= nums[index]
    }
    
    return answer
}

var myArray = [4,5,1, 8,2, 10,6]
productExceptSelf(myArray)

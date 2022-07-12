// Time Complexity :  O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
func productExceptSelf(nums []int) []int {
    if len(nums) == 0{
        return []int{}
    }
    
    rp:=1
    
    result := make([]int,len(nums))
    result[0] = rp
    //left running product
    for i:=1;i<len(nums);i++{
        rp = rp*nums[i-1]
        result[i] = rp
    }

    rp = 1
    result[len(nums)-1] =  result[len(nums)-1]*rp
    for i:=len(nums)-2;i>=0;i--{
        rp = rp*nums[i+1]
        result[i] = result[i]*rp
    }
    
    return result
    
}

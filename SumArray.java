// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


class SumArray{
    public int[] sum(int arr[]){
    int temp = 1;
    int res[] = new int[nums.length];
    for(int i=0; i<nums.length; i++){ // Move from left to right by summing.
        res[i] = temp;
        temp = temp*nums[i];
    }
    int temp1 = 1; 
    for(int i=nums.length-1; i>=0; i--){ 
        res[i] = res[i] * temp1; // move from right to left and also summ with each other.
        temp1 = temp1*nums[i];
    }
    return res;
    }
}
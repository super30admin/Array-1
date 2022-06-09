/*
This approach solves the problem by first computing the left products of all the elements, and then the 
right products. The left product is defined as the product of all the elements to the left of a given
element, and subsequently the right product is the product of all the elements to the right of a given 
element. Since the product of the element except itself is the multiplication of the left and right 
products, we just multiply the left and right products for all elements and get the final array.

Did this code run in leetcode: Yes

Any problems with this code: No
*/
class Solution {
    //Time Complexity: O(n)
    //Space Complexity O(1)
    public int[] productExceptSelf(int[] nums) 
    {    
        int[] answer = new int[nums.length];
        int p = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(i == 0)
            {   //We maintain left product of leftmost element as 1 
                p = 1;
                answer[i] = p;
            }
            
            else
            {
                p *= nums[i-1];
                answer[i] = p;
                
            }
        }
        
        for(int i = answer.length - 1; i >= 0; i--)
        {
            if(i == answer.length - 1)
            {   //We maintain right product of rightmost element as 1 
                p = 1;
                answer[i] *= p;
            }
                
            
            else
            {   
                p *= nums[i+1];
                answer[i] *= p;
            }
        }
        
        return answer;
    }
}
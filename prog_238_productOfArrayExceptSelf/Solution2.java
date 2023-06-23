package prog_238_productOfArrayExceptSelf;

public class Solution2 {
/*
Approach 1 :
In this Solution, first we will calculate the total product of all the nums, once total is calculated we will pass again with each element in array and we will divide the total by that current number and we will get the product.
For eg :
[1,2 ,3 ,4, 5] total 120
[120/1, 120/2, 120/3, 120/4, 120/5]
[120, 60, 40, 30, 24]
But they have given that we can not use division operation

Approach 2 :
In this Approach we will perform nested iteration and we will calculate the product of all the values except the current array value.
Time complexity : O(n2) nsquare

Approach 3:
We will maintain 2 arrays, one for left product and other for right product.
We also we be maintaining the RunningLeft and RunningRight product.
The RunningLeft product at current index will be the total product * current index - 1
[1, 2, 3, 4,5]
RunningLeft = 1
At value 2 : RunningLeft = prev runningleft * current index -1 ====>  1*1 =1
[1,] RunningLeft = 1
At value 2 : RunningLeft = 1 * 1 = 1
[1, 1]
At value 3 : RunningLeft = 1 * (curr index -1 )= 1*2 = 2
[1,1,2]

At value 4 : RunningLeft = 2 * (curr index -1 ) = 2 * 3 = 6
[1,1,2,6]

At value 5 : RunningLeft = 6 * (curr -1 ) = 6 * 4 = 24
[1,1,2,6,24]

We will do the same for product of  runningright
[120, 60, 20, 5, 1]
Once we get all both the product we will have output array which will product of left and right running product array.
[120, 60, 40, 30, 24]

Time complexity : O(N) + O(N) + O(N) = 3 O(N) = O(N)
Time complexity : O(N) + O(N)  = 2 O(N) = O(N)

Approach 4 :
As given in problem, we have to perform Space complexity O(1) (which is excluding output array)
In this case we will be first calculating leftproduct and storing it into output array.
So our output array with the leftproduct will be [1, 1, 2, 6, 24]

Now we will be starting with the last index and we will be calculating the right product.
once right product is calculated, we will be multiplying the calculated right product with the output array current value.
left : [1, 1, 2, 6, 24]
[1, 2, 3, 4, 5]
At value 5 we will
rightProd = 1
at 24* 1
output [1,1,2,6,24]

At value 4 rightprod = prev prod * (currindex+1) = 1 * 5 = 5
5*6 = 30
output [1,1,2,30,24]

At value 3 rightprod = prevProduct *(currindex+1) = 5 * 4 = 20
20 * 2 = 40
output [1,1,40,30,24]

At value 2 rightProd = prevProduct * (currindex+1) = 20 * 3 = 60
60 * 1
output [1,60,40,30,24]

At value 1 rightProd = prevProduct * (currindex+1) = 60 * 2 = 120
120 * 1
output [120,60,40,30,24]

Time complexity : O(N) + O(N) = 2 O(N) = O(N)
Space complexity : O(1)

*/

    public int[] productExceptSelf(int[] nums) {

        int output[] = new int[nums.length];
        int leftProd  = 1 ;
        for(int i=0; i<=nums.length-1; i++){
            if(i==0){
                leftProd = 1;
                output[i] = leftProd ;
            }
            else{
                leftProd = leftProd * nums[i - 1];
                output[i] = leftProd ;

            }
        }
        int rightProd = 1 ;
        for(int i =nums.length-1; i>=0; i--){
            if(i==nums.length-1){
                rightProd = 1;

            }
            else{
                rightProd = rightProd * nums[i + 1];


            }
            output[i] = output[i] * rightProd ;
        }
        return output ;
    }
}

/* Problem Statement:
WORKS ON LEETCODE

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).

Follow up: Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

 *
 * Time Complexity : O(n)
 * Space Complexity : O(1) considering the final array not to be part of the space complexity 
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<math.h>




/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int numsSize, int* returnSize){
    int *final_arr = NULL;
    int idx = 0;
    int reverse_prod = 0;
    
    if (!nums) {
        printf("Nums array is NULL\n");
        return final_arr;
    }
    
    final_arr = (int *)malloc(numsSize * sizeof(int));
    if (!final_arr) {
        printf("Memory allocation failed for the output array\n");
        return final_arr;
    }
    /* Initialize int array with 1 */
    for (idx = 0; idx < numsSize; idx++) {
        final_arr[idx] = 1;
    }
    /* Go in forward direction and get the product of all the numbers to the left of nums[i] */
    for (idx = 1; idx < numsSize; idx++) {
        final_arr[idx] = nums[idx - 1] * final_arr[idx - 1];
    }
    /* reverse_prod will store the product of all the numbers to the right of nums[i] */
    /* Multiply it with final_arr so that for each number we get the left side and right side products */
    reverse_prod = 1;
    for (idx = numsSize - 1; idx >= 0; idx--) {
        final_arr[idx] *= reverse_prod;
        reverse_prod *= nums[idx];
    }
    /* final array return */
    *returnSize = numsSize;
    return final_arr;
}





int main(int argc, char *argv[]) {
    int *num_p = NULL;
    int *final_arr = NULL;
    int returnSize = 0;
    int idx = 0;
    if (argc < 2) {
        printf("Usage: ./a.out <num1> ... <num n>\n");
        exit(1);
    }
    printf("Input size array : %d \n", argc - 1);

    num_p = (int *)malloc((argc - 1)*sizeof(int));
    if (num_p == NULL) {
        printf("Memory allocation failed \n");
        return -1;
    }

    /* Dont want to change the function, so copying the input to int array */
    for (idx = 1; idx < argc; idx++) {
        num_p[idx - 1] = atoi(argv[idx]);
    }

    final_arr = productExceptSelf(num_p, argc - 1, &returnSize);
    printf("Product of numbers except self are : ");
    for (idx = 0; idx < returnSize; idx++) {
        printf(" %d ", final_arr[idx]);

    }
    printf("\n");

    free(num_p);
    free(final_arr);
    return 0;
}



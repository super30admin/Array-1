/* Problem Statement:
WORKS ON LEETCODE
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

] Output: [1,2,3,6,9,8,7,4,5] Example 2:

Input:

[

[1, 2, 3, 4],

[5, 6, 7, 8],

[9,10,11,12]

] Output: [1,2,3,4,8,12,11,10,9,5,6,7]

 *
 * Time Complexity : O(n)
 * Space Complexity : O(1) (excluding the final array which is part of requirement of leetcode function )
 */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>




/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize){
    int *final_arr = NULL;
    int total_cnt = 0, matrix_size = 0;
    int up_idx =0, right_idx =0, down_idx=0, left_idx = 0;
    int row = 0, col = 0;
    
    *returnSize = 0;
    /* Validations */
    if (!matrixSize) {
        return final_arr;
    }
    
    if (!(*matrixColSize)) {
        return final_arr;
    }

    matrix_size = (matrixSize * (*matrixColSize));
    
    /* Memory allocation for final array */
    final_arr = (int *)malloc(matrix_size * sizeof(int));
    if (!final_arr) {
        printf("Memory allocation failed for the output array\n");
        return final_arr;
    }
    /* Initialization of variables */
    /* up_idx : Specifies the boundary while coming upwards for the row */
    /* right_idx : Specifies the boundary while going towards the right for the column */
    /* down_idx : Specifies the boundary while going downwards  for the row */
    /* left_idx : Specifies the boundary while going back towards the start for the row */  
    /*
     *    left_idx---------------> right_idx
     *      ^                              |
     *      |    1       2        3        |
     *      |    4       5        6        |
     *      |    7       8        9        |
     *  right_idx----------------------down_idx
     *                               v
     */  
    /* Set boundaries */
    up_idx = 0; right_idx = *matrixColSize - 1; down_idx = matrixSize - 1; left_idx = 0;
    
    /* Base condition to stop the iteration */
    while (left_idx <= right_idx && (total_cnt < matrix_size)) {
        
        /* Iterate from left to right direction */
        for (col = left_idx; col <= right_idx; col++) {
    
            final_arr[total_cnt++] = matrix[up_idx][col];
            //printf("1: %d ", matrix[up_idx][col]);
        }
        /* from up to down direction */
        for (row = up_idx + 1; row <= down_idx; row++) {
            final_arr[total_cnt++] = matrix[row][right_idx];
            //printf("2: %d ", matrix[row][right_idx]);
        }
   
        /* Applicable for cases where there is only one row or only one column cases */
        if (total_cnt == matrix_size) {
            //printf("break\n");
            break;
        }
        
        /* From bottom right to bottom left iteration */
        for (col = right_idx - 1; col >= left_idx; col--) {
            final_arr[total_cnt++] = matrix[down_idx][col];
            //printf("3: %d ", matrix[down_idx][col]);
        }        
        
        /* from bottom left to top left iteration */
        for (row = down_idx - 1; row > up_idx; row--) {
            final_arr[total_cnt++] = matrix[row][left_idx];           
            //printf("4: %d ", matrix[row][left_idx]);
        } 
        /* Update the iterations so that we move in a spiral direction. Most important parameters to set correctly */  
        up_idx++;
        right_idx--;
        left_idx++;
        down_idx--;
    }
    *returnSize = total_cnt;
    return final_arr;

}



/* Main routine function */
int main(int argc, char *argv[]) {
    int *matrix[3] = {NULL,NULL,NULL};
    int arr1[3] = {1,2,3};
    int arr2[3] = {4,5,6};
    int arr3[3] = {7,8,9};
    matrix[0] = arr1;
    matrix[1] = arr2;
    matrix[2] = arr3;

    int *final_arr = NULL;
    int matrixSize = 3;
    int matrixColSize = 3;
    int returnSize = 0;
    int idx = 0;

    final_arr = spiralOrder(matrix, matrixSize, &matrixColSize, &returnSize);

    /* Sad !! we couldn't allocate memory. Check your system are you using a lot of memory !! :O */
    if (!final_arr) {
        exit(1);
    }

    for (idx = 0; idx < returnSize; idx++) {
        printf("%d ", final_arr[idx]);
    }
    printf("\n");
    free(final_arr);
    return 0;
}


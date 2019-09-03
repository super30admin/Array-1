/* Problem Statement:
WORKS ON LEETCODE
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

 

Example:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]

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
int* findDiagonalOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize){
    /* The output array */
    int *final_arr = NULL;
    /* Total count of elements in the final array */
    int total_elem = 0;
    *returnSize = 0;
    
    /* Handle empty array cases */
    if (matrixSize == 0 || *matrixColSize == 0) {      

        return final_arr;
    }
    /* Allocate memory for the output array */
    *returnSize = matrixSize * (*matrixColSize);
    final_arr = (int *)malloc(sizeof(int) * (*returnSize));
    
    if (!final_arr) {
        printf("Memory allocation failed\n");
        return final_arr;
    }
    /* For Debugging */
    //printf("total elements : r:%d c:%d \n", matrixSize, *matrixColSize);
    /* row_num for iterating over loop in rows */
    /* col_num for iterating over loop in column */
    /* row_iter_idx, col_iter_idx for moving around inside the matrix as per diagonal laws */
    
    int row_num =0, col_num = 0, col_iter_idx = 0, row_iter_idx = 0;
 
    /* Handle 1 row case */
    if (matrixSize == 1) {
        for (row_num = 0; row_num < *matrixColSize; row_num++)
        {
            final_arr[total_elem++] = matrix[0][row_num];
        }  
        //printf("return size: %d\n",total_elem);
        *returnSize = total_elem;
        return final_arr;
    }  
    /* Handle single column multi row case */
    if (*matrixColSize == 1) {
        for (row_num = 0; row_num < matrixSize; row_num++)
        {
            final_arr[total_elem++] = matrix[row_num][0];
        }  
        //printf("return size 2: %d\n",total_elem);
        *returnSize = total_elem;
        return final_arr;
    }  
    
    /* Store the first element [0][0] in the final array */
    final_arr[total_elem++] = matrix[row_num][col_num];
    
    //printf(" %d (%d, %d)\n",final_arr[total_elem], row_num, col_num);
    /* */
    for ( row_num=0,col_num=0; row_num < matrixSize && col_num < *matrixColSize;) {
        /* Till the point where we are not at the last column, we can take the 
         * next element in the row as per the diagonal logic 
         */
        if (col_num < (*matrixColSize - 1)) {
            final_arr[total_elem++] = matrix[row_num][col_num+1];
            //printf(" %d (%d, %d)\n",final_arr[total_elem], row_num, col_num+1);
        }
        /* From here onwards , we start moving as left as possible as per diagonal law */
        /* Move to the next row */
        row_iter_idx = row_num + 1;
        //printf("setting col_iter_idx:%d row_iter_idx:%d\n", col_iter_idx , row_iter_idx);
        /* Move till we reach the left most point keeping in checking the boundaries */
        while (col_iter_idx >= 0 && row_iter_idx < matrixSize) {
            final_arr[total_elem++] = matrix[row_iter_idx][col_iter_idx];
            //printf(" %d (%d, %d)\n",final_arr[total_elem], row_iter_idx, col_iter_idx);
            row_iter_idx++; col_iter_idx--;
        }
        /* Increment col_iter_idx as it would have moved one step extra */
        col_iter_idx++;
        /* If row has jumped out of the matrix, time to keep it in check again */
        if (row_iter_idx >= matrixSize) {
            row_iter_idx = matrixSize - 1;
            /* 
            * This row would have jumped in case where the column has not reached zero, but
            * row has reached ie we are somewhere in the middle of the last row 
            *Here we want to move column extra  as we will print the element to the right */
            col_iter_idx++;
        }
        /* Now we start moving back diagonally upwards keeping in check the boundaries */
        while (row_iter_idx >= 0 && col_iter_idx < (*matrixColSize)) {
            final_arr[total_elem++] = matrix[row_iter_idx][col_iter_idx];
            //printf(" h3 %d (%d, %d)\n",final_arr[total_elem], row_iter_idx, col_iter_idx);
            row_iter_idx--;col_iter_idx++;
        }
        /* Update the indexes as it may have moved out of the boundary */
        row_iter_idx++;
        col_iter_idx--;
        /* Update row_num and col_num for keeping in track the matrix calculation */
        row_num = row_iter_idx;
        col_num = col_iter_idx;   
        //printf("iteration: row_num: %d col_num: %d\n",row_num,col_num);
    }
    //printf("\n");
    *returnSize = total_elem;
    return final_arr;

}

/* Main routine function */
int main(int argc, char *argv[]) {
    int *matrix[3] = {NULL,NULL,NULL};
    //matrix[0] = malloc(3 * sizeof(int));
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
    /* Execute the dynamic programming solution for best result */

    final_arr = findDiagonalOrder(matrix, matrixSize, &matrixColSize, &returnSize);

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


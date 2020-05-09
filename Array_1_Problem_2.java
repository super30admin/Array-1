//Time Complexity : O(n)
//Space Complexity: O(n)
//Run successfully on leetcode
//Problem : Finding the optimal pattern


//In this problem i'm taking each and every diagonal
//The first diagnonal (0,0 (Just 1 element)) index will be reversed order, next will be natural order
//Third will be in reversed order
//In this way we will be able to achieve the required pattern


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_1_Problem_2 {

    public static int[] findDiagonalOrder(int[][] matrix) {
        ArrayList<Integer> ar= new ArrayList<>();
        boolean flag = true;
        for(int i=0;i<matrix[0].length;i++)
        {
            ArrayList<Integer> inner = new ArrayList<>();
            inner = getElements(matrix,0,i);
            if(flag){
                Collections.reverse(inner);
                ar.addAll(inner);
                flag=!flag;
            }
            else
            {
                ar.addAll(inner);
                flag=!flag;
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            ArrayList<Integer> inner = new ArrayList<>();
            inner = getElements(matrix,i,matrix[0].length-1);
            if(flag){
                Collections.reverse(inner);
                ar.addAll(inner);
                flag=!flag;
            }
            else
            {
                ar.addAll(inner);
                flag=!flag;
            }
        }

        int[] arr = new int[ar.size()];
        int index = 0;
        for(Integer i : ar)
        {
            arr[index] = i;
            index++;
        }


        return arr;
    }
    public static ArrayList<Integer> getElements(int[][] matrix,int i,int j)
    {
        ArrayList<Integer> ar = new ArrayList<>();
        while(i<matrix.length && j<matrix[0].length && j>=0)
        {
            ar.add(matrix[i][j]);
            i++;
            j--;
        }
        return ar;
    }
    public static void main(String[] args) {
        int[][] matrix ={{ 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }};
        findDiagonalOrder(matrix);
    }
}

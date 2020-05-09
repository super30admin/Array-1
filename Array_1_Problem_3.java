//Time Complexity : O(n)
//Space Complexity: O(n)
//Run successfully on leetcode
//Problem : Finding the optimal pattern

//As i was absent in the lecture due to my finals, i tried to come up with my own solution
//I'm using a linkedhashset to maintain the order and for checking if the element has occureced or not
//If it has already occured, we need to go into inner loop of the matrix
//if all the elements around it have already been occured, it might be the last element. In this case we will return.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Array_1_Problem_3 {
    static LinkedHashSet<Integer> ar = new LinkedHashSet<>();
    public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<Integer>();
        goRight(matrix,0,0);
        ArrayList<Integer> arr = new ArrayList<>(ar);
        ar.clear();
        return arr;
    }
    public static void goRight(int[][] matrix,int r,int c)
    {
        while(c<matrix[0].length)
        {
            if(ar.contains(matrix[r][c]))
            {
                if(checkdirs(matrix, r, c))
                {
                    return;
                }
                r++;
                c--;
                goDown(matrix,r,c);
            }
            ar.add(matrix[r][c]);
            c++;
        }
        r++;
        c--;
        goDown(matrix,r,c);
    }
    public static void goDown(int[][] matrix,int r,int c)
    {
        while(r<matrix.length)
        {
            if(ar.contains(matrix[r][c]))
            {
                if(checkdirs(matrix, r, c))
                {
                    return;
                }
                r--;
                c--;
                goLeft(matrix,r,c);
            }
            ar.add(matrix[r][c]);
            r++;
        }
        c--;
        r--;
        goLeft(matrix,r,c);
    }
    public static void goLeft(int[][] matrix,int r,int c)
    {
        while(c>=0)
        {
            if(ar.contains(matrix[r][c]))
            {
                if(checkdirs(matrix, r, c))
                {
                    return;
                }
                r--;
                c++;
                goUp(matrix,r,c);
            }

            ar.add(matrix[r][c]);
            c--;
        }
        r--;
        c++;
        goUp(matrix,r,c);
    }
    public static void goUp(int[][] matrix,int r,int c)
    {
        while(r>=0)
        {
            if(ar.contains(matrix[r][c]))
            {
                if(checkdirs(matrix, r, c))
                {
                    return;
                }
                r++;
                c++;
                goRight(matrix,r,c);
            }
            ar.add(matrix[r][c]);
            r--;
        }
    }
    public static boolean checkdirs(int[][] matrix,int r,int c)
    {
        boolean b = true;
        int[][] dirs = {{0,1},{0,-1},{-1,0},{1,0},{-1,-1},{1,-1},{-1,1},{1,1}};
        for(int[] dir : dirs)
        {
            int i = r + dir[0];
            int j = c + dir[1];
            if(i>=0 && j>=0 && i<matrix.length && j<matrix[0].length)
            {
                if(!ar.contains(matrix[i][j]))
                {
                    return false;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] matrix ={{ 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }};
        int[][] matrix2 = {{1,2},{3,4}};
        spiralOrder(matrix);

    }
}

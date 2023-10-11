// here we have have 4 pointers
//top , bottom , left , right
//with every increment we handle the elements we want to display

//Time Complexity: O(mxn)
//Space Complexity: O(1)

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static void main(String[] args){
        int nums[][] ={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = new ArrayList<Integer>();

        result = spiralOrder(nums);

        System.out.println("List: " + result);
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom  = matrix.length - 1;

        List<Integer> list = new ArrayList<>();

        while(left<=right && top<=bottom)
        {
            //top
            for(int j=left; j <=right; j++)
            {
                list.add(matrix[top][j]);
            }
            top++;

            //right
                for(int i= top; i<=bottom; i++)
                {
                    list.add(matrix[i][right]);
                }
                right--;

            //right to left, bottom row 
            if(top<=bottom)
            {
                for(int j=right; j >=left; j--)
                {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }

            //bottom to top
            if(left<=right)
            {
                for(int j=bottom; j >=top; j--)
                {
                    list.add(matrix[j][left]);
                }
                left++;
            }
        }
        
    return list;

    }
}

// Time Complexity :O(m*n) --> the while and for loops combined will run a total of m*n times(total elements in the matrix);
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// The idea is to traverse in a square and decrease the length of the side by 1 on changing the direction(reaching the edges)
// and updating starting and ending positions of rows and columns. After printing a side completely check if number of elements printed 
// is equal to number of elements in the matrix.

public class spiralPattern {
    public static void printpattern(int[][] nums){
        if(nums.length==0){
        System.out.println("Empty Matrix");
        return;
        }
        int startrow = 0;
        int startcolumn = 0;
        int endrow = nums.length-1;
        int endcolumn = nums[0].length-1;
        int count = 0;
        while(true){
            //traverse from left to right 
            for(int i = startcolumn;i<=endcolumn;i++){
                System.out.println(nums[startrow][i]);
                count++;
            }
            if(count==nums.length*nums[0].length)
                break;
            startrow++;
            //traverse from top to bottom
            for(int i = startrow;i<=endrow;i++){
                System.out.println(nums[i][endcolumn]);
                count++;
            }
            if(count==nums.length*nums[0].length)
                break;
            endcolumn--;
            //traverse from right to left
            for(int i = endcolumn;i>=startcolumn;i--){
                System.out.println(nums[endrow][i]);
                count++;
            }
            if(count==nums.length*nums[0].length)
                break;
            endrow--;
            //traverse from bottom to up
            for(int i = endrow;i>=startrow;i--){
                System.out.println(nums[i][startcolumn]);
                count++;
            }
            if(count==nums.length*nums[0].length)
                break;
            startcolumn++;
        }
    }
    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        printpattern(nums);
    }
}

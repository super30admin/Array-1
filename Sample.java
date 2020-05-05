import java.util.*;

class Solution {

    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes

    // Your code here along with comments explaining your approach
    /*
    Problem 1: 
    [1,2,3,4] => 1, 1, 2, 6
                 24,12,4, 1
    1. Calculate cumulative product from left to right and store it an array.
    2. Similarly calculate from right to left. (As described in above example)
    3. Get product of both the arrays
    */

    public int[] productExceptSelf(int[] nums) {

        if(nums == null || nums.length == 0)
            return nums;
            
        int size = nums.length;
        int left[] = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i<size; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        int right[] = new int[nums.length];

        right[size-1] = 1;
        for(int i = size-2; i>=0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        int[] res = new int[size];

        for(int i=0; i<size; i++) {
            res[i] = left[i] * right[i];
        }

        return res;
    }

    // Time Complexity : O(N*M)
    // Space Complexity : O(N*M)
    // Did this code successfully run on Leetcode : Yes

    // Your code here along with comments explaining your approach
    /*
    Problem 2
    1. Diagonal elements with index position (i, j) have sum of (i+j).
    2. Map the elements according to the sum.
    3. Add into final array as per the order. e.g. 1st, 3rd, 5th diagonal elements are in reverse order while 2nd,
    4th are regular order.
    */

    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0){
            return new int[]{};
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int max = (m-1)+(n-1);
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                int index = i+j;
                if(!map.containsKey(index)) {
                    map.put(index, new ArrayList<Integer>());
                }
                
                map.get(index).add(matrix[i][j]);
            }
        }
        
        int[] res = new int[m*n];
        int k = 0;
        
        for(int i=0; i<=max; i++) {
            
            List<Integer> list = map.get(i);
            
            if(i%2 == 0) {
                for(int j=list.size()-1; j>=0; j--){
                    res[k] = list.get(j);
                    k++;
                }
            }
            else {
                for(int j=0; j<list.size(); j++){
                    res[k] = list.get(j);
                    k++;
                }
            }
            
        }
        
        return res;
        
    }

    // Time Complexity : O(N) Where N is total elments OR O(N*M) Where N is number of rows and M is number of columns
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes

    // Your code here along with comments explaining your approach
    /*
    Problem 3
    For spiral traversal follow predefined steps:
    1. Traverse first row, changing column from first to last
    2. Traverse last column, changing row from first to last
    3. Traverse last row, changing column from last to first
    4. Traverse first column, chaging roe from last to first
    Above 4 steps keep repeating by shrinking the rows and columns 
    */

    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0)
            return list;
        
        int r1 = 0, r2 = matrix.length-1;
        int c1 = 0, c2 = matrix[0].length - 1;
        
        while(r1 <= r2 && c1 <= c2) {
            
            for(int i=c1; i<=c2; i++) {
                list.add(matrix[r1][i]);
            }
            r1++;
            
            for(int i=r1; i<=r2; i++) {
                list.add(matrix[i][c2]);
            }
            c2--;
            
            if(r1 <= r2) {
                
                for(int i=c2; i>=c1; i--) {
                    list.add(matrix[r2][i]);
                }
            }
            r2--;
            
            if(c1 <= c2) {
                
                for(int i = r2; i>= r1; i--) {
                    list.add(matrix[i][c1]);
                }
            }
            c1++;
        }
        
        return list;
        
    }

}
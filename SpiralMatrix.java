// Time Complexity :O(mxn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: traversing in an array with left,right,bottom and top

// Your code here along with comments explaining your approach
public class SpiralMatrix {
    public  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int down=m-1;
        // List<Integer> list=new ArrayList<>();
        while(left<=right && top<=down){
            // top
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            //col
            if(left<=right && top<=down){
                for(int i=top;i<=down;i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            if(left<=right && top<=down){
                for(int i=right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
                down--;
            }
            if(left<=right && top<=down){
                for(int i=down;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }

}
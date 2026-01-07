//way1
//initiate top=0,left=0,right=col-1,bottom=row-1
//boundaries are shrinking every time.
//So, inc top and left; dex right and bottom
//Do a traversal based on above four values
//tc: O(m*n); sc:O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int top=0,left=0,bottom=m-1,right=n-1;
        List<Integer> ans=new ArrayList<>();
        int idx=0;

        while(top<=bottom && left<=right){
            //right

            if(top<=bottom && left<=right){
                for(int i=left;i<=right;i++)
                {
                    ans.add(matrix[top][i]);
                    idx++;
                
                }
                top++;
            }
            

            //down
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
                idx++;
                
            }
            right--;
            }
            

            //left
            if(top<=bottom && left<=right){
                 for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
                idx++;
                
            }
            bottom--;
            }
           

            //up
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
                idx++;
               
            }
             left++;

            }
            
        }

        return ans;
    }
}

//way2
//initiate top=0,left=0,right=col-1,bottom=row-1
//boundaries are shrinking every time.
//So, inc top and left; dex right and bottom
//Do a traversal based on above four values
//tc: O(m*n); sc:O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int top=0,left=0,bottom=m-1,right=n-1;
        List<Integer> ans=new ArrayList<>();
       
        helper(matrix,top,left,bottom,right,ans);
        return ans;
    }

    private void helper(int[][] matrix, int top,int left, int bottom, int right,List<Integer> ans){

        if(top>bottom || left>right){
            return;
        }

         //right

            if(top<=bottom && left<=right){
                for(int i=left;i<=right;i++)
                {
                    ans.add(matrix[top][i]);
                }
                top++;
            }
            

            //down
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
               
            }
            right--;
            }
            

            //left
            if(top<=bottom && left<=right){
                 for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
                
            }
            bottom--;
            }
           

            //up
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
               
            }
             left++;

            }

            helper(matrix,top,left,bottom,right,ans);
           

    }
}

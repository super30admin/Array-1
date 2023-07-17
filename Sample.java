// Time Complexity : O(n)
// Space Complexity : O(1) if we dont count result array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: denote an array for leftProduct of each number, then reverse traverse(n-2) multiply the current element by (current+1)element and right product of current+1 elemenet.

// Your code here along with comments explaining your approach

public int[] productExceptSelf(int[] nums) {
        //solution with 2 arrays for left and right product except self.
        // int n=nums.length;
        // int[] left = new int[n];
        // int[] right= new int[n];
        // left[0]=1;
        // right[n-1]=1;

        // for(int i=1;i<n;i++){
        //     left[i]=left[i-1]*nums[i-1];
        // }
        // for(int i=n-2;i>=0;i--){
        //     right[i]=right[i+1]*nums[i+1];
        // }

        // for(int i=0;i<n;i++){
        //     left[i]=left[i]*right[i];
        // }
        // return left;

        //space optimization.
        int n=nums.length;
        int[] left = new int[n]; //array for left product
        left[0]=1;

        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1]; //traversal for left product
        }
        int right=1;
        for(int i=n-2;i>=0;i--){
            left[i]=left[i]*right*nums[i+1]; //multiply left product with right product
            right=right*nums[i+1]; //update right product value
        }  

        return left; //return

        // int n=nums.length;
        // int[] res = new int[n];
        // res[0]=1;
        // int rp=1;
        // for(int i=1;i<n;i++){
        //     rp=rp*nums[i-1];
        //     res[i]=rp;
        // }
        // rp=1;
        // for(int i=n-2;i>=0;i--){
        //     rp=rp*nums[i+1];
        //     res[i]=res[i]*rp;
        // }
        // return res;
    }

//-----------------DIAGONAL TRAVERSAL-----------------------
// Time Complexity : O(m*n)
// Space Complexity : O(1) if we dont count result array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: Traverse the array in upward and downward direction and change direction whenever we hit a boundry. 
// Your code here along with comments explaining your approach
public int[] findDiagonalOrder(int[][] mat) {
        int row= mat.length;
        int col= mat[0].length;
        int r=0,c=0;
        boolean upward=true; //initial direction upward
        int[] res= new int[row*col]; //result array is array containing all elements
        for(int idx=0;idx<res.length;idx++){
            res[idx]=mat[r][c]; //add element to res array
            //go to next
            if(upward){
                if(c== col-1){ //last column if last column then change direction to downward
                    upward=false;
                    r++;
                }
                else if(r==0){ //reached final row, above if condition will change direction automatically.
                    c++;
                }
                else{ //middle element and upward is true so next upward element
                    r--;
                    c++;
                }
            }
            else{ //downward direction
                if(r==row-1){ //final row, change direction
                    upward=true;
                    c++;
                }
                else if(c==0){
                    upward=true;
                    r++;
                }
                else{ //middle element: take next element downward
                    r++;
                    c--;
                }

            }
            
        }
        return res;
    }

//---------------------------------SPIRAL TRAVERSAL------------------------
// Time Complexity : O(m+n)
// Space Complexity : O(1) if we dont count result list
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: Denote 4 variables, left right top bottom, iterate within the matrix bounds of these variables.

// Your code here along with comments explaining your approach
List<Integer> res1= new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res= new ArrayList<>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        // while(top<=bottom && left<=right){
        //     //traverse on top row from left to right
        //     for(int j=left;j<=right;j++){
        //         res.add(matrix[top][j]);
        //     }
        //     top++;

        //     //traverse on right col
        //     //if(top<=bottom && left<=right){
        //         for(int j=top;j<=bottom;j++){
        //             res.add(matrix[j][right]);
        //         }
        //         right--;
        //     //}

        //     //traverse on bottom row
        //     if(top<=bottom){
        //         for(int j=right;j>=left;j--){
        //             res.add(matrix[bottom][j]);
        //         }
        //     bottom--;
        //     }
        //     //traverse on left col
        //     if(left<=right){
        //         for(int j=bottom;j>=top;j--){
        //             res.add(matrix[j][left]);
        //         }
        //         left++;
        //     }
        // }
        // return res;

        //recursive
        dfs(matrix, top, bottom, left, right);
        return res1;
    }
    private void dfs(int[][] matrix, int top, int bottom, int left, int right){
        if(left>right || top>bottom) return;

            //traverse on top row from left to right
            for(int j=left;j<=right;j++){
                res1.add(matrix[top][j]);
            }
            top++;

            //traverse on right col
            //if(top<=bottom && left<=right){
                for(int j=top;j<=bottom;j++){
                    res1.add(matrix[j][right]);
                }
                right--;
            //}

            //traverse on bottom row
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    res1.add(matrix[bottom][j]);
                }
            bottom--;
            }
            //traverse on left col
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    res1.add(matrix[j][left]);
                }
                left++;
            }
        dfs(matrix, top, bottom, left, right);
    }
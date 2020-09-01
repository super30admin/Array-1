// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

 /*
    4 pointer Top, left row, botom  
    1. top row 
        Left -> right 
        Top++ 

    2.right colum 
        Top -> bottom 
        right--; 

    if(top<= botton)
    3.Bottom row 
        Right -> left 
        Bottom--; 

     if(left<=right)
     4.left column 
        Bottom -> top 
        Left ++ 
    */
    
    public List<Integer> spiralOrder(int[][] arr) {
       if(arr==null || arr.length==0)
           return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int top=0, left=0;
        int bottom =arr.length-1;
        int right = arr[0].length-1;
        
        while(top<=bottom && left<=right){
            //1. top row
            for(int i=left; i<=right; i++){
                res.add(arr[top][i]);
            }
            top++;
            
            //2. Right column
            for(int i=top; i<=bottom; i++){
                res.add(arr[i][right]);
            }
            right--;
            
            //3. botton row
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }
            
            //4.left column 
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    res.add(arr[i][left]);
                }
                left++;
            }
        }
        return res; 
    }
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach:
Q1) 

class Solution {
    public int[] productExceptSelf(int[] nums) {
//loop through element except itself on left and calculate the running product
//same for the right looping 
//multiply the products on left and right
        
         int N= nums.length;
        //left will contain product of element to the left 
        int [] left = new int[N];
        int [] right = new int[N];
        int[] output = new int[N];
        right[N-1]=1;
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i-1] * left[i-1];
        }
        for(int i=N-2;i>=0;i--){
            right[i]= nums[i+1] *right[i+1];
        }
        for(int i=0;i<N;i++){
            output[i]=right[i]*left[i];
        }
        return output;
    }
} 


Q2) Spiral Matrix
public List<Integer> spiralOrder(int[][] matrix) {
        
    List<Integer>result = new ArrayList<Integer>();
    if(matrix.length==0) return result;
    int rowBegin =0;
    int rowEnd=matrix.length-1;
    int columnBegin=0;
    int columnEnd=matrix[0].length-1;
     
    while(rowBegin <= rowEnd && columnBegin <= columnEnd){
        //move left
        for(int i=columnBegin;i<=columnEnd;i++){
            result.add(matrix[rowBegin][i]);
        }
        rowBegin++;
        //move down
        for(int i=rowBegin;i<=rowEnd;i++){
            result.add(matrix[i][columnEnd]);
        }
        columnEnd--;
        
        //move right
        if(rowBegin <= rowEnd){
        for(int i=columnEnd;i>=columnBegin;i--){
            result.add(matrix[rowEnd][i]);
        }
        }
        rowEnd--;
        
        //move right
        if(columnBegin <= columnEnd)
        for(int i=rowEnd;i>=rowBegin;i--){
            result.add(matrix[i][columnBegin]);
        }
        
        columnBegin++;
    }
    return result;    
    }
     
 }
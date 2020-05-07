// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Product Of Self
//TC - O(n) SC - O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product =1,flag=0, count=0, multiplezero = 0;
        int output[] = new int[nums.length];
                            
        for(int i =0; i< nums.length ; i++){
            if(nums[i] != 0)
              product*= nums[i];
                else {flag=1;
                      count++;
                    if(count == nums.length)
                        return nums;
               }
        }
        for(int i=0;i<output.length; i++){
                if (count>1){
                output[i] = 0;
                    return output;
                }
            
                 else if(nums[i] !=0 && count<=1)
                 output[i] = (flag!=1) ? product / nums[i]: 0;
                
                 else
                output[i] = product;
        }
        return output; 
    }
}

//Diagonal Traverse
//TC - O(m.n)
//S.c = min(m,n)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return new int[0];
		}

		int rows = matrix.length, cols = matrix[0].length;
		int[] res = new int[rows * cols];
		int r = 0, c = 0;
    
		for (int i = 0; i < rows * cols; i++) {
			res[i] = matrix[r][c];
            
			// even sum diagonal
			if ((r + c) % 2 == 0) {
				if (r - 1 >= 0 && c + 1 < cols) {
					r = r - 1;
					c = c + 1;
				} else if (c + 1 < cols) {
					c = c + 1;
				} else {
					r = r + 1;
				}
			}
			// odd sum diagonal
			else if ((r + c) % 2 != 0) {
				if (r + 1 < rows && c - 1 >= 0) {
                    r = r + 1;
					c = c - 1;
				} else if (r + 1 < rows) {
					r = r + 1;
				} else {
					c = c + 1;
				}
			}
		}
		return res;
    }
}


//Spiral Order
//TC - O(n)
//SC - O(1) as i am returning the same list

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0)
            return list;
        
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int down = matrix.length-1;
        
        while(top<=down && left <=right){
            for(int i = left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            
            for(int i = top; i<=down; i++){
                list.add(matrix[i][right]);
            }
            right--;
            
            if(top<=down){
            for(int i = right; i>=left; i--){
                list.add(matrix[down][i]);
            }
            }down--;
            
            
            if(left<=right){
            for(int i = down; i>=top; i--){
                list.add(matrix[i][left]);
            }
            }
            left++;
            
        }
        
        return list;
        
    }
}
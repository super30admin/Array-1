using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace S30_Problems
{
    class Program
    {
        static void Main(string[] args)
        {
            Program p = new Program();
            p.SpiralOrder(new int[][] { new int[] { 1,2,3}, new int[] { 4,5,6 }, new int[] { 7,8,9 } });
        }

        // Time Complexity: O(2n) 
        // Space Complexity: O(1) since we are using the output array to store intermediate results and finally returning the array
        public int[] ProductExceptSelf(int[] nums) {
            int[] res = new int[nums.Length];
            res[0] = 1;
            int rSum = 1;
            for(int i = 1; i<nums.Length; i++){
                rSum*=nums[i-1];
                res[i] = rSum;
            }
            rSum = 1;
            for(int i = nums.Length-2; i>=0; i--){
                rSum *= nums[i+1];
                res[i] *= rSum;
            }
            return res;
        }

        // Time Complexity: O(m*n) 
        // Space Complexity: O(1)

        public int[] FindDiagonalOrder(int[][] mat) {
          bool dir = true;
          int n = mat.Length-1, m = mat[0].Length-1;
          int[] res = new int[(m+1)*(1+n)];
          int r = 0, c = 0;
          for(int i = 0; i<res.Length; i++){
              res[i] = mat[r][c];
              if(dir){
                  if(c == m){
                      r++; dir = false;
                  }else if(r == 0){
                      c++; dir = false;
                  }
                  else{
                      r--; c++;
                  }
              }else{
                  if(r == n){
                      c++; dir = true;
                  }else if(c == 0){
                      r++; dir = true;
                  }
                  else{
                      r++; c--;
                  }
              }
          }
          return res;
      }

        // Time Complexity: O(m*n) we will be visiting each element once
        // Space Complexity: O(2k + m*n) where k is Max(length, width) and m*n for the matrix

      IList<int> res = new List<int>();
      int[][] matrix;
      public IList<int> SpiralOrder(int[][] matrix) {
          this.matrix = matrix;
          helper(0, 0, matrix[0].Length-1, matrix.Length-1, 0, matrix[0].Length * matrix.Length);
          return res;
      }
      
      public void helper(int dir, int left, int right, int bottom, int top, int targetCount){
          dir = dir%4;
          switch(dir){
              case 0:
                  for(int i = left; i<=right; i++){
                      res.Add(matrix[top][i]);
                  }
                  top++;
                  break;
              case 1:
                  for(int i = top; i<=bottom; i++){
                      res.Add(matrix[i][right]);
                  }
                  right--;
                  break;
              case 2:
                  for(int i = right; i>=left; i--){
                      res.Add(matrix[bottom][i]);
                  }
                  bottom--;
                  break;
              default:
                  for(int i = bottom; i>=top; i--){
                      res.Add(matrix[i][left]);
                  }
                  left++;
                  break;
          }
          if(res.Count == targetCount) return;
          helper(++dir, left, right, bottom, top, targetCount);
      }
   }
}

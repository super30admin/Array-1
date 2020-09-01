// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*

    We run a loop until all the squares of loops are added to the list.
    In each outer loop, we traverse elements in clockwise order.
*/
class Solution {
    public List<Integer> spiralOrder(int[][] a) {
         int i, k = 0, l = 0; 
          List<Integer> res = new ArrayList<>();
            int m = a.length;
         if(m == 0) return res;
            int n = a[0].length;
       
        while (k < m && l < n) { 
            for (i = l; i < n; ++i) { 
                res.add(a[k][i]);
            } 
            k++; 
  
            for (i = k; i < m; ++i) { 
                res.add(a[i][n-1]);
            } 
            n--; 
  
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    res.add(a[m-1][i]);
                } 
                m--; 
            } 
  
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    res.add(a[i][l]);
                } 
                l++; 
            } 
        
    }
        return res;
    }
}
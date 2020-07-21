// Time Complexity :O(n*m)
// Space Complexity : O(n*m)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
  //walk the matrix in spiral way.
  //fulfilling 3 conditions, x & y >= 0
  //x & y < matrix.length and matrix[0].length.
  //and for x & y, xy not in hash set.(not seen).
// Your code here along with comments explaining your approach
class Solution {
    private int getLoc(int x, int y){
        return (10*x)+y;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();

        if(matrix.length == 0)
            return ret;

        int row = matrix.length;
        int col = matrix[0].length;
        //save locations in hashset to make sure we do not walk over,
        //seen values again.
        HashSet<Integer> hs = new HashSet();


        int x = 0;
        int y = 0;
        while(x >= 0 && y >= 0 && x < row && y < col &&
              !hs.contains(getLoc(x,y))){
            while(y < col && !hs.contains(getLoc(x,y))){
                hs.add(getLoc(x,y));
                ret.add(matrix[x][y]);
                y++;
            }
            x++;
            y--;

            while(x < row && !hs.contains(getLoc(x,y))){
                hs.add(getLoc(x,y));
                ret.add(matrix[x][y]);
                x++;
            }
            x--;
            y--;
            while(y >= 0 && !hs.contains(getLoc(x,y))){
                hs.add(getLoc(x,y));
                ret.add(matrix[x][y]);
                y--;
            }
            x--;
            y++;
            while(x >= 0 && !hs.contains(getLoc(x,y))){
                hs.add(getLoc(x,y));
                ret.add(matrix[x][y]);
                x--;
            }
            x++;
            y++;
        }
        return ret;
    }
}

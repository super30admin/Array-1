// Time Complexity : O(n * m) where n and m are dimensions of the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// To move in spiral we need to set boundary till which we can move
// We also need to set the path/direction in which we can move
// There are 4 direction in which movement is possible right, left, down and up
// When the limit to each direction is reached we will change directions clock wise
// We will declare limits l,r,t,b. 
// Once we have covered one row or column we will decrease the limit.
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll = new ArrayList<>();
        int l = 0;
        int r = matrix[0].length;
        int t = 0;
        int b = matrix.length;
        int x = 0, y = 0;
        String direction = "right";
        int size = r*b;
        ll.add(matrix[x][y]);
        while(ll.size() < size){
            if(direction == "right"){
                y++;
                if(y >= r){
                    direction ="down";
                    y--;
                    t++;
                }
                else{
                    ll.add(matrix[x][y]);
                }
            }
            else if(direction == "down"){
                x++;
                if(x >= b){
                    direction ="left";
                    x--;
                    r--;
                }
                else{
                    ll.add(matrix[x][y]);
                }
            }
            else if(direction == "left"){
                y--;
                if(y < l){
                    direction = "up";
                    y++;
                    b--;
                }
                else{
                    ll.add(matrix[x][y]);
                }
            }
            else if(direction == "up"){
                x--;
                if(x < t){
                    direction = "right";
                    x++;
                    l++;
                }
                else{
                    ll.add(matrix[x][y]);
                }
            }  
        }
        return ll;
        
    }
}
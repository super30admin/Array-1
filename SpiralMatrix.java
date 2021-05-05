/* 1. Define the directions and keep resetting the boundaries after traversing in a particular direction
2. Come out when all elements have been visited.
Time complexity: O(MN)
Space complexity: O(1)
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //setting up allthe boundaries
        int rightBound = matrix[0].length-1;
        int bottomBound = matrix.length-1;
        int leftBound = 0;
        int upperBound = 0;
        int j=0; int i=0;
        int dir=1; //start with [0][0] element and right direction
        List<Integer> output = new ArrayList<>();
        int count=0; //Count to keep a track of all the visited elements
        while(count<matrix[0].length*matrix.length) //making k==m*n will loop through one extra time. We have taken count from 0 
        {
            System.out.println("count is: "+count);
            if(dir==1) //right direction
            {
                while(j<=rightBound)
                {
                    output.add(matrix[i][j]);
                    count++; //increase the count as the node has been visited
                    j++;
                }
                j--;
                upperBound+=1;
                i++;
                dir=-2; //we need to go down now
            }
            else if(dir==-1) //left direction
            {
                while(j>=leftBound)
                {
                    output.add(matrix[i][j]);
                    count++;
                    j--;
                }
                j++;
                bottomBound-=1;
                i--;
                dir=2; //we need to go up now
            }    
            else if(dir==2) //top direction
            {
                while(i>=upperBound)
                {
                    output.add(matrix[i][j]);
                    count++;
                    i--;
                }
                i++;
                leftBound+=1;
                j++;
                dir=1; //we need to go right now
            }
            else //down direction
            {
                while(i<=bottomBound)
                {
                    output.add(matrix[i][j]);
                    count++;
                    i++;
                }
                i--;
                rightBound-=1;
                j--;
                dir=-1; //we need to go up now
            }
        }
        return output;
    }
}
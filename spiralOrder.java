/*

Run time complexity - O(N) where N is the number of elements in the array.(we are checking each element of the array once)

Space complexity - O(1) - there is no additional data structures used for this problem.
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if(matrix==null || matrix.length==0)
            return list;
        int R1=1;
        int C1=0;
        int R2 = matrix.length-1;
        int C2 = matrix[0].length-1;
        int r=0;
        int c=0;
        int dir=0;
        while((r>=R1 && r<=R2) || (c<=C2 &&c>=C1))
        {
            list.add(matrix[r][c]); // Add the element to the final list
            if(dir==0) // Start checking for the direction it was currently on.
            {
                if(c==C2) // Edge conditions
                {
                    C2--;
                    r++;
                    dir=(dir+1)%4; // we only have 4 directions totally.
                }
                else
                {
                    c++;
                }
            }
            else if(dir==1)
            {
                if(r==R2)
                {
                    c--;
                    R2--;
                    dir=(dir+1)%4;
                }
                else
                {
                    r++;
                }
            }
            else if(dir==2)
            {
                if(c==C1)
                {
                    C1++;
                    r--;
                    dir=(dir+1)%4;
                }
                else
                {
                    c--;
                }
            }
            else if(dir==3)
            {
                if(r==R1)
                {
                    c++;
                    R1++;
                    dir=(dir+1)%4;
                }
                else
                {
                    r--;
                }
            }
        }
        
        return list;
    }
}

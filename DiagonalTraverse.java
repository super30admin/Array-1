//Time complexity O(N);
//Space complexity O(1) bcz we are not using any extra space here other than the reuslt array;
//Succefuuly run in leetcode.




class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i=0,j=0,k=0;
        int M= mat.length,N = mat[0].length;
        int [] result = new int[M*N];
        while(i<M && j<N) //base condition
        {
            while(i>=0){ //upwarddirection decrement i and increment j
                
                result[k] = mat[i][j];
                k++;
                if(j==N-1) break;//break the upward direction when j goes to the last index
                i--;j++;
            }
            i++; //if you break just increment the i(go to the next row)
            if(i==M) break; // if i exceed the rows then break from the entire while loop.
            while(j>=0)//downward direction when i goes to the last index
            {
                
                result[k] = mat[i][j];
                k++;
                if(i==M-1) break;//break the upward direction when i goes to the last index
                i++;j--;
            }
            j++;//if you break just increment the j(go to the next column)
            if(j==N) break;//if j exceed the columns then break from the entire while loop.
        }
        return result;//resturn the return array.
    }
}
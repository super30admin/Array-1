

// Time Complexity: O(m*n)
// Space Complexity: O(1)
// Leetcode: # 498
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length, n=mat[0].length;
        
        int[] result=new int[m*n];
        int i=0; // result array index
        int r=0, c=0;
        
        while(i< m*n)
        {
            result[i]=mat[r][c];
            if((r+c) %2==0)// upward direction
            {
                //boundary condition1
                if(c==n-1)
                {
                    r++;

                }
                else if(r==0) //boundary condition2
                {
                    c++;

                }
                else
                {
                    r--;
                    c++;
                }
            }
            else // upward direction
            {
                 //boundary condition1
                if(r==m-1)
                {
                    c++;
                }
                else if(c==0) //boundary condition2
                {
                    r++;
                }
                else
                {
                    r++;
                    c--;
                }
            }
            i++;
        }
        
        return result;
    }
}


/*
// Time Complexity: O(m*n) for the input length is m*n. i.e, It is linear time in terms of input .
// Space Complexity: O(m*n)
// Leetcode: # 498
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        // key= i+j, value= list of all elements with their indices sum equal to key
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int sum=0;
        int[] result=new int[m*n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=i+j;
                // Store the elements based on their indices sum;
                if(!map.containsKey(sum))
                {
                    List<Integer> list=new ArrayList<Integer>();
                    map.put(sum,list);
                }
                map.get(sum).add(mat[i][j]);
            }
            
        }
        int i=0;
        List<Integer> diagonal=new ArrayList();
        for(Map.Entry<Integer,List<Integer>> e: map.entrySet())
        {
            diagonal=map.get(e.getKey());
            if(e.getKey() %2!=0)
            {                
                for(int j=0;j<diagonal.size();j++)
                    result[i++]= diagonal.get(j);
            }
            else
            {
                for(int j=diagonal.size()-1;j>=0;j--)
                    result[i++]= diagonal.get(j);
            }
                
            
        }
        
        return result;
        
    }
}

*/
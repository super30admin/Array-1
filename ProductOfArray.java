// Time Complexity: O(n)
// Space Complexity: O(1)
// Leetcode: #238
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] numsl=new int[n];
       
        numsl[0]=1;
    
        int lprod=numsl[0];
        int rprod=1;
        // Calculate left product array, numsl[]
        // Eg: nums=[1, 2, 3, 4]
        //    numsl=[1, 1, 2, 6]
        //   numsr=[24, 12, 4, 1]
        for(int i=1;i<n;i++)
        {
            lprod=lprod *nums[i-1];
            numsl[i]= lprod;
            
        }
        rprod= 1;
        // Insread of storing numsr[] separately, we can directly calculate each element value of numsr[i] and nultiply it with numsl[i]
        for(int i=1;i<n;i++)
        {
            //rprod has the numsr[n-i-1] value
            rprod=rprod*nums[n-i] ;
            //The below statement is same as numsl[n-i-1] * numsr[n-i-1]
            numsl[n-i-1]=numsl[n-i-1]*rprod;
        }
       
        
        return numsl;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
// Leetcode: #238
/*
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] numsl=new int[n];
        int[] numsr=new int[n];
        numsl[0]=1;
        numsr[n-1]=1;
        int lprod=numsl[0], rprod=numsr[n-1];
        for(int i=1;i<n;i++)
        {
            numsl[i]=lprod *nums[i-1];
            lprod=numsl[i];
            numsr[n-i-1]=rprod*nums[n-i];
            rprod= numsr[n-i-1];
        }
      
        for(int i=0;i<n;i++)
        {
            numsl[i]=numsl[i]*numsr[i];
        }
        
        return numsl;
    }
}
*/
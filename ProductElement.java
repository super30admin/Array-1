/*
TC: O(N)
SC: O(N)
THought process: As we have to skip the element and multiply its left and right side,
we will take two arrays to do this where left array will store left side of the multiplication
excluding current element and right side will take right sided multiplication excluding current element
/*

class ProductELement{

public int[] productExceptSelf(int[] nums) {

        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        left[0] = 1;
        for (int i= 1; i < nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[nums.length-1] = 1;
        for (int i = nums.length-2;i>= 0; i--){
            right[i] = right[i+1]*nums[i+1];
        }

        int ans[] = new int[nums.length];
        for (int i = 0; i < ans.length; i++){
            ans[i] = left[i] * right[i];
        }

        return ans;
    }

}
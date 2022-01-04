//Time complexity is O(n)
//Space complexity is O(1)

/*Approach: For any index if we have to claculate the product of all the elements
in the array except for itself, we can do it by taking the product of elements
to the left of it and product of all the elements to right of it and for each
index storing the resultant products in two vectors like left vector and right vector.
We can get the result by taking the product of left and right vectors. This approach
takes extra space as we are creating two vectors for left and right products and 
one for result. We can optimize it by taking right vector as the result vector
and using the left vector to calculate the running product and multiplying 
it with the result vector in the same for loop. This will save the extra space. */

//The code ran perfectly on leetcode.

class Solution
{
	public:
		vector<int> productExceptSelf(vector<int> &nums)
		{
			int n = nums.size();
			vector<int> ans(n, 1);

			for (int i = n - 2; i >= 0; i--)
			{
				ans[i] = ans[i + 1] *nums[i + 1];
			}
			int left = 1;
			for (int i = 0; i < n; i++)
			{
				ans[i] = left*ans[i];
				left = left*nums[i];
			}
			return ans;
		}
};


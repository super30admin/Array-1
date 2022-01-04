//Time complexity of this solution is O(m*n) where m is the rows and n is the columns
// Space complexity is O(1) as we are not creating any extra space for the solution

//Approach: Setting up boundaries:
//We have to go in the spiral, that is first right, then down, then left and
//then up. In order to go in this manner, we maintain four pointers which are left, right,
//bottom and top. The top points to the top row, left points to the first column, righ 
//points to the last column and bottom points to the last row. When we traverse the
//first row we are updating the top pointer to the next row, then we move in down 
//direction and update the right pointer by decrementing it by one, then we  traverse
//the bottom row from right to left and update the bottom pointer by decrementing it
//by one. In the last we move in the up direction and update the left counter by
//incrementing by one. This updating of boundaries takes care of the rows or columns
//which have been earlier visited and also avoid overlapping. We just need to make
//sure that the top <= bottom and left <= right.

//The code ran perfectly on leetcode.




class Solution
{
	public:
		vector<int> spiralOrder(vector<vector < int>> &matrix)
		{
			int left = 0;
			int right = matrix[0].size() - 1;
			int top = 0;
			int bottom = matrix.size() - 1;
			vector<int> result;
			while (left <= right && top <= bottom)
			{
				if (top <= bottom)
				{
					for (int i = left; i <= right; i++)
					{
						result.push_back(matrix[top][i]);
					}
					top++;
				}

				for (int i = top; i <= bottom; i++)
				{
					result.push_back(matrix[i][right]);
				}
				right--;

				if (top <= bottom)
				{
					for (int i = right; i >= left; i--)
					{
						result.push_back(matrix[bottom][i]);
					}
					bottom--;
				}
				if (left <= right)
				{
					for (int i = bottom; i >= top; i--)
					{
						result.push_back(matrix[i][left]);
					}
					left++;
				}
			}
			return result;
		}
};
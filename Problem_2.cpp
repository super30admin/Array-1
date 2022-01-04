//Time complexity if O(r*c)
//Space complexity is constant O(1)

/*Approach: We are using a flag to keep record of the direction. We are using three
pointer. 2 to traverse the matrix and 1 to traverse the resultant vector. If we 
are moving in the upward direction then we first have to check if we are at the 
last column or not, if we are then we move to the next row and change the direction
If we are at the top row but not the last column then also we have to change the
direction and move to the next column. If both these conditions are not true, then
we will just keep on increasing the column and decreasing the row as we are moving
diagonally in the upward direction.
In the downward direction if we are hitting the last row, Then we have to move to 
the next column and change the direction. If we are hitting the first column, we have
to increase the row and change the direction.If both these conditions are not true, then
we will just keep on increasing the row and decreasing the column as we are moving
diagonally in the upward direction.*/

//The code ran perfectly on leetcode.

class Solution
{
	public:
		vector<int> findDiagonalOrder(vector<vector < int>> &mat)
		{
			int r = mat.size();	//size of the rows
			int c = mat[0].size();	// size of the columns
			vector<int> output(r *c);	// resultant vector
			int i = 0, j = 0;	// for traversing the given matrices
			int k = 0;	// for the output vector traversing
			bool up = true;	// flag to check the direction

			while (k < r *c)
			{
				output[k] = mat[i][j]; //updating the result vector 
				k++; // increment the index by 1 after updating the value in the resultant vector
				if (up)
				{
					if (j == c - 1) //if we are the last column
					{
						i++; //move to the next row
						up = false; // change the direction 
					}
					else if (i == 0) //if we are hitting the top row
					{
						j++; //move to the next column
						up = false; //change the direction
					}
					else 
					{
						i--;
						j++;
					}
				}
				else
				{
					if (i == r - 1) //if we are hitting the last row
					{
						j++; // move to the next column
						up = true; //change direction
					}
					else if (j == 0)
					{
						i++; // move to the next row
						up = true; //change direction
					}
					else
					{
						i++; 
						j--;
					}
				}
			}
			return output;
		}
};


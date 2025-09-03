// Time complexity- O(n), n= length of input array
// Space complexity- O(1)
function productExceptSelf(nums: number[]): number[] {
	let result = new Array(nums.length).fill(1);

	let rp = 1;
	// left pass
	for (let i = 1; i < nums.length; i++) {
		rp *= nums[i - 1];
		result[i] *= rp;
	}

	rp = 1;
	// right pass
	for (let j = nums.length - 2; j >= 0; j--) {
		rp *= nums[j + 1];
		result[j] *= rp;
	}

	return result;
}

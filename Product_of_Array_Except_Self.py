class Solution:
    # bruteforce
    def productExceptSelf_b(self, nums: List[int]) -> List[int]:
        if not nums:
            return
        n = len(nums)
        l, r, ans = [0] * n, [0] * n, [0] * n

        l[0] = 1
        for i in range(1, n):
            l[i] = nums[i - 1] * l[i - 1]

        r[n - 1] = 1
        for i in reversed(range(n - 1)):
            r[i] = nums[i + 1] * r[i + 1]

        for i in range(n):
            ans[i] = l[i] * r[i]
        return ans

    # optimizaedarray
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return
        n = len(nums)
        l, r, ans = [0] * n, [0] * n, [0] * n

        l[0] = 1

        for i in range(1, n):
            l[i] = nums[i - 1] * l[i - 1]

        r = 1
        for i in range(n - 1, -1, -1):
            l[i] = r * l[i]
            r = nums[i] * r

        return l

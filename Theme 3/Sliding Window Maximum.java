class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int[] ans = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            if (i % k == 0)
                lmax[i] = nums[i];
            else
                lmax[i] = Math.max(lmax[i - 1], nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || (i + 1) % k == 0)
                rmax[i] = nums[i];
            else
                rmax[i] = Math.max(rmax[i + 1], nums[i]);
        }

        for (int i = 0; i <= n - k; i++) {
            ans[i] = Math.max(rmax[i], lmax[i + k - 1]);
        }

        return ans;
    }
}

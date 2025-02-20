class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] + nums[i] == target) {
                arr[0] = i - 1;
                arr[1] = i;
                return arr;
            }
        }
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}

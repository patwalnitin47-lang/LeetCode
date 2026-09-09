class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = bs1(nums, target);
        int last = bs2(nums, target);

        return new int[]{first, last};
    }

   
    public int bs1(int[] nums, int t) {
        int low = 0, high = nums.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == t) {
                first = mid;
                high = mid - 1;   // keep searching on left
            } else if (nums[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return first;
    }

    public int bs2(int[] nums, int t) {
        int low = 0, high = nums.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == t) {
                last = mid;
                low = mid + 1;    // keep searching on right
            } else if (nums[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return last;
    }
}
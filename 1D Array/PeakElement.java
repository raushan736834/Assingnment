package Assignment;

public class PeakElement {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 3, 2, 1 };
        int peak = findPeakElement(nums);
        System.out.println(peak);
    }

    static int findPeakElement(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
                int mid = l + (h - l) / 2;
                if (mid == 0 && nums[mid] > nums[mid + 1]) {
                    return mid;
                } else if (mid == nums.length - 1 && nums[mid] > nums[mid - 1]) {
                    return mid;
                }
                if (nums[mid] < nums[mid + 1]) {
                    l = mid + 1;
                } else if (nums[mid] < nums[mid - 1]) {
                    h = mid -1;
                }else if (nums[mid] > nums[mid+1] && nums[mid] > nums[mid - 1]) {
                    return mid;
                }
        }
        return -1;
    }
}

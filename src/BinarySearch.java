public class BinarySearch {
    public static void main(String[] args) {
        // output should be 4
        System.out.println(new BinarySearch().search(new int[]{-1,0,3,5,9,12}, 9));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int middle = left + (right - left) / 2;

            if (target == nums[middle]) {
                return middle;
            }
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }

        return -1;
    }
}

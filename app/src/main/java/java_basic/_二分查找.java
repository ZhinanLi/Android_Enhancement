package java_basic;

/**
 * on 2020/6/4
 */
public class _二分查找 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        binarySearch(arr, 7);
    }

    private static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) return target;
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;

        while (left < right) {
            mid = (right - left) / 2 + left;

            if (target == arr[mid]) return mid;

            if (target < arr[left] && left < right) {
                if (target < arr[mid] && target > arr[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid] && target < arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return mid;
    }
}

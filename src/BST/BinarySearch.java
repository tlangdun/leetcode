package BST;

import java.util.List;

public class BinarySearch {
    public static int binarySearch(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) { // <= here because left and right could point to the same element, < would miss it
            int mid = left + (right - left) / 2; // use `(right - left) /2` to prevent `left + right` potential overflow
            // found target, return its index
            if (arr.get(mid) == target) return mid;
            if (arr.get(mid) < target) {
                // middle less than target, discard left half by making left search boundary `mid + 1`
                left = mid + 1;
            } else {
                // middle greater than target, discard right half by making right search boundary `mid - 1`
                right = mid - 1;
            }
        }
        return -1; // if we get here we didn't hit above return so we didn't find target
    }


    /**Find Boundary
     * An array of boolean values is divided into two sections; the left section consists of all false and the right section consists of all true. Find the boundary of the right section, i.e. the index of the first true element. If there is no true element, return -1.
     *
     * Input: arr = [false, false, true, true, true]
     *
     * Output: 2
     */

    public static int findBoundary(boolean[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid]) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }



}

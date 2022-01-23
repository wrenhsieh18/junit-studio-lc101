package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        for (int i = 0; i < sortedNumbers.length-1; i++) {
            if (sortedNumbers[i] > sortedNumbers[i+1]) {
                throw new IllegalArgumentException("The array is not sorted.");
            }
        }
        int right = sortedNumbers.length - 1;
        int left = 0;
        if (sortedNumbers[right] == n) {
            return right;
        } else if (sortedNumbers[left] == n) {
            return left;
        }
        while (right != left) {
            int mid = (right - left) / 2;
            if (sortedNumbers[mid] > n) {
                right = mid;
            } else if (sortedNumbers[mid] < n) {
                left = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

}

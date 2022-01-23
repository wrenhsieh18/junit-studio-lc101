package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    @Test(expected = IllegalArgumentException.class)
    public void inputUnsortedArrayFoundNumberReturnException() {
        BonusBinarySearch.binarySearch(new int[] {30, 10, 20}, 0);
        fail("The input array must be sorted before being inputted.");
    }

    @Test
    public void inputSortedArrayFoundNumberAtFirstReturnIndex() {
        assertEquals(0, BonusBinarySearch.binarySearch(new int[]{10, 20, 30, 40, 50}, 10) );
    }

    @Test
    public void inputSortedArrayFoundNumberAttheEndReturnIndex() {
        assertEquals(4, BonusBinarySearch.binarySearch(new int[]{10, 20, 30, 40, 50}, 50) );
    }

    @Test
    public void inputSortedArrayFoundNumberIntheMiddleReturnIndex() {
        assertEquals(2, BonusBinarySearch.binarySearch(new int[]{10, 30, 30, 30, 50}, 30) );
    }

    @Test
    public void inputSortedArrayNotFoundNumberReturnNegativeOne() {
        assertEquals(-1, BonusBinarySearch.binarySearch(new int[]{10, 20, 30, 40, 50}, 5) );
    }


}

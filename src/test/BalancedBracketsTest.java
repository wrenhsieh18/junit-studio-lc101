package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test"));
    }

    @Test
    public void onlyManyPairsOfBracketsWithCorrectOrdersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void onlyManyPairsOfBracketsWithIncorrectNumReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][][]"));
    }

    @Test
    public void onlyBracketsWithCorrectOrdersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsWithIncorrectOrdersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyBracketsWithIncorrectNumReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void bracketsWithOtherCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void manyPairsOfbracketsWithOtherCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[t[e][s]t]"));
    }

    @Test
    public void wrongNumbersOfBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test[gs]]"));
    }

    @Test
    public void wrongOrderOfBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test["));
    }






}

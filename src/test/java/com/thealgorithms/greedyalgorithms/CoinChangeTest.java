package com.thealgorithms.greedyalgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinChangeTest {
    @Test
    public void testCoinChangeProblemWithValidAmount() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(500, 50, 20, 10, 10, 1));
        ArrayList<Integer> coins = CoinChange.coinChangeProblem(591);
        assertEquals(expected, coins);
    }

    @Test
    public void testCoinChangeProblemWithLargeAmount() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2000));
        ArrayList<Integer> coins = CoinChange.coinChangeProblem(2000);
        assertEquals(expected, coins);
    }

    @Test
    public void testCoinChangeProblemWithSmallAmount() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,1));
        ArrayList<Integer> coins = CoinChange.coinChangeProblem(3);
        assertEquals(expected, coins);
    }

}

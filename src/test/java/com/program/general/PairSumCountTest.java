package com.program.general;

import com.sandeep.general.FindSecondLargestElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairSumCountTest {

    @Test
    public void test_happyPath() {
        int [] numbs = {1, 5, 3, 3,3};
        int actual = PairSumCount.numberOfPairs(numbs,6);
        Assertions.assertEquals(4,actual);
    }
}

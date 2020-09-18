package com.technogise.test.decider;

import com.technogise.test.decider.ColumnDecider;
import org.junit.Assert;
import org.junit.Test;

public class ColumnDeciderTest {

    @Test
    public void testCanMoveRightTrue() {
        Assert.assertTrue(ColumnDecider.canMoveRight('G',1));
    }

    @Test
    public void testCanMoveRightFalse() {
        Assert.assertFalse(ColumnDecider.canMoveRight('G', 3));
    }

    @Test
    public void testCanMoveLeftTrue() {
        Assert.assertTrue(ColumnDecider.canMoveLeft('B',1));
    }

    @Test
    public void testCanMoveLeftFalse() {
        Assert.assertFalse(ColumnDecider.canMoveLeft('B',3));
    }


}

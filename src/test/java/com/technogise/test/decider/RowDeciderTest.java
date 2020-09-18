package com.technogise.test.decider;

import com.technogise.test.decider.RowDecider;
import org.junit.Assert;
import org.junit.Test;

public class RowDeciderTest {

    @Test
    public void testCanMoveUpTrue() {
        Assert.assertTrue(RowDecider.canMoveUp(7,1));
    }

    @Test
    public void testCanMoveUpFalse() {
        Assert.assertFalse(RowDecider.canMoveUp(7,3));
    }

    @Test
    public void testCanMoveDownTrue() {
        Assert.assertTrue(RowDecider.canMoveDown(2,1));
    }

    @Test
    public void testCanMoveDownFalse() {
        Assert.assertFalse(RowDecider.canMoveDown(2,3));
    }
}

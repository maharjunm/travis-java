package com.tw.travis;

import org.junit.Assert;
import org.junit.Test;

public class GCDFinderTest {

    @Test
    public void shouldReturn1For1asGCD() {
        GCDFinder gcdFinder = new GCDFinder();

        Assert.assertEquals(gcdFinder.gcd(1,1), 1);
    }

    @Test
    public void shouldReturn1For2asGCD() {
        GCDFinder gcdFinder = new GCDFinder();

        Assert.assertEquals(gcdFinder.gcd(2,1), 1);
    }

    @Test
    public void shouldReturn1For2And1asGCD() {
        GCDFinder gcdFinder = new GCDFinder();

        Assert.assertEquals(gcdFinder.gcd(1,2), 1);
    }

    @Test
    public void shouldReturn2For14And36asGCD() {
        GCDFinder gcdFinder = new GCDFinder();

        Assert.assertEquals(gcdFinder.gcd(14,36), 2);
    }

    @Test
    public void shouldReturn21For14And36asGCD() {
        GCDFinder gcdFinder = new GCDFinder();

        Assert.assertEquals(gcdFinder.gcd(147,105), 21);
    }
}

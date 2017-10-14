package Roman;

import org.junit.Assert;
import org.junit.Test;

public class TranslatorTest {

    Translator roman = new Translator();

    @Test
    public void testUnit() {
        Assert.assertEquals(1, roman.translate("I"));
        Assert.assertEquals(5, roman.translate("V"));
        Assert.assertEquals(10, roman.translate("X"));
        Assert.assertEquals(50, roman.translate("L"));
        Assert.assertEquals(100, roman.translate("C"));
        Assert.assertEquals(500, roman.translate("D"));
        Assert.assertEquals(1000, roman.translate("M"));
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(2, roman.translate("II"));
        Assert.assertEquals(6, roman.translate("VI"));
        Assert.assertEquals(11, roman.translate("XI"));
        Assert.assertEquals(60, roman.translate("LX"));
        Assert.assertEquals(150, roman.translate("CL"));
        Assert.assertEquals(600, roman.translate("DC"));
        Assert.assertEquals(1500, roman.translate("MD"));
    }

    @Test
    public void testSub() {
        Assert.assertEquals(4, roman.translate("IV"));
    }

    @Test
    public void testAddandSub() {
        Assert.assertEquals(19, roman.translate("IXX"));
        Assert.assertEquals(49, roman.translate("XLIX"));
    }
}
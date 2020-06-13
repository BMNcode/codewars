import org.junit.Assert;
import org.junit.Test;
import resolveKata.Pin;

public class TestPin {
    @Test
    public void validPins() {
        Assert.assertEquals(true, Pin.validatePin("1234"));
        Assert.assertEquals(true, Pin.validatePin("0000"));
        Assert.assertEquals(true, Pin.validatePin("1111"));
        Assert.assertEquals(true, Pin.validatePin("123456"));
        Assert.assertEquals(true, Pin.validatePin("098765"));
        Assert.assertEquals(true, Pin.validatePin("000000"));
        Assert.assertEquals(true, Pin.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        Assert.assertEquals(false, Pin.validatePin("a234"));
        Assert.assertEquals(false, Pin.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        Assert.assertEquals(false, Pin.validatePin("1"));
        Assert.assertEquals(false, Pin.validatePin("12"));
        Assert.assertEquals(false, Pin.validatePin("123"));
        Assert.assertEquals(false, Pin.validatePin("12345"));
        Assert.assertEquals(false, Pin.validatePin("1234567"));
        Assert.assertEquals(false, Pin.validatePin("-1234"));
        Assert.assertEquals(false, Pin.validatePin("1.234"));
        Assert.assertEquals(false, Pin.validatePin("00000000"));
    }
}

import org.junit.Assert;
import org.junit.Test;
import resolveKata.ToCamelCase;

import static resolveKata.ToCamelCase.toCamelCase;

public class TestToCamelCase {

    @Test
    public void testUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        Assert.assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
}

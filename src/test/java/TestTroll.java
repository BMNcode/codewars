import org.junit.Assert;
import org.junit.Test;
import resolveKata.Troll;

public class TestTroll {
    @Test
    public void test() {
        Assert.assertEquals("Ths wbst s fr lsrs LL!",
                Troll.disemvowel("This website is for losers LOL!"));
        Assert.assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        Assert.assertEquals("Wht r y,  cmmnst?",
                Troll.disemvowel("What are you, a communist?"));
    }
}

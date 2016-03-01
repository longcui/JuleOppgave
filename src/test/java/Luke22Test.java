import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by dragon on 22-Dec-15.
 */
public class Luke22Test {

    @Test
    public void testGetNumOfOperation() throws Exception {
        Assert.assertEquals(Luke22.getNumOfOperation("abc"), 2);
    }

    @Test
    public void testGetNumOfOperation1() throws Exception {
        Assert.assertEquals(Luke22.getNumOfOperation("qywo"), 4);
    }

    @Test
    public void testGetNumOfOperation2() throws Exception {
        Assert.assertEquals(Luke22.getNumOfOperation("evdhtiqgfyvcytohqppcmdbultbnzevdbakvkcdpbatbtjlmzaolfqfqjifkoanqcznmbqbeswglgrzfroswgxoritbw"), 4);
    }
}
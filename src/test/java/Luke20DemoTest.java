import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by dragon on 20-Dec-15.
 */
public class Luke20DemoTest {
    private Luke20Demo luke20Demo;

    @BeforeMethod
    public void setUp() throws Exception {
        luke20Demo = new Luke20Demo();
    }

    @Test
    public void testGetTs() throws Exception {
        String input = "ADOBECODECBFANETS";
        luke20Demo.calculation(input);
        int[] ts = luke20Demo.getTs();
        for (int i : ts) {
            System.out.println(i);
        }
        Arrays.sort(ts);
        Assert.assertEquals(input.substring(ts[0], ts[ts.length - 1] + 1), "CBFA");

    }
}
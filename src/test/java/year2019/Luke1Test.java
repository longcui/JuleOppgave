package year2019;



import org.junit.Test;
import org.testng.Assert;

import java.io.IOException;
import java.net.MalformedURLException;


public class Luke1Test {

    @Test
    public void test() throws IOException {
        String s = Luke1.readString("https://knowit-julekalender.s3.eu-central-1.amazonaws.com/sau.txt");
        System.out.println(s);
    }

    @Test
    public void test1() throws IOException {
        String string = Luke1.readString("https://knowit-julekalender.s3.eu-central-1.amazonaws.com/sau.txt");
        String[] lambs = string.split(",");
        Assert.assertEquals(7602, Luke1.calculateSurvivalDays(lambs));
    }
}
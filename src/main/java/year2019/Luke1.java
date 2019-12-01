package year2019;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Luke1 {

    public static String readString(String urlName) throws IOException {
        URL url = new URL(urlName);
        Scanner scanner = new Scanner(url.openStream());
        scanner.useDelimiter("\\A");
        return scanner.next();
    }

    public int calculateSurvivalDays() {
        return calculateSurvivalDays();
    }

    public static int calculateSurvivalDays(String[] lambs) {
        int enduringDays = 0;
        int leftOverLambs = 0;
        int dragonSize = 50;
        int livingDays = 0;
        for (String lambStr : lambs) {
            int lamb = Integer.parseInt(lambStr.trim());
            System.out.println("livingDays:" + livingDays
                    + ", lamb:" + lamb
                    + ", enduringDays:" + enduringDays
                    + ", leftOverLambs:" + leftOverLambs
                    + ", dragonSize:" + dragonSize);

            if(lamb + leftOverLambs < dragonSize) {
                leftOverLambs = 0;
                enduringDays ++;
                dragonSize --;
            } else

            if(lamb + leftOverLambs >= dragonSize) {
                leftOverLambs += lamb - dragonSize;
                enduringDays = 0;
                dragonSize ++;
            }

            if(enduringDays > 4) {
                return livingDays;
            }

            livingDays ++;

        }
        return livingDays;
    }

}

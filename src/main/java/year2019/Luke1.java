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

/*
# Drageproblemer

Av: Sverre Johann Bjørke

Taenerys Dargaryen og dragen hennes har landet på en liten øy. Øya har få ressurser, med unntak av sauene som den lokale befolkningen lever av. For å ikke selv bli spist, setter de lokale i gang en aggressiv saueoppdrett slik at de hver dag kan gi en mengde sauer til dragen. I det de ankommer er dragen 50 enheter stor, og trenger derfor 50 sauer for å vokse seg større. Om den får dette blir den en enhet større neste dag, og trenger da en sau mer. Om det en dag er sauer til overs, blir disse overført til neste dags offer. Om det er for lite sauer en dag spiser dragen alle men krymper likevel en størrelse. Den påfølgende dagen trenger den da en mindre sau. Om dragen får for lite mat fem dager på rad, går dragen berserk og spiser alle på øya.

## Oppgave
[I denne filen ](https://gist.github.com/knowitkodekalender/77bf7dcec241844784beb797d356a23d)er antall sauer som er tilgjengelige for hver dag, seprarert med komma.  **Hvor mange dager overlever befolkningen?**

## Eksempel

Gitt en saueforsyning som dette `50, 52, 52, 49, 50, 47, 45, 43, 50, 55` skjer følgende:

Dag 1 - Dragen spiser nok og vokser en størrelse.
Dag 2 - Dragen spiser nok og vokser en størrelse. En sau til overs overført til neste dag.
Dag 3 - Dragen spiser nok og vokser en størrelse. En sau til overs overført til neste dag.
Dag 4 - Dragen spiser for lite mat og krymper en størrelse.
Dag 5 - Dragen spiser for lite mat og krymper en størrelse.
Dag 6 - Dragen spiser for lite mat og krymper en størrelse.
Dag 7 - Dragen spiser for lite mat og krymper en størrelse.
Dag 8 - Dragen spiser for lite mat for femte dag på rad og spiser alle.

Befolkningen på øya overlevde altså i **7** dager.
 */
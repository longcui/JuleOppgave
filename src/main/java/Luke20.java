/**
 * Created by dragon on 20-Dec-15.
 */
public class Luke20 {
    public Luke20() {
        ts = new int[5];
        results = new int[3];
        results[0] = Integer.MAX_VALUE;
        results[1] = Integer.MIN_VALUE;
        results[2] = Integer.MAX_VALUE;     //length
    }

    public int[] getTs() {
        return ts;
    }

    private int[] ts;

    private int[] results;
    private boolean readyForResults = false;

    public int[] getResults() {
        return results;
    }

    private void checkResults() {
        if (!readyForResults) {
            for (int t : ts) {
                if (t == 0) {
                    return;
                }
            }
            readyForResults = true;
            checkResults();
        }

        int[] tmpResults = new int[3];
        tmpResults[0] = Integer.MAX_VALUE;
        tmpResults[1] = Integer.MIN_VALUE;
        tmpResults[2] = 0;     //length
        for (int t : ts) {
            if(t < tmpResults[0]) {
                tmpResults[0] = t;
            }

            if(t > tmpResults[1]) {
                tmpResults[1] = t;
            }
        }
        tmpResults[2] = tmpResults[1] - tmpResults[0];
        if(tmpResults[2] < 0){
            System.out.println("error");
        }
        if(tmpResults[2] < results[2]){
            results[0] = tmpResults[0];
            results[1] = tmpResults[1];
            results[2] = tmpResults[2];
        }



    }


    public void calculation(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                if (ts[0] < ts[4]) {
                    ts[0] = i;
                } else {
                    ts[4] = i;
                }
                checkResults();
            } else if (input.charAt(i) == 'B') {
                ts[1] = i;
                checkResults();
            } else if (input.charAt(i) == 'C') {
                ts[2] = i;
                checkResults();
            } else if (input.charAt(i) == 'D') {
                ts[3] = i;
                checkResults();
            }
        }
    }

}

import java.util.Arrays;

/**
 * Created by dragon on 23-Dec-15.
 */
public class Luke23 {

    public static String getResult(int[] input){
        String ret = "";
        Arrays.sort(input);
        int length = input.length;
        while(input[length - 1] != 0){
            int numCnt = 0;
            int cut = -1;
            for(int i = 0; i < length; i ++){
                if(input[i] > 0){
                    if(cut == -1) {
                        cut = input[i];
                    }
                    input[i] -= cut;
                    numCnt ++;
                }
            }
            ret += numCnt + ",";
            System.out.println(Arrays.toString(input));
        }
        return ret;
    }
}

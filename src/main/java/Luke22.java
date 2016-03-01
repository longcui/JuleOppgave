/**
 * Created by dragon on 22-Dec-15.
 */
public class Luke22 {

    public static int getNumOfOperation(String input){
        int ret = 0;
        int halfLen = input.length() / 2;
        for(int i = 0; i < halfLen; i ++){
            ret += Math.abs(input.charAt(i) - input.charAt(input.length() - i - 1));
        }
        return ret;
    }
}

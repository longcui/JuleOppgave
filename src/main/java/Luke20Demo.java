/**
 * Created by dragon on 20-Dec-15.
 */
public class Luke20Demo {

    public int[] getTs() {
        return ts;
    }

    private int[] ts = new int[3];

    public void calculation(String input){
        for(int i = 0; i < input.length(); i ++){
            if(input.charAt(i) == 'A') {
                    ts[0] = i;
            } else if(input.charAt(i) == 'B'){
                    ts[1] = i;
            }else if(input.charAt(i) == 'C') {
                    ts[2] = i;
            }
        }
    }

}

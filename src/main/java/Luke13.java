import java.util.stream.LongStream;

/**
 * Created by Longcui on 13.12.2015.
 */
public class Luke13 {

    public static void main(String[] args){
        long[] knallNumberWithin = getKnallNumberWithin(1000000);
        for (long l : knallNumberWithin) {
            System.out.println(l);
        }
    }

    public static long[] getKnallNumberWithin(long maxInput) {
        return LongStream.rangeClosed(1, maxInput).parallel()
                .filter(value -> {
                    return isKnallNumber(value);
                }).toArray();
    }

    public static boolean isKnallNumber(long input){
        if(input == 1) {
            return true;
        } else {
            while (input % 2 == 0){
                input = input / 2;
            }

            if(input == 1){
                return true;
            }

            while (input % 3 == 0){
                input = input / 3;
            }

            if(input == 1){
                return true;
            }

            while (input % 5 == 0){
                input = input / 5;
            }

            if(input == 1){
                return true;
            } else {
                return false;
            }
        }
    }
}

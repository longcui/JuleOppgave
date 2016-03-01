/**
 * Created by dragon on 19-Dec-15.
 */
public class Luke19Home {
    public static void main(String[] args){
        Luke19Home luke19Home = new Luke19Home();
        System.out.println(luke19Home.steps(30));
    }

    public static int stairs(int n) {
        if (n == 0) return 0;
        int a = 1;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int c = a;
            a = b;
            b += c;
        }
        return b;
    }

    public int steps(int n) {
        int ret = 0;
        if(n == 0){
            return 1;
        }

        if(n > 0){
            ret += steps(n - 1);
        }

        if(n > 1){
            ret += steps(n - 2);
        }

        if(n > 2){
            ret += steps(n - 3);
        }
        return ret;
    }
}

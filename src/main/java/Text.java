import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 */
public class Text {
    public static void main(String[] args) {
        int i = -123;

        int res = 0;

        while(i != 0){

            res = res*10 + i%10;

            i = i/10;

        }


        System.out.println(res);
    }
}


package Java10_6;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Tasc1 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter){
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] rezult = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()){
            rezult[i++]=stringTokenizer.nextToken();
        }
        return rezult;
    }
}

package Java10_7;

import java.util.Arrays;

public class Tasc1 {
    public static void main(String[] args) {
        String string = "Учучться, учиться и ещё раз учиться!";
        System.out.println(addTo(string, new String[]{"Под", "лежачий", "камень", "вода", "не", "течёт"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings){
        StringBuilder b = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            b.append(strings[i]);
        }
        return b;
    }

    public static StringBuilder replace(String string, String str, int start, int end){
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.replace(start,end,str);
    }
}

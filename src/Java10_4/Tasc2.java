package Java10_4;

public class Tasc2 {
    public static void main(String[] args) {
        String string ="Чтобы стать программистом, нужно писть код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastword(string, word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен -  " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        return string.indexOf(word);
    }

    public static int getIndexFromLastword(String string, String word) {
        return string.lastIndexOf(word);
    }
}

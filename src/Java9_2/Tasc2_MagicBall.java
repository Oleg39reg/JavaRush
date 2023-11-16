package Java9_2;

import java.util.Random;

public class Tasc2_MagicBall {
    private static final String CERTAIN = "Беспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошая перспектива";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ - нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
//         первый вариант решения
        String[] str = new String[]{CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD, ASK_AGAIN_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};
        Random r = new Random();
        int x = r.nextInt(str.length);

        if (x <= str.length && x >= 0) {
            return str[x];

        } else return null;


        //Второй вариант решения
//        int random = new Random().nextInt(8);
//        if (random == 0) {
//            return CERTAIN;
//        } else if (random == 1) {
//            return DEFINITELY;
//        } else if (random == 2) {
//            return MOST_LIKELY;
//        } else if (random == 3) {
//            return OUTLOOK_GOOD;
//        } else if (random == 4) {
//            return ASK_AGAIN_LATER;
//        } else if (random == 5) {
//            return TRY_AGAIN;
//        } else if (random == 6) {
//            return NO;
//        } else if (random == 7) {
//            return VERY_DOUBTFUL;
//        } else {
//            return null;
//        }


        //Третий вариант решения
//        int random = new Random().nextInt(8);
//        switch (random) {
//            case 0:
//                return CERTAIN;
//            break;
//            case 1:
//                return DEFINITELY;
//            break;
//            case 2:
//                return MOST_LIKELY;
//            break;
//            case 3:
//                return OUTLOOK_GOOD;
//            break;
//            case 4:
//                return ASK_AGAIN_LATER;
//            break;
//            case 5:
//                return TRY_AGAIN;
//            break;
//            case 6:
//                return NO;
//            break;
//            case 7:
//                return VERY_DOUBTFUL;
//            break;
//
//        }
//
//
//        return null;
    }
}


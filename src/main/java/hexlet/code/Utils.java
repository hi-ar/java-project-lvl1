package hexlet.code;

public class Utils {
    public static int getRandomNum(int limitFrom, int limitTo) {
        return (int) (limitFrom + Math.random() * limitTo);
    }
    public static int getRandomNum(int limitTo) {
        return getRandomNum(1, limitTo);
    }

}

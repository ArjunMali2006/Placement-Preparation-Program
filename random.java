import java.util.Random;

public class random {
    public static int randomBetween(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        System.out.println(randomBetween(1, 10));
    }
}
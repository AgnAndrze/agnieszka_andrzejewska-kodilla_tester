import java.util.Random;

public class WhileRandom {
    public static void main(String[] args) {
        int losowanie = getCountOfRandomNumber(49);
        System.out.println(losowanie);
    }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
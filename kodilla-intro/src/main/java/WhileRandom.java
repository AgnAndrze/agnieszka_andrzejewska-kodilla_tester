import java.util.Random;

public class WhileRandom {
    public static void main(String[] args) {
        int losowanie = getCountOfRandomNumber(98);
        System.out.println(losowanie);
    }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(50);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
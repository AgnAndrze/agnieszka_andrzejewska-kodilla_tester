import java.util.Random;

public class WhileRandom {
    public static void main(String[] args) {
        int losowanie = getCountOfRandomNumber(5000);
        System.out.println(losowanie);
    }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int maxNumber = 0;
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            if (temp>maxNumber) {
                maxNumber=temp;
            }
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 5000;
        int minNumber = 0;
        int maxNumber = 0;
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            if (temp>maxNumber) {
                maxNumber = temp;
            }
            if (temp<minNumber) {
                minNumber=temp;
            }
            sum = sum + temp;
            result++;
        }
        System.out.println("Maksymalna wylosowana liczba to: " + maxNumber);
        System.out.println("Minimalna wylosowana liczba to: " + minNumber);
    }
}
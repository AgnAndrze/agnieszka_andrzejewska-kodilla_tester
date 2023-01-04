public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[] {8, 58, 92, 37};
        System.out.println(sumNumbers(numbers));
    }
    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}
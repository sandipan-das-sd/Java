public class AvgAges {
    public static void main(String[] args) {
        int sum = 0;
        int[] num = { 10, 20, 30, 40, 50 };
        int numLength = num.length;

        for (int value : num) {
            sum += value;
        }

        int avg = sum / numLength;
        System.out.println("The average is: " + avg);
    }
}

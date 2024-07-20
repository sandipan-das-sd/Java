import java.util.Scanner;

public class ConditionSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("You entred 1");
                break;
            case 2:
                System.out.println("You entred 2");
                break;
            default:
                System.out.println("Default");
                break;
        }
        sc.close();
    }
}

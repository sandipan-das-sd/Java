import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("You entered: " + a);
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
       int  c = a + b;
       System.out.println("The summation is" + c);;

        sc.close();
    }
}

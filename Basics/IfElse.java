import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("You entred " + age);
        if (age > 18) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible");
        }
        sc.close();
    }
    
}

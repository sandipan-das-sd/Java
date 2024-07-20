import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();

       
        do {
            num++;
            System.out.println("The number is " + num);
        } while (num < 20);

        sc.close();
    }
}

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();

      
        while (num < 20) {
            num++;
            System.out.println("The number is " + num);
        }

        sc.close();
    }
}

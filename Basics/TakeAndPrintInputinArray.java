import java.util.Scanner;

public class TakeAndPrintInputinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5]; 
        
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        sc.close();
    }
}
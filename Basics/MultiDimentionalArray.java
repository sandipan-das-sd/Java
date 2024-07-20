import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int[][] multinum = new int[2][4]; 

        
        System.out.println("Value at numbers[1][2]: " + numbers[1][2]);

        Scanner sc = new Scanner(System.in);
        // Taking input for `multinum`
        System.out.println("Enter values for a 2x4 matrix:");
        for (int i = 0; i < multinum.length; i++) {
            for (int j = 0; j < multinum[i].length; j++) {
                System.out.print("Enter value for multinum[" + i + "][" + j + "]: ");
                multinum[i][j] = sc.nextInt();
            }  
        }

        // Print the values in `multinum`
        System.out.println("The numbers in multinum are:");
        for (int i = 0; i < multinum.length; i++) {
            for (int j = 0; j < multinum[i].length; j++) {
                System.out.print(multinum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

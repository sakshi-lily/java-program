import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        System.out.println("Natural numbers from 1 to " + N + ":");

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}

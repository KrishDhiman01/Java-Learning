
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Please Give Your First Number :- ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please give your Second Number :-");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int sum = a + b;
        System.out.println("The Sum of the Two Numbers is :- ");
        System.out.println(sum);

    }
}

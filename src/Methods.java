import java.util.Scanner;

public class Methods {
    static int sum(int ...ar){
        int result = 0;
        for(int a: ar){
            result += a;
        }
        return(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("The sum of the numbers is " + sum(b));
    }
}

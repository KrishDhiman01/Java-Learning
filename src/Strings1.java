import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Year :- ");
        int a = sc.nextInt();
        int b = (a%4);
        if (a == 1900){
            System.out.println("This is Not A leap Year!");
        }
        else if (b==0){
            System.out.println("This is a Leap Year!!");
        }
        else{
            System.out.println("This is Not a Leap Year!");
        }










//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please Enter Your Income :- ");
//        float a = sc.nextFloat();
//        float tax = 0;
//        if (a<=250000){
//            System.out.println("No TAX");
//        }
//        else if(a>250000 && a<=500000){
//            System.out.println("You have to Pay 5% TAX");
//            float b = (a*0.05f);
//            System.out.println("You have to Pay total " + b + " TAX");
//        }
//        else if(a>500000 && a<=1000000){
//            System.out.println("You have to Pay 20% TAX");
//            float c = (a*0.20f);
//            System.out.println("You have to Pay total " + c + " TAX");
//        }
//        else if(a>1000000){
//            System.out.println("You have to Pay 30% TAX");
//            float d = (a*0.30f);
//            System.out.println("You have to Pay total " + d + " TAX");
//        }
    }
}

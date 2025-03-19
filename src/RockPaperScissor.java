import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.print("Hello Let's Play Rock Paper Scissor");
        System.out.println(" So The Rules Are :- ");
        System.out.println("1 For Rock \n2 For Paper \n3 For Scissor");

        Random rand = new Random();
        int min = 0;
        int max = 10;
        int mynum = rand.nextInt(max - min + 1) + min;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Number :- ");
        int usernum = sc.nextInt();

        int turns = 1;
        for(;turns <= 1; turns++) {

            // Rock User Value 1
            if (mynum == 1 || mynum ==2 || mynum==3 || mynum==4 ){
                System.out.println("I Guessed Rock");
                if (usernum == 2){
                    System.out.println("Ohoo You wins!!");
                }
                else if (usernum == 1){
                    System.out.println("NOO! This is A Tie");
                }
                else if(usernum == 3){
                    System.out.println("Wow I Wins");
                }
                else{
                    System.out.println("You Entered Wrong Number");
                }

            }
            // Paper User Value 2
            else if (mynum == 5 || mynum ==6 || mynum==7 ){
                System.out.println("I Guessed Paper");
                // User Inputs
                if (usernum == 2){
                    System.out.println("NOO! This is A Tie");
                }
                else if (usernum == 3){
                    System.out.println("WOW I Wins");
                }
                else if(usernum == 1){
                    System.out.println("OHOO You Wins!");
                }
                else{
                    System.out.println("You Entered Wrong Number");
                }
            }
            // Scissor User Value 3
            else if (mynum == 8 || mynum ==9 || mynum==0 ){
                System.out.println("I Guessed Scissor");
                // User Input
                if (usernum == 2){
                    System.out.println("WOW I Wins");
                }
                else if (usernum == 1){
                    System.out.println("OHO You wins!!");
                }
                else if(usernum == 3){
                    System.out.println("NOO! This A Tie");}
                    // user enters wrong Number
                else{
                    System.out.println("You Entered Wrong Number! ");
                }
            }
        }
    }
}

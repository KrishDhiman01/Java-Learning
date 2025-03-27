import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Tasks = new ArrayList<>();

        while(true){
            System.out.println("Please Enter Your Task One by One!! and type 'exit' for stop ");
            String entry = sc.nextLine();
            if (entry.equalsIgnoreCase("exit")){
                break;
            }
            Tasks.add(entry);
        }
        System.out.println("Your Tasks Are: ");
        for (int i = 0; i < Tasks.size(); i++){
            System.out.println((i+1) + ". " + Tasks.get(i));
        }
    }
}

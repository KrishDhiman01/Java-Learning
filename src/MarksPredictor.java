import java.util.Scanner;

public class MarksPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Average of GAA :- ");
        int gaa = sc.nextInt();
        float ga = gaa * 0.2f;
        int max = 100;

        // Formula 1

        System.out.print("Please Enter Your Quiz1 Marks :- ");
        int quz1 = sc.nextInt();
        System.out.print("Please Enter Your Quiz2 Marks :- ");
        int quz2 = sc.nextInt();
        float t4 = 0; float t5 = 0; float t6 = 0; float t7 = 0; float t8= 0; float t9= 0; float t10=0;
        if (quz1 < quz2) {
            float quiz2 = quz2 * 0.2f;
            t4 = (40 - (ga + quiz2)) / 0.6f;
            t5 = (50 - (ga + quiz2)) / 0.6f;
            t6 = (60 - (ga + quiz2)) / 0.6f;
            t7 = (70 - (ga + quiz2)) / 0.6f;
            t8 = (80 - (ga + quiz2)) / 0.6f;
            t9 = (90 - (ga + quiz2)) / 0.6f;
            t10 = (100 - ga + quiz2) / 0.6f;
        }
        else if (quz1 > quz2) {
            float quiz1 = quz1 * 0.2f;
            t4 = (40 - (ga + quiz1)) / 0.6f;
            t5 = (50 - (ga + quiz1)) / 0.6f;
            t6 = (60 - (ga + quiz1)) / 0.6f;
            t7 = (70 - (ga + quiz1)) / 0.6f;
            t8 = (80 - (ga + quiz1)) / 0.6f;
            t9 = (90 - (ga + quiz1)) / 0.6f;
            t10 = (100 - (ga + quiz1)) / 0.6f;
        }

        // Formula 2

        float tot4 = (40 - (0.2f * quz1 + 0.3f * quz2)) / 0.4f;
        float tot5 = (50 - (0.2f * quz1 + 0.3f * quz2)) / 0.4f;
        float tot6 = (60 - (0.2f * quz1 + 0.3f * quz2)) / 0.4f;
        float tot7 = (70 - (0.2f * quz1 + 0.3f * quz2)) / 0.4f;
        float tot8 = (80 - (0.2f * quz1 + 0.3f * quz2)) / 0.4f;
        float tot9 = (90 - (0.2f * quz1 + 0.3f * quz2)) / 0.4f;
        float tot10 = (100 - (0.2f * quz1 + 0.3f * quz2)) / 0.4f;

        // Final Results Printing

        if (tot4<t4 && t4< max) {
            System.out.println("You need " + t4 + " Marks To get 4 CGPA");
        } else if (tot4>t4 && tot4<max){
            System.out.println("You need " + tot4 + " Marks To Get 4 CGPA");
        }
        if (tot5<t5 && t5< max){
            System.out.println("You need " + t5 + " Marks To get 5 CGPA");
        } else if (tot5>t5 && tot5<max) {
            System.out.println("You need " + tot5 + " Marks To Get 5 CGPA");
        }
        if (tot6<t6 && t6< max){
            System.out.println("You need " + t6 + " Marks To get 6 CGPA");
        }else if (tot6>t6 && tot6<max) {
            System.out.println("You need " + tot6 + " Marks To Get 6 CGPA");
        }
        if (tot7<t7 && t7< max){
            System.out.println("You need " + t7 + " Marks To get 7 CGPA");
        }else if (tot7>t4 && tot7<max) {
            System.out.println("You need " + tot7 + " Marks To Get 7 CGPA");
        }
        if (tot8<t8 && t8< max){
            System.out.println("You need " + t8 + " Marks To get 8 CGPA");
        }else if (tot8>t4 && tot8<max) {
            System.out.println("You need " + tot8 + " Marks To Get 8 CGPA");
        }
        if (tot9<t9 && t9< max){
            System.out.println("You need " + t9 + " Marks To get 9 CGPA");
        }else if (tot9>t4 && tot9<max) {
            System.out.println("You need " + tot9 + " Marks To Get 9 CGPA");
        }
        if (tot10<t10 && t10< max){
            System.out.println("You need " + t10 + " Marks To get 10 CGPA");
        }else if (tot10>t10 && tot10<max) {
            System.out.println("You need " + tot10 + " Marks To Get 10 CGPA");
        }
        System.out.println("Thanks To Use This :) ");
    }
}

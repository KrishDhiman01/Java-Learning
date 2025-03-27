class one{
        one(){
             System.out.println("I am One");
        }
        one(int x){
            System.out.println("I am One with int x" + x);
        }
    }
class Two extends one{
        Two(){
            System.out.println("I Am Two");
        }
        Two(int y){
            System.out.println("I am Two with Int y" + y);
        }
    }
    public class Inheritance {
    public static void main(String[] args) {
        Two ad = new Two(2);
    }
}

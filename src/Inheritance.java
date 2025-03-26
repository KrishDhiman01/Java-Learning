class one{
    int x;

    public int getX() {
            return x;
        }
    public void setX(int x){
            System.out.println("One");
            this.x = x;
        }
    public void printMe(){
            System.out.println("Class One");
        }
    }
class Two extends one{
        int y;
        public int getY(){
            return y;
        }
        public void setY(int y){
            this.y = y;
        }
    }
    public class Inheritance {
    public static void main(String[] args) {
        Two y = new Two();
        y.setY(4);
        System.out.println(y.getY());

        one x = new one();
        x.setX(5);
        System.out.println(x.getX());

    }
}

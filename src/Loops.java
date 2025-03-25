public class Loops {
    static int logic(int a,int b){
        int c = 0;
        if (a<b){
            c = a + b;
        }
        else if(a>b){
            c = a - b;
        }
        return c;
    }
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z;
        z = logic(x,y);
        System.out.println(z);
    }
}


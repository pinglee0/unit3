package lesson1;
public class example {
    public static boolean bothOdd(int n1, int n2) {
        boolean test = n1 % 2 != 0 && n2 % 2 != 0;
        if (test)
            return true;
        else
            return false;
    }
    public static boolean bothOdd2(int n1, int n2) {
        boolean test = n1 % 2 != 0 && n2 % 2 != 0;
        return test;
    }
    public static boolean bothOdd3(int n1, int n2) {
        return n1 % 2 != 0 && n2 % 2 != 0;
    }
    public static void main(String[] args){
        System.out.println(bothOdd(1,4));
        System.out.println(bothOdd(1,7));
        System.out.println(bothOdd(1,7));
    }
}
class example2 {
    public static void main(String[] args){
        int a=23,h=85,r=99;

        boolean aB= a>= 21 && a< 29;//T
        boolean hB= h>= 78 && h< 84;//F
        boolean rB= r>= 100.0;//F

        System.out.println(rB&& (hB||aB));
        System.out.println(aB||hB&&rB);

    }

}
class example3 {
    public static void main(String[] args) {
        System.out.println(quadrant(-1.3, -15));
    }
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {      // at least one coordinate equals 0
            return 0;
        }
    }
}
class example4{
    public static void main(String[] args){
        Sprite player = new Sprite(30, 50);
        Sprite another = player;
        System.out.println(player.Sx+" "+player.Sy+"\n"+another.Sx+" "+another.Sy); // true
        System.out.println(player == another);
        Sprite other = new Sprite(30, 50);
        System.out.println(player == other);

        String a = "hi";
        String b = new String("hi");
        String c = "hi";
        System.out.println(a == b); // false, different objects
        System.out.println(a == c);
        System.out.println(a.equals(b)); // true

    }
}
class Sprite{
    int Sx;
    int Sy;
    public Sprite(int x,int y){
        Sx=x;
        Sy=y;
    }
}

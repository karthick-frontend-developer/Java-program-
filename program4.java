import java.util.*;
class P4
{
    public static void main(String args[])
    {
        Random r = new Random();
        int ma=100,mi=50;
        System.out.println("5 random number generated within "+mi+ " to "+ma);
        System.out.println(r.nextInt(ma-mi+1)+mi);
        System.out.println(r.nextInt(ma-mi+1)+mi);
        System.out.println(r.nextInt(ma-mi+1)+mi);
        System.out.println(r.nextInt(ma-mi+1)+mi);
        System.out.println(r.nextInt(ma-mi+1)+mi);
        System.out.println(r.nextInt(ma-mi+1)+mi);
    }
}

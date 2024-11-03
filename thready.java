import java.util.Random;
class Square extends Thread
{
    int x;
    Square(int n)
    {
        x=n;
    }
    public void run()
    {
        int sqr=x*x;
        System.out.println("square of "+x+" = "+sqr);
    }
}
class Cube extends Thread
{
    int x;
    Cube(int n)
    {
        x=n;
    }
    public void run()
    {
        int cub=x*x;
        System.out.println("cube of "+x+" = "+cub);
    }
}
class Number extends Thread
{
    public void run()
    {
        Random r = new Random();
        for(int i=0;i<10;i++)
        {
            int rn =r.nextInt(100);
            System.out.println("Random integer "+rn);
            if(rn%2==0)
            {
                Square s = new Square(rn);
                s.start();
            }
            else
            {
                Cube c = new Cube(rn);
                c.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }
}
public class thready
{
    public static void main(String args[])
    {
        Number n = new Number();
        n.start();
    }
}

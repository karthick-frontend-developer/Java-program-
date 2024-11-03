class P9
{
    public static void main(String args[])
    {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.start();
        thread2.start();
        try
        {
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    private static void printNumber(int start,int end)
    {
        for(int i = start;i<=end;i++)
        {
             System.out.println(Thread.currentThread().getName()+";"+i);
        }
    }
}

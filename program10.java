class P10
{
    public static void main(String args[])
    {
        try
        {
            int a=10,b=0;
            int c=a/b;
            System.out.println("result ="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("divide by zero");
        }
        int ar[]={1,2,3,6,9};
        System.out.println("array value are");
        try
        {
            for (int i=0;i<=ar.length;i++)
            System.out.print(ar[i]+"");
        }
        catch(Exception e)
        {
            System.out.println("array out of bound");
        }
        String str1="suaygd";
        try
        {
            int x=Integer.parseInt(str1);
        }
        catch(NumberFormatException e)
        {
            System.out.println("number format exception");
        }
        try
        {
            int[] array= new int[-1];
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Negative Array Exception");
        }
    }
}

import java.io.*;
class Primec
{
    public static void main(String args[])throws IOException
    {
        int n,j,i,c;
        System.out.print("Enter a integer ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        System.out.println("Prime number 1 to "+n+" are");
        for(i=1;i<=n;i++)
        {
            c=0;
            for(j=1;j<=n;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(i);
            }
        }
    }
}

import java.io.*;
class fact
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int result;
System.out.print("enter the number you want to enter");
int num=Integer.parseInt(br.readLine());
result=factorial(num);
System.out.print("factorial of a number="+result);
}
public static int factorial(int num)
{
int i,fac=1;
for(i=1;i<=num;i++)
{
fac=fac*i;
}
return fac;
}
}
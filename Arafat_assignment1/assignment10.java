import java.io.*;
class harmonic
{
public static void main(String[] args)
{
int n=3;
float sum=0,i;
for(i=1;i<=5;i++)
{
sum=sum+(1/i);
}
System.out.print("harmonic series sum="+sum);
}
}
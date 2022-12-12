import java.lang.*;
class digit
{
public static void main(String args[])
{
int s=105,d,sum=0;
while(s>0)
{
d=s%10;
sum=sum+d;
s=s/10;
}
System.out.print(sum);
}
}

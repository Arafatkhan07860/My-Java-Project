import java.lang.*;
class prime
{
public static void main(String args[]) 
{
int i=0;
for(i=1;i<=99;i++)
{
int num=0;
int count=0;
for(num=1;num<=i;num++)
{
if(i%num==0)
{
count=count+1;
}
}
if(count==2)
{
System.out.println("prime no="+i);
}
}
}
}
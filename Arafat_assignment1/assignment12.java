import java.io.*;
class conv
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter the number");
int num=Integer.parseInt(br.readLine());
String no[]={" ","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN"};
if(num<10000)
{
int tth=num/10000;
int th=(num/1000)%10;
int hund=(num/100)%10;
int one=(num/10)%10;
int unit=num%10;
System.out.print("NUMBER IN WORD="+no[tth]+" "+no[th]+" "+no[hund]+" "+no[one]+" "+no[unit]);
}
else
{
System.out.print("NUMBER NOT IN RANGE");
}
}
}

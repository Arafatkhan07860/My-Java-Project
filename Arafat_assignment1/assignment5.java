import java.io.*;
class convert
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter the number in decimal");
int num=Integer.parseInt(br.readLine());
if(num>0 && num<3000)
{
String thous[]={" ","M","MM"};
String hund[]={" ","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
String ten[]={" ","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
String one[]={" ","I","II","III","IV","V","VI","VII","VIII","XI"};
int th=num/1000;
int h=(num/100)%10;
int t=(num/10)%10;
int o=num%10;
System.out.print("ROMAN EQUIVALENT="+thous[th]+hund[h]+ten[t]+one[o]);
}
else
{
System.out.print("number is out of range");
}
}
}
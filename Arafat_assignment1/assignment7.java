import java.io.*;
class circle
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter the radius of circle");
int radius=Integer.parseInt(br.readLine());
System.out.print("enter your choice");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:System.out.println("diameter of a circle="+ 2*radius);
       break;
case 2:System.out.println("area="+ 3.14*radius*radius);
       break;
case 3:System.out.println("circumference="+ 2*3.14*radius);
       break;
case 4:System.out.println("exit");
       break;
default:System.out.println("invalid choice");
}
}
} 
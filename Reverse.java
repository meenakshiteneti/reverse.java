import java.io.*;
class reverse 
{
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in)
int n,r=0,v;
System.out.println("enter a no"); 
n=Integer.parseInt(in.readline());
for(r=0;n>0;n=n/10)
{
v=n%10;
r=r*10+v;
}
System.out.println("reversing no="+r); 
}}

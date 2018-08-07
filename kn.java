import java.util.*;
class kn
{
public static void main(String args[])
{
char a;
Scanner j=new Scanner(System.in);
a=j.next().charAt(0);
if(a=='a'||a=='i'||a=='o'||a=='e'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
{
System.out.println("entered char is vowel");
}
else 
{
System.out.println("entered char is not vowel");
}
}
}

//wajp to ask the name of the user and then welcome the user 

class P3
{
public static void main(String args[])

{
if(args.length>=1)
{
String name=args[0];
String msg="welcome"+name;
System.out.println(msg);
}
else 
{
System.out.println("U need to enter name");
}
}



}
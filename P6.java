class P6 
{
public static void main(String args[])
{
double radius=Double.parseDouble(args[0]);
if (radius>0)
{
final double PI=3.14159;
double area= PI*radius*radius;
double circum= 2*PI*radius;
System.out.println("area=" + String.format("%.2f",area));
System.out.println("circum=" + String.format("%.2f",circum));
}

else
{

System.out.println("invalid radius");

}
}




}
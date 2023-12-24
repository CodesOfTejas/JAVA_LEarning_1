//wajp to read length and breadth from the user 
//and print area and peri 0f rectangular 



class P7
{
public static void main (String args[])

{
double length =Double.parseDouble(args[0]);
double breadth =Double.parseDouble(args[1]);

if ( (length > 0.0) && (breadth > 0.0))
{ 
double area = length * breadth;
double peri =2 * (length + breadth);
System.out.println("area=" + String.format("%.2f",area));
System.out.println("perimeter=" + String.format("%.2f",peri));

}

else 
{
System.out.println("invalid input");
}
}







}
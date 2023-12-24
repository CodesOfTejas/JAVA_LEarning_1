//wajp to marks between 0 to 100 and print grade 
//m >80 --A, m> 60--B, M > 40-->C, else D


class P11
{
public static void main(String args[])
{
double marks = Double.parseDouble(args[0]);
if((marks < 0)||(marks >100))
System.out.println("invalid marks");
else if(marks > 80)
System.out.println("Grade A");
else if(marks > 60)
System.out.println("Grade B");
else if(marks > 40) 
System.out.println("Grade C");
else 
System.out.println("Grade D");

}
}

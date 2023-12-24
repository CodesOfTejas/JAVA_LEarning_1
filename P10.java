//wajp to read age & weight of the user 
//and print if the person can done tahe blood 
//age min 25 and weight min 60


class P10 

{
public static void main(String args[])
{
double age = Double.parseDouble(args[0]);
double weight= Double.parseDouble(args[1]);

if ((age>=25.0) && (weight>=60.0)
)
System.out.println("you can donate the blood , thanks ");

else 
System.out.println("you can not donate the blood , because you are not satisfying the conditions");


}
}
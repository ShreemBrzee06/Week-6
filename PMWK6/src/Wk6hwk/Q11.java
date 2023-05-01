package Wk6hwk;
/*Write a Java program to compute the specified expressions and print the output. Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889

* */
public class Q11
{
   static double a = 3.5, e =25.5, f = 40.5, g = 4.5;


    public static void main(String[] args)
    {
        double h = ((e*a-a*a)/(f-g));
        System.out.println("Expected Output:" +" "+h);

    }



}

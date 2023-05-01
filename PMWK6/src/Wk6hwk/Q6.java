package Wk6hwk;
/*Write a program to enter any radius value of the circle and find out the area.
(Formula  of Area A=PI*r*r).
 * */
public class Q6
{
static double PI = 3.14; static int r = 5;

public static void main(String[]args)
{
    A();

}

public static void A ()
{   int d = (r*r);
    System.out.println("Area of circle:" + (PI*d));
}

}

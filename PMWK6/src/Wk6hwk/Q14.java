package Wk6hwk;
/*Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

 *
 */

public class Q14 {
    public static void main(String[]args){
        int a = 125, b = 24;
        int c = a+b, d = a-b, e = a*b, f = a/b, g = a%b;

        System.out.println("Input first number:" + a);
        System.out.println("Input second number:" + b);
        System.out.println("125 + 24 =" + c);
        System.out.println("125 - 24 =" + d);
        System.out.println("125 x 24 =" + e);
        System.out.println("125 / 24 =" + f);
        System.out.println("125 mod 24 =" +g);
    }

}
